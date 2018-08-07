package com.generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
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
import org.web3j.tuples.generated.Tuple3;
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
public class CandyLandSale extends Contract {
    private static final String BINARY = "6060604052341561000f57600080fd5b60405160208061118a8339810160405280805160008054600160a060020a031916600160a060020a03838116919091179182905591935083925016632a70d1e7306040517c010000000000000000000000000000000000000000000000000000000063ffffffff8416028152600160a060020a039091166004820152602401600060405180830381600087803b15156100a757600080fd5b5af115156100b457600080fd5b50505050506110c2806100c86000396000f3006060604052600436106100a05763ffffffff60e060020a6000350416630422ddf381146100a557806350ee6de2146100cc57806354260cb6146100fb5780637309f85114610141578063738fa7a4146101755780637bb98a68146101885780638dca7a011461019b578063aef76dda146101ae578063ced39558146101d5578063d3419bf3146101eb578063e1c7392a146101fe578063fc0656c914610211575b600080fd5b34156100b057600080fd5b6100b8610224565b604051901515815260200160405180910390f35b34156100d757600080fd5b6100df61027f565b604051600160a060020a03909116815260200160405180910390f35b341561010657600080fd5b61011d600160a060020a036004351660243561028e565b60405180848152602001838152602001828152602001935050505060405180910390f35b341561014c57600080fd5b610163600160a060020a03600435166024356105c7565b60405190815260200160405180910390f35b341561018057600080fd5b6100df61070f565b341561019357600080fd5b6100df61071e565b34156101a657600080fd5b6100df61072d565b34156101b957600080fd5b6101d3600160a060020a036004351660243560443561073c565b005b34156101e057600080fd5b6101d36004356109b5565b34156101f657600080fd5b6100df6109c2565b341561020957600080fd5b6101d36109d1565b341561021c57600080fd5b6100df610cad565b60008054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561026457600080fd5b5af1151561027157600080fd5b505050604051805191505090565b600454600160a060020a031681565b6002546000908190819081908190819081908190600160a060020a031663b2d1573f8b60405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b15156102ef57600080fd5b5af115156102fc57600080fd5b50505060405180516002549096506103d291508690600160a060020a031663dfd5dd6b6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561034d57600080fd5b5af1151561035a57600080fd5b5050506040518051600454909150600160a060020a03166370a082318e60405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b15156103b557600080fd5b5af115156103c257600080fd5b505050604051805190508c610cbc565b6005549195509350600160a060020a031663fc22c15c6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561041657600080fd5b5af1151561042357600080fd5b50505060405180519150508289111561043a578298505b6000891161044757600080fd5b8385101561059557600254600160a060020a031663ca2150058b8660405160e060020a63ffffffff8516028152600160a060020a0390921660048301526024820152604401602060405180830381600087803b15156104a557600080fd5b5af115156104b257600080fd5b50505060405180519250508415801561051d5750600554600160a060020a0316637bf9d0526040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561050557600080fd5b5af1151561051257600080fd5b505050604051805190505b156105955760025461059290600160a060020a03166393962dc1600160405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b151561056f57600080fd5b5af1151561057c57600080fd5b505050604051805184915063ffffffff610d7216565b91505b6105b56105a88a8363ffffffff610d8416565b839063ffffffff610dba16565b949a9399509397509195505050505050565b6000808083116105d657600080fd5b60025461070690600160a060020a031663b2d1573f8660405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b151561062a57600080fd5b5af1151561063757600080fd5b5050506040518051600254909150600160a060020a031663dfd5dd6b6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561068157600080fd5b5af1151561068e57600080fd5b5050506040518051600454909150600160a060020a03166370a082318860405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b15156106e957600080fd5b5af115156106f657600080fd5b5050506040518051905086610cbc565b50949350505050565b600254600160a060020a031681565b600354600160a060020a031681565b600054600160a060020a031681565b600054600160a060020a031663cf73a1bc6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561077b57600080fd5b5af1151561078857600080fd5b50505060405180519050600160a060020a031633600160a060020a03161415156107b157600080fd5b600054600160a060020a031663500569b66040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156107f057600080fd5b5af115156107fd57600080fd5b50505060405180519050151561081257600080fd5b600454600160a060020a03166332cb6b0c6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561085157600080fd5b5af1151561085e57600080fd5b50505060405180516004549091506108d1908490600160a060020a03166318160ddd6040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156108ae57600080fd5b5af115156108bb57600080fd5b505050604051805191905063ffffffff610dba16565b11156108dc57600080fd5b600254600160a060020a031663f7935969848360405160e060020a63ffffffff8516028152600160a060020a0390921660048301526024820152604401600060405180830381600087803b151561093257600080fd5b5af1151561093f57600080fd5b5050600454600160a060020a031690506340c10f19848460405160e060020a63ffffffff8516028152600160a060020a0390921660048301526024820152604401602060405180830381600087803b151561099957600080fd5b5af115156109a657600080fd5b50505060405180515050505050565b6109bf3382610dc9565b50565b600554600160a060020a031681565b60005433600160a060020a039081169116146109ec57600080fd5b600054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610a2b57600080fd5b5af11515610a3857600080fd5b505050604051805190501515610a4d57600080fd5b600054600160a060020a031663a63f5e2a6040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610a8c57600080fd5b5af11515610a9957600080fd5b50505060405180516001805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0392831617905560005416905063071467866040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610b0357600080fd5b5af11515610b1057600080fd5b50505060405180516002805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a03928316179055600054169050632efd56326040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610b7a57600080fd5b5af11515610b8757600080fd5b50505060405180516004805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0392831617905560005416905063451437ab6040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610bf157600080fd5b5af11515610bfe57600080fd5b50505060405180516003805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0392831617905560005416905063131ee1c46040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610c6857600080fd5b5af11515610c7557600080fd5b50505060405180516005805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a039290921691909117905550565b600154600160a060020a031681565b60025460009081908190610d34908690600160a060020a031663fedbceba8a60405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b1515610d1157600080fd5b5af11515610d1e57600080fd5b505050604051805191905063ffffffff610d7216565b90508084118015610d4457508587105b15610d6157610d5887600101878787610cbc565b92509250610d68565b8681925092505b5094509492505050565b600082821115610d7e57fe5b50900390565b600080831515610d975760009150610db3565b50828202828482811515610da757fe5b0414610daf57fe5b8091505b5092915050565b600082820183811015610daf57fe5b60008080808411610dd957600080fd5b600454600160a060020a03166332cb6b0c6040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610e1857600080fd5b5af11515610e2557600080fd5b5050506040518051600454909150610e75908690600160a060020a03166318160ddd6040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156108ae57600080fd5b1115610e8057600080fd5b610e8a858561028e565b600354600154600054949750929550909350600160a060020a039081169263f18d03cc928216918991166349b7a9c26040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610ee757600080fd5b5af11515610ef457600080fd5b505050604051805190508560405160e060020a63ffffffff8716028152600160a060020a0394851660048201529284166024840152921660448201526064810191909152608401602060405180830381600087803b1515610f5457600080fd5b5af11515610f6157600080fd5b505050604051805190501515610f7657600080fd5b81831015610fe557600254600160a060020a031663f7935969868460405160e060020a63ffffffff8516028152600160a060020a0390921660048301526024820152604401600060405180830381600087803b1515610fd457600080fd5b5af11515610fe157600080fd5b5050505b600454600160a060020a03166340c10f19868660405160e060020a63ffffffff8516028152600160a060020a0390921660048301526024820152604401602060405180830381600087803b151561103b57600080fd5b5af1151561104857600080fd5b50505060405180515050600160a060020a0385167f53ff98522cde14fda224941a4b9b76fe12e74793282c0cc1e741b766e353c3c28560405190815260200160405180910390a250505050505600a165627a7a72305820e9ccd8bcac2c9245813f9cfdeafc67b19b061f4eac0afd5a07a810dc9752a7660029";

