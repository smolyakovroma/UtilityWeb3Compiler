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
import org.web3j.tuples.generated.Tuple7;
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
public class CandyTrees extends Contract {
    private static final String BINARY = "6060604052610e10600155670de0b6b3a7640000600255600060065560006009556000600a5534156200003157600080fd5b604051602080620011a68339810160405280805160008054600160a060020a031916600160a060020a03838116919091179182905591935083925016632a70d1e7306040517c010000000000000000000000000000000000000000000000000000000063ffffffff8416028152600160a060020a039091166004820152602401600060405180830381600087803b1515620000cb57600080fd5b5af11515620000d957600080fd5b505050506200010660186709b6e64a8ec60000620001776401000000000262000417176401000000009004565b6200012960786729a2241af62c0000640100000000620004176200017782021704565b6200014c60f0674563918244f40000640100000000620004176200017782021704565b620001706102d067a688906bd8b00000640100000000620004176200017782021704565b50620002b9565b600054600160a060020a0316638f84aa096040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b1515620001d057600080fd5b5af11515620001de57600080fd5b50505060405180519050600160a060020a031633600160a060020a03161415156200020857600080fd5b60606040519081016040908152610e1084028252602080830184905260018284018190526009805490910190819055600090815260039091522081518155602082015181600101556040820151600291909101805460ff1916911515919091179055506009547f160b39130d5b9a65a6a2d5e91b0542fdd0c8eec42f4b85dd3d44344cc948d0e090838360405180848152602001838152602001828152602001935050505060405180910390a15050565b610edd80620002c96000396000f3006060604052600436106100f85763ffffffff60e060020a6000350416630422ddf381146100fd57806305aebead14610124578063081d203e146101495780630b2fce741461015c57806327dd387314610177578063525a2a241461018a57806353ff7335146101a0578063569c8662146101c25780636352211e146101d8578063669a73fb1461020a578063673e98a4146102465780638142b8d7146102655780638b956330146102815780638bf4e16d146102975780638dca7a01146102bc5780639e18eb39146102cf578063a2fcf3ed14610337578063ba158a7414610371578063ccdd5e2314610387578063e1c7392a1461039d575b600080fd5b341561010857600080fd5b6101106103b0565b604051901515815260200160405180910390f35b341561012f57600080fd5b61013761040b565b60405190815260200160405180910390f35b341561015457600080fd5b610137610411565b341561016757600080fd5b610175600435602435610417565b005b341561018257600080fd5b61013761053d565b341561019557600080fd5b610137600435610543565b34156101ab57600080fd5b610137600160a060020a0360043516602435610555565b34156101cd57600080fd5b610137600435610572565b34156101e357600080fd5b6101ee600435610584565b604051600160a060020a03909116815260200160405180910390f35b341561021557600080fd5b6102206004356105a2565b604051928352602083019190915215156040808301919091526060909101905180910390f35b341561025157600080fd5b610137600160a060020a03600435166105c6565b341561027057600080fd5b6101756004356024356044356105d8565b341561028c57600080fd5b6101376004356106d9565b34156102a257600080fd5b610137600160a060020a03600435166024356044356106ef565b34156102c757600080fd5b6101ee610890565b34156102da57600080fd5b6102e560043561089f565b6040518088815260200187815260200186600160a060020a0316600160a060020a0316815260200185815260200184815260200183815260200182815260200197505050505050505060405180910390f35b341561034257600080fd5b610359600160a060020a03600435166024356108e6565b60405191825260208201526040908101905180910390f35b341561037c57600080fd5b610137600435610d77565b341561039257600080fd5b610110600435610dad565b34156103a857600080fd5b610175610dc5565b60008054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156103f057600080fd5b5af115156103fd57600080fd5b505050604051805191505090565b60065481565b60025481565b600054600160a060020a0316638f84aa096040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561045657600080fd5b5af1151561046357600080fd5b50505060405180519050600160a060020a031633600160a060020a031614151561048c57600080fd5b60606040519081016040908152610e1084028252602080830184905260018284018190526009805490910190819055600090815260039091522081518155602082015181600101556040820151600291909101805460ff1916911515919091179055506009547f160b39130d5b9a65a6a2d5e91b0542fdd0c8eec42f4b85dd3d44344cc948d0e090838360405180848152602001838152602001828152602001935050505060405180910390a15050565b60015481565b60009081526004602052604090205490565b600760209081526000928352604080842090915290825290205481565b60056020526000908152604090205481565b600090815260046020526040902060020154600160a060020a031690565b60036020526000908152604090208054600182015460029092015490919060ff1683565b60086020526000908152604090205481565b60008054600160a060020a0316638f84aa096040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561061857600080fd5b5af1151561062557600080fd5b50505060405180519050600160a060020a031633600160a060020a031614151561064e57600080fd5b60008481526003602052604090206002015460ff16151561066e57600080fd5b506000838152600360205260409081902083815560018101839055907f1240b27c4bd6a340e47e766efbdb5987a4e2617323271fdf84c9e73d83964015908590859085905180848152602001838152602001828152602001935050505060405180910390a150505050565b6000908152600460208190526040909120015490565b60008054600160a060020a0316632efd56326040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561072f57600080fd5b5af1151561073c57600080fd5b50505060405180519050600160a060020a031633600160a060020a031614151561076557600080fd5b60e06040519081016040908152848252426020808401829052600160a060020a03881683850181905260608501879052608085019290925260065460a08501526000918252600881528282205460c0850152600a805460010190819055825260049052208151815560208201518160010155604082015160028201805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0392909216919091179055606082015181600301556080820151816004015560a0820151816005015560c0820151600691820155600a8054825460018082019094556000908152600560209081526040808320849055600160a060020a038b1683526007825280832060088352818420805497880190559583529490529290922091909155549150509392505050565b600054600160a060020a031681565b6004602081905260009182526040909120805460018201546002830154600384015494840154600585015460069095015493959294600160a060020a039092169390919087565b60008054819081908190819081908190600160a060020a0316632efd56326040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561093257600080fd5b5af1151561093f57600080fd5b50505060405180519050600160a060020a031633600160a060020a031614151561096857600080fd5b6000888152600460205260408120600301549095506001945085935083901115610a795760008881526004602081815260408084206003818101548652835290842054938c9052919052600101546109c59163ffffffff610e4316565b91508142106109d457816109d6565b425b60015460008a81526004602081905260409091200154919250610a1091610a0490849063ffffffff610e5d16565b9063ffffffff610e6f16565b9350610a49610a2a60015486610e8690919063ffffffff16565b60008a815260046020819052604090912001549063ffffffff610e4316565b600089815260046020819052604090912001819055600154610a7691610a0490859063ffffffff610e5d16565b92505b600254600089815260046020526040902054610aac918691610aa09163ffffffff610e8616565b9063ffffffff610e8616565b9450821515610d695760046000898152602001908152602001600020600501546004600060056000600660008154600190039190508190558152602001908152602001600020548152602001908152602001600020600501819055506005600060065481526020019081526020016000205460056000600460008c81526020019081526020016000206005015481526020019081526020016000208190555060056000600654815260200190815260200160002060009055600460008981526020019081526020016000206006015460046000600760008d600160a060020a0316600160a060020a031681526020019081526020016000206000600860008f600160a060020a0316600160a060020a031681526020019081526020016000206000815460019003919050819055815260200190815260200160002054815260200190815260200160002060060181905550600760008a600160a060020a0316600160a060020a031681526020019081526020016000206000600860008c600160a060020a0316600160a060020a0316815260200190815260200160002054815260200190815260200160002054600760008b600160a060020a0316600160a060020a031681526020019081526020016000206000600460008c815260200190815260200160002060060154815260200190815260200160002081905550600760008a600160a060020a0316600160a060020a031681526020019081526020016000206000600860008c600160a060020a0316600160a060020a03168152602001908152602001600020548152602001908152602001600020600090556004600089815260200190815260200160002060008082016000905560018201600090556002820160006101000a815490600160a060020a030219169055600382016000905560048201600090556005820160009055600682016000905550505b509297909650945050505050565b60008181526003602052604081206002015460ff161515610d9757600080fd5b5060009081526003602052604090206001015490565b60009081526003602052604090206002015460ff1690565b60005433600160a060020a03908116911614610de057600080fd5b600054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610e1f57600080fd5b5af11515610e2c57600080fd5b505050604051805190501515610e4157600080fd5b565b600082820183811015610e5257fe5b8091505b5092915050565b600082821115610e6957fe5b50900390565b6000808284811515610e7d57fe5b04949350505050565b600080831515610e995760009150610e56565b50828202828482811515610ea957fe5b0414610e5257fe00a165627a7a72305820f8405575c21fbb08b6cddb4444cd97e33894a3e9885177443a806f1ff30090cc0029";

