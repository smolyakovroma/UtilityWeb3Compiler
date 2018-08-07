package com.web3example.web3;

import com.google.common.base.Stopwatch;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.custom.sec.SecP256K1Curve;
import org.web3j.crypto.ECDSASignature;
import org.web3j.crypto.Hash;
import org.web3j.crypto.Keys;
import org.web3j.crypto.Sign;
import org.web3j.utils.Assertions;
import org.web3j.utils.Numeric;
import rx.Observable;

import java.math.BigInteger;
import java.security.SignatureException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;

public class App {
    public static void main(String[] args) throws SignatureException {

        testRecoverAddressFromSignature();
    }
    public static final String PERSONAL_MESSAGE_PREFIX = "\u0019Ethereum Signed Message:\n";

    public static void testRecoverAddressFromSignature() throws SignatureException {
        //CHECKSTYLE:OFF
        String signature = "0x2c6401216c9031b9a6fb8cbfccab4fcec6c951cdf40e2320108d1856eb532250576865fbcd452bcdc4c57321b619ed7a9cfd38bd973c3e1e0243ac2777fe9d5b1b";
        //CHECKSTYLE:ON
        String address = "0x31b26e43651e9371c88af3d36c14cfd938baf4fd";
        String message = "v0G9u7huK4mJb2K1";

        String prefix = PERSONAL_MESSAGE_PREFIX + message.length();
        byte[] msgHash = Hash.sha3((prefix + message).getBytes());

        byte[] signatureBytes = Numeric.hexStringToByteArray(signature);
        byte v = signatureBytes[64];
        if (v < 27) {
            v += 27;
        }

        Sign.SignatureData sd = new Sign.SignatureData(
                v,
                (byte[]) Arrays.copyOfRange(signatureBytes, 0, 32),
                (byte[]) Arrays.copyOfRange(signatureBytes, 32, 64));


        String addressRecovered = null;
        boolean match = false;

        // Iterate for each possible key to recover
        for (int i = 0; i < 4; i++) {
//            BigInteger publicKey = Sign.recoverFromSignature(
//                    (byte) i,
//                    new ECDSASignature(new BigInteger(1, sd.getR()), new BigInteger(1, sd.getS())),
//                    msgHash);

            BigInteger publicKey =  Sign.signedMessageToKey(msgHash, sd);
            if (publicKey != null) {
                addressRecovered = "0x" + Keys.getAddress(publicKey);

                if (addressRecovered.equals(address)) {
                    match = true;
                    break;
                }
            }
        }

        System.out.println(match);
        System.out.println(address);
    }



}
