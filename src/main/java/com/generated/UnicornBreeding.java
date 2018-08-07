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
public class UnicornBreeding extends Contract {
    private static final String BINARY = "6060604052341561000f57600080fd5b604051602080611b408339810160405280805160008054600160a060020a031916600160a060020a03838116919091179182905591935083925016632a70d1e7306040517c010000000000000000000000000000000000000000000000000000000063ffffffff8416028152600160a060020a039091166004820152602401600060405180830381600087803b15156100a757600080fd5b5af115156100b457600080fd5b5050505050611a78806100c86000396000f3006060604052600436106100cc5763ffffffff60e060020a6000350416630422ddf381146100d1578063134a04ea146100f85780631ed378a1146101275780632394a7971461014f57806323e0c50b1461016a5780632cf42a6c1461017d5780633417433114610193578063544447bb146101ac5780637bb98a68146101bf5780638dca7a01146101d2578063b66015cd146101e5578063bd1723e5146101f8578063c7024b981461020b578063da9287d114610221578063e1c7392a1461023a578063fc0656c91461024d575b600080fd5b34156100dc57600080fd5b6100e4610260565b604051901515815260200160405180910390f35b341561010357600080fd5b61010b6102bb565b604051600160a060020a03909116815260200160405180910390f35b341561013257600080fd5b61013d6004356102ca565b60405190815260200160405180910390f35b341561015a57600080fd5b61016860043560243561038b565b005b341561017557600080fd5b61010b6106d2565b341561018857600080fd5b6101686004356106e1565b341561019e57600080fd5b6101686004356024356107c5565b34156101b757600080fd5b61010b610e2d565b34156101ca57600080fd5b61010b610e3c565b34156101dd57600080fd5b61010b610e4b565b34156101f057600080fd5b61010b610e5a565b341561020357600080fd5b61010b610e69565b341561021657600080fd5b610168600435610e78565b341561022c57600080fd5b610168600435602435610eed565b341561024557600080fd5b61016861163a565b341561025857600080fd5b61010b6119a9565b60008054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156102a057600080fd5b5af115156102ad57600080fd5b505050604051805191505090565b600254600160a060020a031681565b600654600254600091600160a060020a039081169163e8474230911663020f899a8560405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b151561032257600080fd5b5af1151561032f57600080fd5b5050506040518051905060405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b151561036f57600080fd5b5af1151561037c57600080fd5b50505060405180519392505050565b600054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156103ca57600080fd5b5af115156103d757600080fd5b50505060405180511590506103eb57600080fd5b600354600160a060020a031663818d4b5d338460405160e060020a63ffffffff8516028152600160a060020a0390921660048301526024820152604401602060405180830381600087803b151561044157600080fd5b5af1151561044e57600080fd5b50505060405180519050151561046357600080fd5b600554600160a060020a031663cbde2ff08360405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b15156104ab57600080fd5b5af115156104b857600080fd5b5050506040518051905015156104cd57600080fd5b600254600160a060020a031663ee34c6ad8360405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b151561051557600080fd5b5af1151561052257600080fd5b505050604051805115905061053657600080fd5b600354600090600160a060020a031663614984d184600a60405160e060020a63ffffffff851602815260048101929092526024820152604401602060405180830381600087803b151561058857600080fd5b5af1151561059557600080fd5b5050506040518051905060ff161115156105ae57600080fd5b600554600160a060020a0316632ebfa2088360405160e060020a63ffffffff84160281526004810191909152602401600060405180830381600087803b15156105f657600080fd5b5af1151561060357600080fd5b5050600254600160a060020a031690506311f02c87838360405160e060020a63ffffffff851602815260048101929092526024820152604401600060405180830381600087803b151561065557600080fd5b5af1151561066257600080fd5b505050817f84abd4d356237b35dfca5b88dc4e394c7e9f4cb3b214adcabfabdc6fe1f5f76c8260405190815260200160405180910390a28015156106ce57817f2be3e43f2ef674b10d85513ca8bf940afa4d956bf07c710f5cb89258af357c4e60405160405180910390a25b5050565b600554600160a060020a031681565b600054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561072057600080fd5b5af1151561072d57600080fd5b505050604051805115905061074157600080fd5b600354600160a060020a031663818d4b5d338360405160e060020a63ffffffff8516028152600160a060020a0390921660048301526024820152604401602060405180830381600087803b151561079757600080fd5b5af115156107a457600080fd5b5050506040518051905015156107b957600080fd5b6107c2816119b8565b50565b600080548190600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561080757600080fd5b5af1151561081457600080fd5b505050604051805115905061082857600080fd5b600354600160a060020a031663818d4b5d338660405160e060020a63ffffffff8516028152600160a060020a0390921660048301526024820152604401602060405180830381600087803b151561087e57600080fd5b5af1151561088b57600080fd5b50505060405180519050801561090a5750600354600160a060020a031663818d4b5d338560405160e060020a63ffffffff8516028152600160a060020a0390921660048301526024820152604401602060405180830381600087803b15156108f257600080fd5b5af115156108ff57600080fd5b505050604051805190505b151561091557600080fd5b8284141561092257600080fd5b600554600160a060020a031663cbde2ff08560405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b151561096a57600080fd5b5af1151561097757600080fd5b5050506040518051905080156109e85750600554600160a060020a031663cbde2ff08460405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b15156109d057600080fd5b5af115156109dd57600080fd5b505050604051805190505b15156109f357600080fd5b600354600090600160a060020a031663614984d186600a60405160e060020a63ffffffff851602815260048101929092526024820152604401602060405180830381600087803b1515610a4557600080fd5b5af11515610a5257600080fd5b5050506040518051905060ff16118015610ad55750600354600090600160a060020a031663614984d185600a60405160e060020a63ffffffff851602815260048101929092526024820152604401602060405180830381600087803b1515610ab957600080fd5b5af11515610ac657600080fd5b5050506040518051905060ff16115b1515610ae057600080fd5b600654600160a060020a031663e51bfd9a6040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610b1f57600080fd5b5af11515610b2c57600080fd5b50505060405180519250506000821115610c2357600454600754600054600160a060020a039283169263f18d03cc928116913391166349b7a9c26040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610b9457600080fd5b5af11515610ba157600080fd5b505050604051805190508660405160e060020a63ffffffff8716028152600160a060020a0394851660048201529284166024840152921660448201526064810191909152608401602060405180830381600087803b1515610c0157600080fd5b5af11515610c0e57600080fd5b505050604051805190501515610c2357600080fd5b600554600160a060020a0316633e8eca238560405160e060020a63ffffffff84160281526004810191909152602401600060405180830381600087803b1515610c6b57600080fd5b5af11515610c7857600080fd5b5050600554600160a060020a03169050633e8eca238460405160e060020a63ffffffff84160281526004810191909152602401600060405180830381600087803b1515610cc457600080fd5b5af11515610cd157600080fd5b5050600354600160a060020a0316905063ce5a5df73360405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b1515610d2557600080fd5b5af11515610d3257600080fd5b5050506040518051600154909250600160a060020a03169050631e5d2e4182868660405160e060020a63ffffffff8616028152600481019390935260248301919091526044820152606401600060405180830381600087803b1515610d9657600080fd5b5af11515610da357600080fd5b50505082847ff74d29979ab38d16cc27c6f61b42ecd102804ed6122ba538fffbc67ea689acda838560405191825260208201526040908101905180910390a38033600160a060020a03167f51b6670023a2e348a2cb6b181f6ceed38b9ca16e2a416c7f437722cda97264d0868660405191825260208201526040908101905180910390a350505050565b600354600160a060020a031681565b600454600160a060020a031681565b600054600160a060020a031681565b600654600160a060020a031681565b600154600160a060020a031681565b600054600160a060020a0316635abaaa016040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610eb757600080fd5b5af11515610ec457600080fd5b50505060405180519050600160a060020a031633600160a060020a03161415156107b957600080fd5b60008054819081908190600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610f3357600080fd5b5af11515610f4057600080fd5b5050506040518051159050610f5457600080fd5b600354600160a060020a031663818d4b5d338760405160e060020a63ffffffff8516028152600160a060020a0390921660048301526024820152604401602060405180830381600087803b1515610faa57600080fd5b5af11515610fb757600080fd5b505050604051805190501515610fcc57600080fd5b84861415610fd957600080fd5b600554600160a060020a031663cbde2ff08760405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b151561102157600080fd5b5af1151561102e57600080fd5b50505060405180519050801561109f5750600554600160a060020a031663cbde2ff08660405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b151561108757600080fd5b5af1151561109457600080fd5b505050604051805190505b15156110aa57600080fd5b600254600160a060020a031663ee34c6ad8760405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b15156110f257600080fd5b5af115156110ff57600080fd5b50505060405180519050151561111457600080fd5b600354600090600160a060020a031663614984d188600a60405160e060020a63ffffffff851602815260048101929092526024820152604401602060405180830381600087803b151561116657600080fd5b5af1151561117357600080fd5b5050506040518051905060ff161180156111f65750600354600090600160a060020a031663614984d187600a60405160e060020a63ffffffff851602815260048101929092526024820152604401602060405180830381600087803b15156111da57600080fd5b5af115156111e757600080fd5b5050506040518051905060ff16115b151561120157600080fd5b600254600160a060020a031663020f899a8760405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b151561124957600080fd5b5af1151561125657600080fd5b5050506040518051600354909550600160a060020a03169050636352211e8760405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b15156112ab57600080fd5b5af115156112b857600080fd5b5050506040518051935050600084111561142557600654600160a060020a031663e84742308560405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b151561131457600080fd5b5af1151561132157600080fd5b5050506040518051600454600754600054929550600160a060020a039182169350635b99df7f929082169133918791166349b7a9c26040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561138457600080fd5b5af1151561139157600080fd5b50505060405180519050888a60405160e060020a63ffffffff8916028152600160a060020a039687166004820152948616602486015260448501939093529084166064840152909216608482015260a481019190915260c401602060405180830381600087803b151561140357600080fd5b5af1151561141057600080fd5b50505060405180519050151561142557600080fd5b600554600160a060020a0316633e8eca238760405160e060020a63ffffffff84160281526004810191909152602401600060405180830381600087803b151561146d57600080fd5b5af1151561147a57600080fd5b5050600554600160a060020a03169050633e8eca238660405160e060020a63ffffffff84160281526004810191909152602401600060405180830381600087803b15156114c657600080fd5b5af115156114d357600080fd5b5050600354600160a060020a0316905063ce5a5df73360405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b151561152757600080fd5b5af1151561153457600080fd5b5050506040518051600154909250600160a060020a03169050631e5d2e4182888860405160e060020a63ffffffff8616028152600481019390935260248301919091526044820152606401600060405180830381600087803b151561159857600080fd5b5af115156115a557600080fd5b50505084867ff0b757e02a273cc60dcbb8fb9fd8157b50a8c73af2a6bb8b7917d7c895482575838760405191825260208201526040908101905180910390a38033600160a060020a03167f51b6670023a2e348a2cb6b181f6ceed38b9ca16e2a416c7f437722cda97264d0888860405191825260208201526040908101905180910390a3611632866119b8565b505050505050565b60005433600160a060020a0390811691161461165557600080fd5b600054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561169457600080fd5b5af115156116a157600080fd5b5050506040518051905015156116b657600080fd5b600054600160a060020a031663a63f5e2a6040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156116f557600080fd5b5af1151561170257600080fd5b505050604051805160078054600160a060020a031916600160a060020a03928316179055600054169050635abaaa016040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561175f57600080fd5b5af1151561176c57600080fd5b505050604051805160038054600160a060020a031916600160a060020a03928316179055600054169050635550e4f36040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156117c957600080fd5b5af115156117d657600080fd5b505050604051805160018054600160a060020a031916600160a060020a03928316179055600054169050638ba95bd66040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561183357600080fd5b5af1151561184057600080fd5b505050604051805160028054600160a060020a031916600160a060020a0392831617905560005416905063131ee1c46040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561189d57600080fd5b5af115156118aa57600080fd5b505050604051805160068054600160a060020a031916600160a060020a0392831617905560005416905063451437ab6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561190757600080fd5b5af1151561191457600080fd5b505050604051805160048054600160a060020a031916600160a060020a03928316179055600054169050639d5bf5026040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561197157600080fd5b5af1151561197e57600080fd5b505050604051805160058054600160a060020a031916600160a060020a039290921691909117905550565b600754600160a060020a031681565b600254600160a060020a031663c7024b988260405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b1515611a0057600080fd5b5af11515611a0d57600080fd5b50505060405180519050156107c257807f868a9e71dfb115bed3ee872d882e85e6054c40386de4fbb9b016f78717d7b9ed60405160405180910390a2505600a165627a7a7230582089cb82f031ab7c38b14523d75cbffd491bb62c5a77069d80279e838ffbd547590029";

