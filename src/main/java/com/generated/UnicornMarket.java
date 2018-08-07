package com.generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import rx.Observable;
import rx.functions.Func1;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.3.0.
 */
public class UnicornMarket extends Contract {
    private static final String BINARY = "6060604052341561000f57600080fd5b604051602080610f808339810160405280805160008054600160a060020a031916600160a060020a03838116919091179182905591935083925016632a70d1e7306040517c010000000000000000000000000000000000000000000000000000000063ffffffff8416028152600160a060020a039091166004820152602401600060405180830381600087803b15156100a757600080fd5b5af115156100b457600080fd5b5050505050610eb8806100c86000396000f3006060604052600436106100ab5763ffffffff60e060020a6000350416630422ddf381146100b0578063134a04ea146100d757806331d0359414610106578063544447bb1461012e578063647151b51461014157806374268ff21461015c5780637bb98a68146101725780638dca7a0114610185578063af40ce2014610198578063b09b1a51146101ae578063d3419bf3146101c4578063e1c7392a146101d7578063fc0656c9146101ea575b600080fd5b34156100bb57600080fd5b6100c36101fd565b604051901515815260200160405180910390f35b34156100e257600080fd5b6100ea610258565b604051600160a060020a03909116815260200160405180910390f35b341561011157600080fd5b61011c600435610267565b60405190815260200160405180910390f35b341561013957600080fd5b6100ea610346565b341561014c57600080fd5b61015a600435602435610355565b005b341561016757600080fd5b61015a600435610561565b341561017d57600080fd5b6100ea6105e2565b341561019057600080fd5b6100ea6105f1565b34156101a357600080fd5b61015a600435610600565b34156101b957600080fd5b61015a6004356106d8565b34156101cf57600080fd5b6100ea610a23565b34156101e257600080fd5b61015a610a32565b34156101f557600080fd5b6100ea610d0e565b60008054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561023d57600080fd5b5af1151561024a57600080fd5b505050604051805191505090565b600254600160a060020a031681565b6002546000908190600160a060020a031663438e49c48460405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b15156102b457600080fd5b5af115156102c157600080fd5b505050604051805160055490925061033f9150610332908390600160a060020a031663999f4b386040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561031657600080fd5b5af1151561032357600080fd5b50505060405180519050610d1d565b829063ffffffff610d4f16565b9392505050565b600354600160a060020a031681565b600054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561039457600080fd5b5af115156103a157600080fd5b50505060405180511590506103b557600080fd5b600354600160a060020a031663818d4b5d338460405160e060020a63ffffffff8516028152600160a060020a0390921660048301526024820152604401602060405180830381600087803b151561040b57600080fd5b5af1151561041857600080fd5b50505060405180519050151561042d57600080fd5b600254600160a060020a031663b5c835928360405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b151561047557600080fd5b5af1151561048257600080fd5b505050604051805115905061049657600080fd5b600254600160a060020a0316631afed875838360405160e060020a63ffffffff851602815260048101929092526024820152604401600060405180830381600087803b15156104e457600080fd5b5af115156104f157600080fd5b505050817f1bd268f001f2758380a5a7892487d52314b589afdcda9801650cead3a21214c08260405190815260200160405180910390a280151561055d57817fba0d53156948fe5f38f8996945d3eefef1dd8044fb7dd7a32123d8d09b7164c060405160405180910390a25b5050565b600054600160a060020a0316635abaaa016040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156105a057600080fd5b5af115156105ad57600080fd5b50505060405180519050600160a060020a031633600160a060020a03161415156105d657600080fd5b6105df81610d5e565b50565b600454600160a060020a031681565b600054600160a060020a031681565b600054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561063f57600080fd5b5af1151561064c57600080fd5b505050604051805115905061066057600080fd5b600354600160a060020a031663818d4b5d338360405160e060020a63ffffffff8516028152600160a060020a0390921660048301526024820152604401602060405180830381600087803b15156106b657600080fd5b5af115156106c357600080fd5b5050506040518051905015156105d657600080fd5b6000805481908190600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561071c57600080fd5b5af1151561072957600080fd5b505050604051805115905061073d57600080fd5b600254600160a060020a031663b5c835928560405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b151561078557600080fd5b5af1151561079257600080fd5b5050506040518051905015156107a757600080fd5b600254600160a060020a031663438e49c48560405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b15156107ef57600080fd5b5af115156107fc57600080fd5b5050506040518051600354909450600160a060020a03169050636352211e8560405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b151561085157600080fd5b5af1151561085e57600080fd5b505050604051805192505060008311156109765761087b84610267565b600454600154600054929350600160a060020a0391821692635b99df7f929182169133918691166349b7a9c26040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156108d557600080fd5b5af115156108e257600080fd5b50505060405180519050878960405160e060020a63ffffffff8916028152600160a060020a039687166004820152948616602486015260448501939093529084166064840152909216608482015260a481019190915260c401602060405180830381600087803b151561095457600080fd5b5af1151561096157600080fd5b50505060405180519050151561097657600080fd5b837f212e8b3dc954652231f68c249ab2d4041b68441133110c50cf45b6ecff7bfe428460405190815260200160405180910390a2600354600160a060020a031663bcf0dd8e83338760405160e060020a63ffffffff8616028152600160a060020a0393841660048201529190921660248201526044810191909152606401600060405180830381600087803b1515610a0d57600080fd5b5af11515610a1a57600080fd5b50505050505050565b600554600160a060020a031681565b60005433600160a060020a03908116911614610a4d57600080fd5b600054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610a8c57600080fd5b5af11515610a9957600080fd5b505050604051805190501515610aae57600080fd5b600054600160a060020a031663a63f5e2a6040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610aed57600080fd5b5af11515610afa57600080fd5b50505060405180516001805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a03928316179055600054169050635abaaa016040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610b6457600080fd5b5af11515610b7157600080fd5b50505060405180516003805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a03928316179055600054169050638ba95bd66040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610bdb57600080fd5b5af11515610be857600080fd5b50505060405180516002805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0392831617905560005416905063131ee1c46040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610c5257600080fd5b5af11515610c5f57600080fd5b50505060405180516005805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0392831617905560005416905063451437ab6040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610cc957600080fd5b5af11515610cd657600080fd5b50505060405180516004805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a039290921691909117905550565b600154600160a060020a031681565b600080610d42612710610d36868663ffffffff610e4a16565b9063ffffffff610e7516565b90508091505b5092915050565b60008282018381101561033f57fe5b600254600160a060020a031663b5c835928260405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b1515610da657600080fd5b5af11515610db357600080fd5b50505060405180519050156105df57600254600160a060020a03166374268ff28260405160e060020a63ffffffff84160281526004810191909152602401600060405180830381600087803b1515610e0a57600080fd5b5af11515610e1757600080fd5b505050807f5ea1bcce7d1009a8f5578c7ae0fb858880637a891d4e67851c12e37b35f59c6360405160405180910390a250565b600080831515610e5d5760009150610d48565b50828202828482811515610e6d57fe5b041461033f57fe5b6000808284811515610e8357fe5b049493505050505600a165627a7a72305820862b75471c54d67105916cb55cb346b8edfac26977970befcf4394f80729efc10029";

