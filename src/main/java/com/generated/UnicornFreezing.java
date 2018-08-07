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
public class UnicornFreezing extends Contract {
    private static final String BINARY = "60606040526101006040519081016040908152610e108252611c2060208301526170809082015261e10060608201526201fa4060808201526203f48060a08201526206978060c082015262093a8060e08201526200006290600590600862000177565b50610100604051908101604090815260008083526003602084015260059183019190915260096060830152600d6080830152601960a0830181905260c083015260e0820152620000b79060069060086200021a565b503415620000c457600080fd5b604051602080620017468339810160405280805160008054600160a060020a031916600160a060020a03838116919091179182905591935083925016632a70d1e7306040517c010000000000000000000000000000000000000000000000000000000063ffffffff8416028152600160a060020a039091166004820152602401600060405180830381600087803b15156200015e57600080fd5b5af115156200016c57600080fd5b50505050506200029b565b600183019183908215620002085791602002820160005b83821115620001d457835183826101000a81548163ffffffff021916908363ffffffff16021790555092602001926004016020816003010492830192600103026200018e565b8015620002065782816101000a81549063ffffffff0219169055600401602081600301049283019260010302620001d4565b505b506200021692915062000274565b5090565b600183019183908215620002085791602002820160005b83821115620001d457835183826101000a81548163ffffffff021916908360ff160217905550926020019260040160208160030104928301926001030262000231565b6200029891905b808211156200021657805463ffffffff191681556001016200027b565b90565b61149b80620002ab6000396000f3006060604052600436106100ab5763ffffffff60e060020a6000350416630422ddf381146100b0578063134a04ea146100d75780632ebfa2081461010657806335cf60df1461011e5780633900f8f6146101345780633e8eca231461014d57806353b5306b14610163578063544447bb1461018b5780638dca7a011461019e578063b66015cd146101b1578063cbde2ff0146101c4578063e1c7392a146101da578063ff8028b3146101ed575b600080fd5b34156100bb57600080fd5b6100c3610200565b604051901515815260200160405180910390f35b34156100e257600080fd5b6100ea61025b565b604051600160a060020a03909116815260200160405180910390f35b341561011157600080fd5b61011c60043561026a565b005b341561012957600080fd5b61011c6004356104c3565b341561013f57600080fd5b61011c600435602435610589565b341561015857600080fd5b61011c600435610790565b341561016e57600080fd5b610179600435610b6a565b60405190815260200160405180910390f35b341561019657600080fd5b6100ea610cea565b34156101a957600080fd5b6100ea610cf9565b34156101bc57600080fd5b6100ea610d08565b34156101cf57600080fd5b6100c3600435610d17565b34156101e557600080fd5b61011c610d85565b34156101f857600080fd5b6100ea610fea565b60008054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561024057600080fd5b5af1151561024d57600080fd5b505050604051805191505090565b600254600160a060020a031681565b600254600160a060020a031663dd1b89c68260405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b15156102b257600080fd5b5af115156102bf57600080fd5b50505060405180519050151561039357600254600354600160a060020a03918216916347e4ddf29184911663614984d18260a360405160e060020a63ffffffff851602815260048101929092526024820152604401602060405180830381600087803b151561032d57600080fd5b5af1151561033a57600080fd5b5050506040518051905060405160e060020a63ffffffff8516028152600481019290925260ff166024820152604401600060405180830381600087803b151561038257600080fd5b5af1151561038f57600080fd5b5050505b600254600160a060020a03166391256ed08260405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b15156103db57600080fd5b5af115156103e857600080fd5b50505060405180519050156104c057600254600160a060020a03166354e921cb82600060405160e060020a63ffffffff8516028152600481019290925215156024820152604401600060405180830381600087803b151561044857600080fd5b5af1151561045557600080fd5b5050600254600160a060020a03169050632b100a318261047481610ff9565b60405160e060020a63ffffffff851602815260048101929092526024820152604401600060405180830381600087803b15156104af57600080fd5b5af115156104bc57600080fd5b5050505b50565b600054600160a060020a0316631d296e8d6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561050257600080fd5b5af1151561050f57600080fd5b50505060405180519050600160a060020a031633600160a060020a031614151561053857600080fd5b600254600160a060020a03166354e921cb82600160405160e060020a63ffffffff8516028152600481019290925215156024820152604401600060405180830381600087803b15156104af57600080fd5b600061059483610b6a565b600154909150600160a060020a0316639dc29fac336105b9848663ffffffff6112bf16565b60405160e060020a63ffffffff8516028152600160a060020a0390921660048301526024820152604401602060405180830381600087803b15156105fc57600080fd5b5af1151561060957600080fd5b50505060405180519050151561061e57600080fd5b6002544290600160a060020a0316630ecda1138560405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b151561066857600080fd5b5af1151561067557600080fd5b5050506040518051905011151561068b57600080fd5b600254600454600160a060020a0391821691630985049591869161070c91879116639ea764756040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156106df57600080fd5b5af115156106ec57600080fd5b505050604051805167ffffffffffffffff1691905063ffffffff6112bf16565b60405160e060020a63ffffffff851602815260048101929092526024820152604401600060405180830381600087803b151561074757600080fd5b5af1151561075457600080fd5b505050827fb104872e32a5db292bde51a9980d0b23c6c8051fe9cb2f19478ceb0161db77878360405190815260200160405180910390a2505050565b60008054600160a060020a03166307ec4b426040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156107d057600080fd5b5af115156107dd57600080fd5b50505060405180519050600160a060020a031633600160a060020a0316148061086c5750600054600160a060020a0316639d5bf5026040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561084057600080fd5b5af1151561084d57600080fd5b50505060405180519050600160a060020a031633600160a060020a0316145b151561087757600080fd5b6108808261026a565b600254600390600160a060020a0316630c5162838460405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b15156108cb57600080fd5b5af115156108d857600080fd5b50505060405180519050101561094557600254600160a060020a031663b556a8958360405160e060020a63ffffffff84160281526004810191909152602401600060405180830381600087803b151561093057600080fd5b5af1151561093d57600080fd5b505050610a66565b600254600790600160a060020a031663f8cbd5808460405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b151561099057600080fd5b5af1151561099d57600080fd5b505050604051805190501015610a6657600254600160a060020a0316639616b4108360405160e060020a63ffffffff84160281526004810191909152602401600060405180830381600087803b15156109f557600080fd5b5af11515610a0257600080fd5b5050600254600160a060020a0316905063549ddcbd83600060405160e060020a63ffffffff851602815260048101929092526024820152604401600060405180830381600087803b1515610a5557600080fd5b5af11515610a6257600080fd5b5050505b6002544290610ad090600160a060020a031663f8cbd5808560405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b1515610ab457600080fd5b5af11515610ac157600080fd5b505050604051805190506112f5565b60025491019150600160a060020a031663883a92e1838360405160e060020a63ffffffff851602815260048101929092526024820152604401600060405180830381600087803b1515610b2257600080fd5b5af11515610b2f57600080fd5b505050817fdd9be30312ed220ed4ad7da78e6ee32d6652506b26c7de8d06e849fa224d1c5d8260405190815260200160405180910390a25050565b6002546000908190600590600160a060020a031663f8cbd5808560405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b1515610bba57600080fd5b5af11515610bc757600080fd5b5050506040518051905060088110610bdb57fe5b60088104919091015460025460079092166004026101000a900463ffffffff169150610ce3908290610cd790610c75908390600160a060020a03166365089dd88960405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b1515610c5257600080fd5b5af11515610c5f57600080fd5b505050604051805191905063ffffffff61139d16565b600454600160a060020a03166373def2b76040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610cb457600080fd5b5af11515610cc157600080fd5b505050604051805191905063ffffffff6112bf16565b9063ffffffff6113ac16565b9392505050565b600354600160a060020a031681565b600054600160a060020a031681565b600454600160a060020a031681565b6002546000904290600160a060020a0316630ecda1138460405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b1515610d6457600080fd5b5af11515610d7157600080fd5b50505060405180519050111590505b919050565b60005433600160a060020a03908116911614610da057600080fd5b600054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610ddf57600080fd5b5af11515610dec57600080fd5b505050604051805190501515610e0157600080fd5b600054600160a060020a0316635abaaa016040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610e4057600080fd5b5af11515610e4d57600080fd5b50505060405180516003805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0392831617905560005416905063a891af676040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610eb757600080fd5b5af11515610ec457600080fd5b50505060405180516001805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a03928316179055600054169050638ba95bd66040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610f2e57600080fd5b5af11515610f3b57600080fd5b50505060405180516002805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0392831617905560005416905063131ee1c46040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610fa557600080fd5b5af11515610fb257600080fd5b50505060405180516004805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a039290921691909117905550565b600154600160a060020a031681565b600061100361142c565b61100b611454565b611013611454565b600080600060a060405190810160409081526070825260756020830152607a81830152607f60608301526084608083015290965061014090519081016040908152600d825260126020830152601781830152601c606083015260216080830152602660a0830152602b60c0830152603060e08301526035610100830152603a6101208301529095506101409051908101604090815260578252605c602083015260619082015260666060820152606b6080820152608960a0820152608e60c0820152609360e08201526098610100820152609d6101208201529350600092508291505b600582101561118957600354600160a060020a031663614984d18988856005811061111d57fe5b602002015160405160e060020a63ffffffff8516028152600481019290925260ff166024820152604401602060405180830381600087803b151561116057600080fd5b5af1151561116d57600080fd5b505050604051805160ff169390930192506001909101906110f6565b600091505b600a8210156112b057600354600160a060020a031663614984d1898685600a81106111b557fe5b602002015160405160e060020a63ffffffff8516028152600481019290925260ff166024820152604401602060405180830381600087803b15156111f857600080fd5b5af1151561120557600080fd5b505050604051805160ff169150508015156112a15760035461129b90600160a060020a031663614984d18a8886600a811061123c57fe5b602002015160405160e060020a63ffffffff8516028152600481019290925260ff166024820152604401602060405180830381600087803b151561127f57600080fd5b5af1151561128c57600080fd5b505050604051805190506113c3565b60ff1690505b9182019160019091019061118e565b5050610e100295945050505050565b6000808315156112d257600091506112ee565b508282028284828115156112e257fe5b04146112ea57fe5b8091505b5092915050565b60006005826008811061130457fe5b600891828204019190066004029054906101000a900463ffffffff1663ffffffff16905060068260088110151561133757fe5b60088104919091015460079091166004026101000a900463ffffffff1615610d80576006826008811061136657fe5b60088104919091015460079091166004026101000a900463ffffffff1643600019014081151561139257fe5b06610e100201919050565b6000828201838110156112ea57fe5b60008082848115156113ba57fe5b04949350505050565b600060018260ff16106114235760bd8260ff161061141b5760e08260ff16106114135760f48260ff161061140b5760fe8260ff1610611403576005611406565b60045b61140e565b60035b611416565b60025b61141e565b60015b611426565b60005b92915050565b60a06040519081016040526005815b60008152600019909101906020018161143b5790505090565b6101406040519081016040526000815260096020820161143b5600a165627a7a72305820b29e993981079531c2f53a52761f07c795366917b7782dcd51df2a41371a8bf60029";

