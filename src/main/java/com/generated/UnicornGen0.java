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
public class UnicornGen0 extends Contract {
    private static final String BINARY = "6060604052341561000f57600080fd5b60405160208061106a8339810160405280805160008054600160a060020a031916600160a060020a03838116919091179182905591935083925016632a70d1e7306040517c010000000000000000000000000000000000000000000000000000000063ffffffff8416028152600160a060020a039091166004820152602401600060405180830381600087803b15156100a757600080fd5b5af115156100b457600080fd5b5050505050610fa2806100c86000396000f3006060604052600436106100ab5763ffffffff60e060020a6000350416630422ddf381146100b0578063134a04ea146100d7578063317ffcf2146101065780633ae50ce71461012b578063544447bb1461014d5780637bb98a68146101605780638d8d50d0146101735780638dca7a0114610186578063b66015cd14610199578063bd1723e5146101ac578063e1c7392a146101bf578063ec7bb2ac146101d4578063fc0656c9146101e7575b600080fd5b34156100bb57600080fd5b6100c36101fa565b604051901515815260200160405180910390f35b34156100e257600080fd5b6100ea610255565b604051600160a060020a03909116815260200160405180910390f35b341561011157600080fd5b610119610264565b60405190815260200160405180910390f35b341561013657600080fd5b6100c3600435600160a060020a03602435166102a6565b341561015857600080fd5b6100ea61062e565b341561016b57600080fd5b6100ea61063d565b341561017e57600080fd5b61011961064c565b341561019157600080fd5b6100ea6107ad565b34156101a457600080fd5b6100ea6107bc565b34156101b757600080fd5b6100ea6107cb565b34156101ca57600080fd5b6101d26107da565b005b34156101df57600080fd5b6101d2610b2d565b34156101f257600080fd5b6100ea610d35565b60008054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561023a57600080fd5b5af1151561024757600080fd5b505050604051805191505090565b600254600160a060020a031681565b600554600090600160a060020a031663a15404b76040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561023a57600080fd5b60008054819081908190600160a060020a031663cf73a1bc6040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156102ec57600080fd5b5af115156102f957600080fd5b50505060405180519050600160a060020a031633600160a060020a031614151561032257600080fd5b600054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561036157600080fd5b5af1151561036e57600080fd5b50505060405180519050151561038357600080fd5b600254600160a060020a0316637cd022d46040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156103c257600080fd5b5af115156103cf57600080fd5b5050506040518051600254909150610442908890600160a060020a0316638091fbe16040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561041f57600080fd5b5af1151561042c57600080fd5b505050604051805191905063ffffffff610d4416565b111561044d57600080fd5b600160a060020a038516156104625784610464565b335b9150600090505b8581101561062257600354600160a060020a031663ce5a5df78360405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b15156104c357600080fd5b5af115156104d057600080fd5b5050506040518051600154909450600160a060020a03169050631a9caab98460405160e060020a63ffffffff84160281526004810191909152602401600060405180830381600087803b151561052557600080fd5b5af1151561053257600080fd5b5050508282600160a060020a03167f51b6670023a2e348a2cb6b181f6ceed38b9ca16e2a416c7f437722cda97264d060008060405191825260208201526040908101905180910390a3600254600160a060020a0316635c752f6b6040518163ffffffff1660e060020a028152600401600060405180830381600087803b15156105ba57600080fd5b5af115156105c757600080fd5b5050600254600160a060020a0316905063de0d50e46040518163ffffffff1660e060020a028152600401600060405180830381600087803b151561060a57600080fd5b5af1151561061757600080fd5b50505060010161046b565b50600195945050505050565b600354600160a060020a031681565b600454600160a060020a031681565b600080548190600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561068e57600080fd5b5af1151561069b57600080fd5b50505060405180511590506106af57600080fd5b6106b7610264565b600454600654600054929350600160a060020a039182169263f18d03cc92918216913391166349b7a9c26040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561070f57600080fd5b5af1151561071c57600080fd5b505050604051805190508560405160e060020a63ffffffff8716028152600160a060020a0394851660048201529284166024840152921660448201526064810191909152608401602060405180830381600087803b151561077c57600080fd5b5af1151561078957600080fd5b50505060405180519050151561079e57600080fd5b6107a733610d5a565b91505090565b600054600160a060020a031681565b600554600160a060020a031681565b600154600160a060020a031681565b60005433600160a060020a039081169116146107f557600080fd5b600054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561083457600080fd5b5af1151561084157600080fd5b50505060405180519050151561085657600080fd5b600054600160a060020a031663a63f5e2a6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561089557600080fd5b5af115156108a257600080fd5b50505060405180516006805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a03928316179055600054169050635abaaa016040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561090c57600080fd5b5af1151561091957600080fd5b50505060405180516003805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a03928316179055600054169050635550e4f36040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561098357600080fd5b5af1151561099057600080fd5b50505060405180516001805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a03928316179055600054169050638ba95bd66040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156109fa57600080fd5b5af11515610a0757600080fd5b50505060405180516002805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0392831617905560005416905063131ee1c46040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610a7157600080fd5b5af11515610a7e57600080fd5b50505060405180516005805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0392831617905560005416905063451437ab6040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610ae857600080fd5b5af11515610af557600080fd5b50505060405180516004805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a039290921691909117905550565b600054600160a060020a03166386e476dd6040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610b6c57600080fd5b5af11515610b7957600080fd5b50505060405180519050600160a060020a031633600160a060020a0316141515610ba257600080fd5b600254600160a060020a031663e515a4d16040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610be157600080fd5b5af11515610bee57600080fd5b5050506040518051600254909150600160a060020a031663b30387a46040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610c3857600080fd5b5af11515610c4557600080fd5b50505060405180519050141515610c5b57600080fd5b600254600160a060020a0316633c2f7df56040518163ffffffff1660e060020a028152600401600060405180830381600087803b1515610c9a57600080fd5b5af11515610ca757600080fd5b50506002547f82a435bab9dac7abe42e365cda0c3cb0f64bf2b839af282f9e312d2d66145c849150600160a060020a031663e515a4d16040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610d0b57600080fd5b5af11515610d1857600080fd5b5050506040518051905060405190815260200160405180910390a1565b600654600160a060020a031681565b600082820183811015610d5357fe5b9392505050565b6002546000908190600160a060020a031663e515a4d16040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610d9e57600080fd5b5af11515610dab57600080fd5b5050506040518051600254909150600160a060020a031663b30387a46040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610df557600080fd5b5af11515610e0257600080fd5b50505060405180519050101515610e1857600080fd5b600354600160a060020a031663ce5a5df78460405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b1515610e6857600080fd5b5af11515610e7557600080fd5b5050506040518051600154909250600160a060020a03169050631a9caab98260405160e060020a63ffffffff84160281526004810191909152602401600060405180830381600087803b1515610eca57600080fd5b5af11515610ed757600080fd5b5050508083600160a060020a03167f51b6670023a2e348a2cb6b181f6ceed38b9ca16e2a416c7f437722cda97264d060008060405191825260208201526040908101905180910390a3600254600160a060020a0316635c752f6b6040518163ffffffff1660e060020a028152600401600060405180830381600087803b1515610f5f57600080fd5b5af11515610f6c57600080fd5b50919493505050505600a165627a7a72305820fe32d1ccf830ab7285fb7c1d99bde9b65776fb73ec35f155570dc07aa44493630029";