    protected UnicornMarket(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected UnicornMarket(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public List<OfferAddEventResponse> getOfferAddEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("OfferAdd", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<OfferAddEventResponse> responses = new ArrayList<OfferAddEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            OfferAddEventResponse typedResponse = new OfferAddEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.unicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.priceCandy = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<OfferAddEventResponse> offerAddEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("OfferAdd", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, OfferAddEventResponse>() {
            @Override
            public OfferAddEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                OfferAddEventResponse typedResponse = new OfferAddEventResponse();
                typedResponse.log = log;
                typedResponse.unicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.priceCandy = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<OfferDeleteEventResponse> getOfferDeleteEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("OfferDelete", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList());
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<OfferDeleteEventResponse> responses = new ArrayList<OfferDeleteEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            OfferDeleteEventResponse typedResponse = new OfferDeleteEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.unicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<OfferDeleteEventResponse> offerDeleteEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("OfferDelete", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList());
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, OfferDeleteEventResponse>() {
            @Override
            public OfferDeleteEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                OfferDeleteEventResponse typedResponse = new OfferDeleteEventResponse();
                typedResponse.log = log;
                typedResponse.unicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<UnicornSoldEventResponse> getUnicornSoldEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("UnicornSold", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<UnicornSoldEventResponse> responses = new ArrayList<UnicornSoldEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            UnicornSoldEventResponse typedResponse = new UnicornSoldEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.unicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.priceCandy = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<UnicornSoldEventResponse> unicornSoldEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("UnicornSold", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, UnicornSoldEventResponse>() {
            @Override
            public UnicornSoldEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                UnicornSoldEventResponse typedResponse = new UnicornSoldEventResponse();
                typedResponse.log = log;
                typedResponse.unicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.priceCandy = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<FreeOfferEventResponse> getFreeOfferEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("FreeOffer", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList());
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<FreeOfferEventResponse> responses = new ArrayList<FreeOfferEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            FreeOfferEventResponse typedResponse = new FreeOfferEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.unicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<FreeOfferEventResponse> freeOfferEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("FreeOffer", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList());
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, FreeOfferEventResponse>() {
            @Override
            public FreeOfferEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                FreeOfferEventResponse typedResponse = new FreeOfferEventResponse();
                typedResponse.log = log;
                typedResponse.unicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public RemoteCall<Boolean> isGamePaused() {
        Function function = new Function("isGamePaused", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<String> breedingDB() {
        Function function = new Function("breedingDB", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<BigInteger> getOfferPrice(BigInteger _unicornId) {
        Function function = new Function("getOfferPrice", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> unicornToken() {
        Function function = new Function("unicornToken", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> sellUnicorn(BigInteger _unicornId, BigInteger _priceCandy) {
        Function function = new Function(
                "sellUnicorn", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId), 
                new org.web3j.abi.datatypes.generated.Uint256(_priceCandy)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> deleteOffer(BigInteger _unicornId) {
        Function function = new Function(
                "deleteOffer", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> balances() {
        Function function = new Function("balances", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> unicornManagement() {
        Function function = new Function("unicornManagement", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> revokeUnicorn(BigInteger _unicornId) {
        Function function = new Function(
                "revokeUnicorn", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> buyUnicorn(BigInteger _unicornId) {
        Function function = new Function(
                "buyUnicorn", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> prices() {
        Function function = new Function("prices", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> init() {
        Function function = new Function(
                "init", 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> candyTokenAddress() {
        Function function = new Function("candyTokenAddress", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public static RemoteCall<UnicornMarket> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _unicornManagementAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornManagementAddress)));
        return deployRemoteCall(UnicornMarket.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<UnicornMarket> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _unicornManagementAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornManagementAddress)));
        return deployRemoteCall(UnicornMarket.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static UnicornMarket load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new UnicornMarket(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static UnicornMarket load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new UnicornMarket(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static class OfferAddEventResponse {
        public Log log;

        public BigInteger unicornId;

        public BigInteger priceCandy;
    }

    public static class OfferDeleteEventResponse {
        public Log log;

        public BigInteger unicornId;
    }

    public static class UnicornSoldEventResponse {
        public Log log;

        public BigInteger unicornId;

        public BigInteger priceCandy;
    }

    public static class FreeOfferEventResponse {
        public Log log;

        public BigInteger unicornId;
    }
}
