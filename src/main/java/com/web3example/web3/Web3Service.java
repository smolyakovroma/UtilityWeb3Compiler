package com.web3example.web3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.Request;
import org.web3j.protocol.core.methods.response.EthAccounts;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;

import java.io.IOException;

@Service
public class Web3Service {

    @Autowired
    Web3j web3j;

    public String getClientVersion() throws IOException {
        Web3ClientVersion web3ClientVersion = web3j.web3ClientVersion().send();
        return web3ClientVersion.getWeb3ClientVersion();
    }


}