    protected CandyLandSale(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected CandyLandSale(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public List<FundsTransferredEventResponse> getFundsTransferredEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("FundsTransferred", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<FundsTransferredEventResponse> responses = new ArrayList<FundsTransferredEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            FundsTransferredEventResponse typedResponse = new FundsTransferredEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.dividendManager = (String) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<FundsTransferredEventResponse> fundsTransferredEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("FundsTransferred", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, FundsTransferredEventResponse>() {
            @Override
            public FundsTransferredEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                FundsTransferredEventResponse typedResponse = new FundsTransferredEventResponse();
                typedResponse.log = log;
                typedResponse.dividendManager = (String) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public List<TokensTransferredEventResponse> getTokensTransferredEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("TokensTransferred", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<TokensTransferredEventResponse> responses = new ArrayList<TokensTransferredEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            TokensTransferredEventResponse typedResponse = new TokensTransferredEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.wallet = (String) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<TokensTransferredEventResponse> tokensTransferredEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("TokensTransferred", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, TokensTransferredEventResponse>() {
            @Override
            public TokensTransferredEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                TokensTransferredEventResponse typedResponse = new TokensTransferredEventResponse();
                typedResponse.log = log;
                typedResponse.wallet = (String) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public List<BuyLandEventResponse> getBuyLandEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("BuyLand", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<BuyLandEventResponse> responses = new ArrayList<BuyLandEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            BuyLandEventResponse typedResponse = new BuyLandEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.owner = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.count = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<BuyLandEventResponse> buyLandEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("BuyLand", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, BuyLandEventResponse>() {
            @Override
            public BuyLandEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                BuyLandEventResponse typedResponse = new BuyLandEventResponse();
                typedResponse.log = log;
                typedResponse.owner = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.count = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
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

    public RemoteCall<String> candyLand() {
        Function function = new Function("candyLand", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<Tuple3<BigInteger, BigInteger, BigInteger>> getBuyLandInfo(String _owner, BigInteger _count) {
        final Function function = new Function("getBuyLandInfo", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner), 
                new org.web3j.abi.datatypes.generated.Uint256(_count)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        return new RemoteCall<Tuple3<BigInteger, BigInteger, BigInteger>>(
                new Callable<Tuple3<BigInteger, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple3<BigInteger, BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple3<BigInteger, BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue());
                    }
                });
    }

    public RemoteCall<BigInteger> getNeededRank(String _owner, BigInteger _count) {
        Function function = new Function("getNeededRank", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner), 
                new org.web3j.abi.datatypes.generated.Uint256(_count)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> userRank() {
        Function function = new Function("userRank", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
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

    public RemoteCall<TransactionReceipt> createPresale(String _owner, BigInteger _count, BigInteger _rankIndex) {
        Function function = new Function(
                "createPresale", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner), 
                new org.web3j.abi.datatypes.generated.Uint256(_count), 
                new org.web3j.abi.datatypes.generated.Uint256(_rankIndex)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> buyLand(BigInteger _count) {
        Function function = new Function(
                "buyLand", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_count)), 
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

    public static RemoteCall<CandyLandSale> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _unicornManagementAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornManagementAddress)));
        return deployRemoteCall(CandyLandSale.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<CandyLandSale> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _unicornManagementAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornManagementAddress)));
        return deployRemoteCall(CandyLandSale.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static CandyLandSale load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new CandyLandSale(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static CandyLandSale load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new CandyLandSale(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static class FundsTransferredEventResponse {
        public Log log;

        public String dividendManager;

        public BigInteger value;
    }

    public static class TokensTransferredEventResponse {
        public Log log;

        public String wallet;

        public BigInteger value;
    }

    public static class BuyLandEventResponse {
        public Log log;

        public String owner;

        public BigInteger count;
    }
}