    protected UnicornFreezing(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected UnicornFreezing(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public List<UnicornFreezingTimeSetEventResponse> getUnicornFreezingTimeSetEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("UnicornFreezingTimeSet", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<UnicornFreezingTimeSetEventResponse> responses = new ArrayList<UnicornFreezingTimeSetEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            UnicornFreezingTimeSetEventResponse typedResponse = new UnicornFreezingTimeSetEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.unicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.time = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<UnicornFreezingTimeSetEventResponse> unicornFreezingTimeSetEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("UnicornFreezingTimeSet", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, UnicornFreezingTimeSetEventResponse>() {
            @Override
            public UnicornFreezingTimeSetEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                UnicornFreezingTimeSetEventResponse typedResponse = new UnicornFreezingTimeSetEventResponse();
                typedResponse.log = log;
                typedResponse.unicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.time = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<MinusFreezingTimeEventResponse> getMinusFreezingTimeEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("MinusFreezingTime", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<MinusFreezingTimeEventResponse> responses = new ArrayList<MinusFreezingTimeEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            MinusFreezingTimeEventResponse typedResponse = new MinusFreezingTimeEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.unicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.count = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<MinusFreezingTimeEventResponse> minusFreezingTimeEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("MinusFreezingTime", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, MinusFreezingTimeEventResponse>() {
            @Override
            public MinusFreezingTimeEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                MinusFreezingTimeEventResponse typedResponse = new MinusFreezingTimeEventResponse();
                typedResponse.log = log;
                typedResponse.unicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
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

    public RemoteCall<String> breedingDB() {
        Function function = new Function("breedingDB", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> checkFreeze(BigInteger _unicornId) {
        Function function = new Function(
                "checkFreeze", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> enableFreezePriceRateRecalc(BigInteger _unicornId) {
        Function function = new Function(
                "enableFreezePriceRateRecalc", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> minusFreezingTime(BigInteger _unicornId, BigInteger _count) {
        Function function = new Function(
                "minusFreezingTime", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId), 
                new org.web3j.abi.datatypes.generated.Uint256(_count)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> plusFreezingTime(BigInteger _unicornId) {
        Function function = new Function(
                "plusFreezingTime", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getUnfreezingPrice(BigInteger _unicornId) {
        Function function = new Function("getUnfreezingPrice", 
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

    public RemoteCall<Boolean> isUnfreezed(BigInteger _unicornId) {
        Function function = new Function("isUnfreezed", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
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

    public RemoteCall<String> megaCandyToken() {
        Function function = new Function("megaCandyToken", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public static RemoteCall<UnicornFreezing> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _unicornManagementAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornManagementAddress)));
        return deployRemoteCall(UnicornFreezing.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<UnicornFreezing> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _unicornManagementAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornManagementAddress)));
        return deployRemoteCall(UnicornFreezing.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static UnicornFreezing load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new UnicornFreezing(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static UnicornFreezing load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new UnicornFreezing(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static class UnicornFreezingTimeSetEventResponse {
        public Log log;

        public BigInteger unicornId;

        public BigInteger time;
    }

    public static class MinusFreezingTimeEventResponse {
        public Log log;

        public BigInteger unicornId;

        public BigInteger count;
    }
}