    protected UnicornGen0(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected UnicornGen0(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public List<CreateUnicornEventResponse> getCreateUnicornEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("CreateUnicorn", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<CreateUnicornEventResponse> responses = new ArrayList<CreateUnicornEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            CreateUnicornEventResponse typedResponse = new CreateUnicornEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.owner = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.unicornId = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.parent1 = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.parent2 = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<CreateUnicornEventResponse> createUnicornEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("CreateUnicorn", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, CreateUnicornEventResponse>() {
            @Override
            public CreateUnicornEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                CreateUnicornEventResponse typedResponse = new CreateUnicornEventResponse();
                typedResponse.log = log;
                typedResponse.owner = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.unicornId = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.parent1 = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.parent2 = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public List<NewGen0LimitEventResponse> getNewGen0LimitEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("NewGen0Limit", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<NewGen0LimitEventResponse> responses = new ArrayList<NewGen0LimitEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewGen0LimitEventResponse typedResponse = new NewGen0LimitEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.limit = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<NewGen0LimitEventResponse> newGen0LimitEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("NewGen0Limit", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, NewGen0LimitEventResponse>() {
            @Override
            public NewGen0LimitEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                NewGen0LimitEventResponse typedResponse = new NewGen0LimitEventResponse();
                typedResponse.log = log;
                typedResponse.limit = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<NewGen0StepEventResponse> getNewGen0StepEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("NewGen0Step", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<NewGen0StepEventResponse> responses = new ArrayList<NewGen0StepEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewGen0StepEventResponse typedResponse = new NewGen0StepEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.step = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<NewGen0StepEventResponse> newGen0StepEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("NewGen0Step", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, NewGen0StepEventResponse>() {
            @Override
            public NewGen0StepEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                NewGen0StepEventResponse typedResponse = new NewGen0StepEventResponse();
                typedResponse.log = log;
                typedResponse.step = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
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

    public RemoteCall<BigInteger> getCreateUnicornPrice() {
        Function function = new Function("getCreateUnicornPrice", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> createPresaleUnicorns(BigInteger _count, String _owner) {
        Function function = new Function(
                "createPresaleUnicorns", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_count), 
                new org.web3j.abi.datatypes.Address(_owner)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> unicornToken() {
        Function function = new Function("unicornToken", 
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

    public RemoteCall<TransactionReceipt> createUnicorn() {
        Function function = new Function(
                "createUnicorn", 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> unicornManagement() {
        Function function = new Function("unicornManagement", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> unicornPrices() {
        Function function = new Function("unicornPrices", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> blackBox() {
        Function function = new Function("blackBox", 
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

    public RemoteCall<TransactionReceipt> setGen0Limit() {
        Function function = new Function(
                "setGen0Limit", 
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

    public static RemoteCall<UnicornGen0> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _unicornManagementAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornManagementAddress)));
        return deployRemoteCall(UnicornGen0.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<UnicornGen0> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _unicornManagementAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornManagementAddress)));
        return deployRemoteCall(UnicornGen0.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static UnicornGen0 load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new UnicornGen0(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static UnicornGen0 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new UnicornGen0(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static class CreateUnicornEventResponse {
        public Log log;

        public String owner;

        public BigInteger unicornId;

        public BigInteger parent1;

        public BigInteger parent2;
    }

    public static class NewGen0LimitEventResponse {
        public Log log;

        public BigInteger limit;
    }

    public static class NewGen0StepEventResponse {
        public Log log;

        public BigInteger step;
    }
}