    protected CandyTrees(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected CandyTrees(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public List<NewGardenerAddedEventResponse> getNewGardenerAddedEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("NewGardenerAdded", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<NewGardenerAddedEventResponse> responses = new ArrayList<NewGardenerAddedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewGardenerAddedEventResponse typedResponse = new NewGardenerAddedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.gardenerId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse._period = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse._price = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<NewGardenerAddedEventResponse> newGardenerAddedEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("NewGardenerAdded", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, NewGardenerAddedEventResponse>() {
            @Override
            public NewGardenerAddedEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                NewGardenerAddedEventResponse typedResponse = new NewGardenerAddedEventResponse();
                typedResponse.log = log;
                typedResponse.gardenerId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse._period = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse._price = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
                return typedResponse;
            }
        });
    }

    public List<GardenerChangeEventResponse> getGardenerChangeEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("GardenerChange", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<GardenerChangeEventResponse> responses = new ArrayList<GardenerChangeEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            GardenerChangeEventResponse typedResponse = new GardenerChangeEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.gardenerId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse._period = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse._price = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<GardenerChangeEventResponse> gardenerChangeEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("GardenerChange", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, GardenerChangeEventResponse>() {
            @Override
            public GardenerChangeEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                GardenerChangeEventResponse typedResponse = new GardenerChangeEventResponse();
                typedResponse.log = log;
                typedResponse.gardenerId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse._period = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse._price = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
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

    public RemoteCall<BigInteger> plantationSize() {
        Function function = new Function("plantationSize", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> plantedRate() {
        Function function = new Function("plantedRate", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> addGardener(BigInteger _period, BigInteger _price) {
        Function function = new Function(
                "addGardener", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_period), 
                new org.web3j.abi.datatypes.generated.Uint256(_price)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> plantedTime() {
        Function function = new Function("plantedTime", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> gardenCount(BigInteger _gardenId) {
        Function function = new Function("gardenCount", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_gardenId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> ownerPlantation(String param0, BigInteger param1) {
        Function function = new Function("ownerPlantation", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(param0), 
                new org.web3j.abi.datatypes.generated.Uint256(param1)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> plantation(BigInteger param0) {
        Function function = new Function("plantation", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> ownerOf(BigInteger _gardenId) {
        Function function = new Function("ownerOf", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_gardenId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<Tuple3<BigInteger, BigInteger, Boolean>> gardeners(BigInteger param0) {
        final Function function = new Function("gardeners", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Bool>() {}));
        return new RemoteCall<Tuple3<BigInteger, BigInteger, Boolean>>(
                new Callable<Tuple3<BigInteger, BigInteger, Boolean>>() {
                    @Override
                    public Tuple3<BigInteger, BigInteger, Boolean> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple3<BigInteger, BigInteger, Boolean>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (Boolean) results.get(2).getValue());
                    }
                });
    }

    public RemoteCall<BigInteger> ownerPlantationSize(String param0) {
        Function function = new Function("ownerPlantationSize", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> editGardener(BigInteger _gardenerId, BigInteger _period, BigInteger _price) {
        Function function = new Function(
                "editGardener", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_gardenerId), 
                new org.web3j.abi.datatypes.generated.Uint256(_period), 
                new org.web3j.abi.datatypes.generated.Uint256(_price)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> lastCropTime(BigInteger _gardenId) {
        Function function = new Function("lastCropTime", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_gardenId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> makePlant(String _owner, BigInteger _count, BigInteger _gardenerId) {
        Function function = new Function(
                "makePlant", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner), 
                new org.web3j.abi.datatypes.generated.Uint256(_count), 
                new org.web3j.abi.datatypes.generated.Uint256(_gardenerId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> unicornManagement() {
        Function function = new Function("unicornManagement", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<Tuple7<BigInteger, BigInteger, String, BigInteger, BigInteger, BigInteger, BigInteger>> gardens(BigInteger param0) {
        final Function function = new Function("gardens", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        return new RemoteCall<Tuple7<BigInteger, BigInteger, String, BigInteger, BigInteger, BigInteger, BigInteger>>(
                new Callable<Tuple7<BigInteger, BigInteger, String, BigInteger, BigInteger, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple7<BigInteger, BigInteger, String, BigInteger, BigInteger, BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple7<BigInteger, BigInteger, String, BigInteger, BigInteger, BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (String) results.get(2).getValue(), 
                                (BigInteger) results.get(3).getValue(), 
                                (BigInteger) results.get(4).getValue(), 
                                (BigInteger) results.get(5).getValue(), 
                                (BigInteger) results.get(6).getValue());
                    }
                });
    }

    public RemoteCall<TransactionReceipt> getCrop(String _owner, BigInteger _gardenId) {
        Function function = new Function(
                "getCrop", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner), 
                new org.web3j.abi.datatypes.generated.Uint256(_gardenId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> gardenerPrice(BigInteger _gardenerId) {
        Function function = new Function("gardenerPrice", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_gardenerId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<Boolean> gardenerExists(BigInteger _gardenerId) {
        Function function = new Function("gardenerExists", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_gardenerId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<TransactionReceipt> init() {
        Function function = new Function(
                "init", 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<CandyTrees> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _unicornManagementAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornManagementAddress)));
        return deployRemoteCall(CandyTrees.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<CandyTrees> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _unicornManagementAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornManagementAddress)));
        return deployRemoteCall(CandyTrees.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static CandyTrees load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new CandyTrees(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static CandyTrees load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new CandyTrees(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static class NewGardenerAddedEventResponse {
        public Log log;

        public BigInteger gardenerId;

        public BigInteger _period;

        public BigInteger _price;
    }

    public static class GardenerChangeEventResponse {
        public Log log;

        public BigInteger gardenerId;

        public BigInteger _period;

        public BigInteger _price;
    }
}