    protected UnicornBreeding(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected UnicornBreeding(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public List<HybridizationAddEventResponse> getHybridizationAddEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("HybridizationAdd", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<HybridizationAddEventResponse> responses = new ArrayList<HybridizationAddEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            HybridizationAddEventResponse typedResponse = new HybridizationAddEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.unicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.price = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<HybridizationAddEventResponse> hybridizationAddEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("HybridizationAdd", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, HybridizationAddEventResponse>() {
            @Override
            public HybridizationAddEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                HybridizationAddEventResponse typedResponse = new HybridizationAddEventResponse();
                typedResponse.log = log;
                typedResponse.unicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.price = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<HybridizationAcceptEventResponse> getHybridizationAcceptEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("HybridizationAccept", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<HybridizationAcceptEventResponse> responses = new ArrayList<HybridizationAcceptEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            HybridizationAcceptEventResponse typedResponse = new HybridizationAcceptEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.firstUnicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.secondUnicornId = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.newUnicornId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.price = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<HybridizationAcceptEventResponse> hybridizationAcceptEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("HybridizationAccept", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, HybridizationAcceptEventResponse>() {
            @Override
            public HybridizationAcceptEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                HybridizationAcceptEventResponse typedResponse = new HybridizationAcceptEventResponse();
                typedResponse.log = log;
                typedResponse.firstUnicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.secondUnicornId = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.newUnicornId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.price = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public List<SelfHybridizationEventResponse> getSelfHybridizationEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("SelfHybridization", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<SelfHybridizationEventResponse> responses = new ArrayList<SelfHybridizationEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            SelfHybridizationEventResponse typedResponse = new SelfHybridizationEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.firstUnicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.secondUnicornId = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.newUnicornId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.price = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<SelfHybridizationEventResponse> selfHybridizationEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("SelfHybridization", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, SelfHybridizationEventResponse>() {
            @Override
            public SelfHybridizationEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                SelfHybridizationEventResponse typedResponse = new SelfHybridizationEventResponse();
                typedResponse.log = log;
                typedResponse.firstUnicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.secondUnicornId = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.newUnicornId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.price = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public List<HybridizationDeleteEventResponse> getHybridizationDeleteEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("HybridizationDelete", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList());
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<HybridizationDeleteEventResponse> responses = new ArrayList<HybridizationDeleteEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            HybridizationDeleteEventResponse typedResponse = new HybridizationDeleteEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.unicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<HybridizationDeleteEventResponse> hybridizationDeleteEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("HybridizationDelete", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList());
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, HybridizationDeleteEventResponse>() {
            @Override
            public HybridizationDeleteEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                HybridizationDeleteEventResponse typedResponse = new HybridizationDeleteEventResponse();
                typedResponse.log = log;
                typedResponse.unicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
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

    public List<FreeHybridizationEventResponse> getFreeHybridizationEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("FreeHybridization", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList());
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<FreeHybridizationEventResponse> responses = new ArrayList<FreeHybridizationEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            FreeHybridizationEventResponse typedResponse = new FreeHybridizationEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.unicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<FreeHybridizationEventResponse> freeHybridizationEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("FreeHybridization", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList());
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, FreeHybridizationEventResponse>() {
            @Override
            public FreeHybridizationEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                FreeHybridizationEventResponse typedResponse = new FreeHybridizationEventResponse();
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

    public RemoteCall<BigInteger> getHybridizationPrice(BigInteger _unicornId) {
        Function function = new Function("getHybridizationPrice", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> makeHybridization(BigInteger _unicornId, BigInteger _price) {
        Function function = new Function(
                "makeHybridization", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId), 
                new org.web3j.abi.datatypes.generated.Uint256(_price)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> unicornFreezing() {
        Function function = new Function("unicornFreezing", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> cancelHybridization(BigInteger _unicornId) {
        Function function = new Function(
                "cancelHybridization", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> selfHybridization(BigInteger _firstUnicornId, BigInteger _secondUnicornId) {
        Function function = new Function(
                "selfHybridization", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_firstUnicornId), 
                new org.web3j.abi.datatypes.generated.Uint256(_secondUnicornId)), 
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

    public RemoteCall<TransactionReceipt> deleteHybridization(BigInteger _unicornId) {
        Function function = new Function(
                "deleteHybridization", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> acceptHybridization(BigInteger _firstUnicornId, BigInteger _secondUnicornId) {
        Function function = new Function(
                "acceptHybridization", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_firstUnicornId), 
                new org.web3j.abi.datatypes.generated.Uint256(_secondUnicornId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
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

    public static RemoteCall<UnicornBreeding> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _unicornManagementAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornManagementAddress)));
        return deployRemoteCall(UnicornBreeding.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<UnicornBreeding> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _unicornManagementAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornManagementAddress)));
        return deployRemoteCall(UnicornBreeding.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static UnicornBreeding load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new UnicornBreeding(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static UnicornBreeding load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new UnicornBreeding(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static class HybridizationAddEventResponse {
        public Log log;

        public BigInteger unicornId;

        public BigInteger price;
    }

    public static class HybridizationAcceptEventResponse {
        public Log log;

        public BigInteger firstUnicornId;

        public BigInteger secondUnicornId;

        public BigInteger newUnicornId;

        public BigInteger price;
    }

    public static class SelfHybridizationEventResponse {
        public Log log;

        public BigInteger firstUnicornId;

        public BigInteger secondUnicornId;

        public BigInteger newUnicornId;

        public BigInteger price;
    }

    public static class HybridizationDeleteEventResponse {
        public Log log;

        public BigInteger unicornId;
    }

    public static class CreateUnicornEventResponse {
        public Log log;

        public String owner;

        public BigInteger unicornId;

        public BigInteger parent1;

        public BigInteger parent2;
    }

    public static class FreeHybridizationEventResponse {
        public Log log;

        public BigInteger unicornId;
    }
}
