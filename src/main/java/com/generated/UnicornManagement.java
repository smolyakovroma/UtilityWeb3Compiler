package com.generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
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
public class UnicornManagement extends Contract {
    private static final String BINARY = "60606040526012805460b060020a60ff021960a860020a60ff021960a060020a60ff0219909216740100000000000000000000000000000000000000001791909116750100000000000000000000000000000000000000000017169055341561006757600080fd5b60008054600160a060020a033316600160a060020a0319918216811790925560018054821683179055600280549091169091179055611b57806100ab6000396000f3006060604052600436106102665763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416630480c975811461026b578063071467861461028c57806307ec4b42146102bb5780630bf1dfb5146102ce578063131ee1c4146102ed57806315da0b02146103005780631d296e8d1461031f5780632779eb52146103325780632a70d1e7146103515780632efd563214610370578063338410f2146103835780633d11fa43146103a25780633f4ba83a146103c157806341431908146103d457806343861c5a146103f3578063451437ab14610412578063472028191461042557806349ab1d861461044457806349b7a9c2146104635780634bc50dd6146104765780634ce149d714610495578063500569b6146104b4578063541334f6146104db5780635550e4f3146104fa5780635abaaa011461050d5780635c3d9ff3146105205780635c975abb14610533578063600b1ff2146105465780636073357214610565578063632445551461058457806379400add146105a3578063828eda5b146105b65780638456cb59146105d557806386e476dd146105e85780638ba95bd6146105fb5780638bf605371461060e5780638f84aa091461062d5780639d5bf50214610640578063a14e0e4e14610653578063a63f5e2a14610666578063a74a35a814610679578063a891af6714610698578063b0b322e5146106ab578063b9b842e5146106ca578063cf309012146106e9578063cf73a1bc146106fc578063dfadb43c1461070f578063ede0f70814610722578063f11971e614610741578063f2fde38b14610754578063f83d08ba14610773575b600080fd5b341561027657600080fd5b61028a600160a060020a0360043516610786565b005b341561029757600080fd5b61029f610820565b604051600160a060020a03909116815260200160405180910390f35b34156102c657600080fd5b61029f61082f565b34156102d957600080fd5b61028a600160a060020a036004351661083e565b34156102f857600080fd5b61029f610901565b341561030b57600080fd5b61028a600160a060020a0360043516610910565b341561032a57600080fd5b61029f61099b565b341561033d57600080fd5b61028a600160a060020a03600435166109aa565b341561035c57600080fd5b61028a600160a060020a0360043516610a6b565b341561037b57600080fd5b61029f610b69565b341561038e57600080fd5b61028a600160a060020a0360043516610b78565b34156103ad57600080fd5b61028a600160a060020a0360043516610c3b565b34156103cc57600080fd5b61028a610ce4565b34156103df57600080fd5b61028a600160a060020a0360043516610d64565b34156103fe57600080fd5b61028a600160a060020a0360043516610def565b341561041d57600080fd5b61029f610e70565b341561043057600080fd5b61028a600160a060020a0360043516610e7f565b341561044f57600080fd5b61028a600160a060020a0360043516610ff1565b341561046e57600080fd5b61029f61105b565b341561048157600080fd5b61028a600160a060020a036004351661106a565b34156104a057600080fd5b61028a600160a060020a03600435166110eb565b34156104bf57600080fd5b6104c76111c1565b604051901515815260200160405180910390f35b34156104e657600080fd5b6104c7600160a060020a03600435166111e2565b341561050557600080fd5b61029f611200565b341561051857600080fd5b61029f61120f565b341561052b57600080fd5b61029f61121e565b341561053e57600080fd5b6104c761122d565b341561055157600080fd5b61028a600160a060020a036004351661123d565b341561057057600080fd5b61028a600160a060020a03600435166112e0565b341561058f57600080fd5b61028a600160a060020a0360043516611361565b34156105ae57600080fd5b61029f6113e2565b34156105c157600080fd5b61028a600160a060020a03600435166113f1565b34156105e057600080fd5b61028a611474565b34156105f357600080fd5b61029f6114f9565b341561060657600080fd5b61029f611508565b341561061957600080fd5b61028a600160a060020a0360043516611517565b341561063857600080fd5b61029f6115b9565b341561064b57600080fd5b61029f6115c8565b341561065e57600080fd5b61028a6115d7565b341561067157600080fd5b61029f6116a0565b341561068457600080fd5b61028a600160a060020a03600435166116af565b34156106a357600080fd5b61029f611772565b34156106b657600080fd5b61028a600160a060020a0360043516611781565b34156106d557600080fd5b61028a600160a060020a0360043516611804565b34156106f457600080fd5b6104c76118da565b341561070757600080fd5b61029f6118ea565b341561071a57600080fd5b61029f6118f9565b341561072d57600080fd5b61028a600160a060020a0360043516611908565b341561074c57600080fd5b61028a611989565b341561075f57600080fd5b61028a600160a060020a03600435166119ed565b341561077e57600080fd5b61028a611a6f565b60005433600160a060020a039081169116146107a157600080fd5b60125460b060020a900460ff16156107b857600080fd5b600160a060020a03811615156107cd57600080fd5b600160a060020a03811660008181526013602052604090819020805460ff191660011790557f1c89f399a58a1d7c1bc391f80d4139c7b968950b88b29c3dd2ed02b020897b6b905160405180910390a250565b601054600160a060020a031681565b600954600160a060020a031681565b60005433600160a060020a0390811691161461085957600080fd5b60125460a860020a900460ff16151561087157600080fd5b60125460b060020a900460ff161561088857600080fd5b600160a060020a038116151561089d57600080fd5b600a8054600160a060020a031916600160a060020a0383161790556108c181610786565b7fc4b5334fc8dc862ede501ee38a7c612b43bfbc1655f77550d870841e299d8e0281604051600160a060020a03909116815260200160405180910390a150565b600e54600160a060020a031681565b60025433600160a060020a0390811691161461092b57600080fd5b600160a060020a038116151561094057600080fd5b60028054600160a060020a031916600160a060020a0383161790557f779efae37fd342214887c3c00c8a2e031a639cba13f12a4095664d94f1f30feb81604051600160a060020a03909116815260200160405180910390a150565b600f54600160a060020a031681565b60005433600160a060020a039081169116146109c557600080fd5b60125460a860020a900460ff1615156109dd57600080fd5b60125460b060020a900460ff16156109f457600080fd5b600160a060020a0381161515610a0957600080fd5b60108054600160a060020a031916600160a060020a0383811691909117918290557faf7f1afb725b07d421bb55a7608c4502c6e423c52b2506ae923bc5107ec5b9a89116604051600160a060020a03909116815260200160405180910390a150565b60125460a860020a900460ff161515610a8357600080fd5b60005433600160a060020a0390811691161480610aae575060005432600160a060020a039081169116145b1515610ab957600080fd5b600160a060020a03811660009081526014602052604090206001015460ff161515610b665760408051908101604090815260155482526001602080840191909152600160a060020a03841660009081526014909152208151815560208201516001918201805460ff191691151591909117905560158054909250908101610b408382611ae1565b5060009182526020909120018054600160a060020a031916600160a060020a0383161790555b50565b601154600160a060020a031681565b60005433600160a060020a03908116911614610b9357600080fd5b60125460a860020a900460ff161515610bab57600080fd5b60125460b060020a900460ff1615610bc257600080fd5b600160a060020a0381161515610bd757600080fd5b60098054600160a060020a031916600160a060020a038316179055610bfb81610786565b7f7516c60772a63a8e1a838c446de6fe4755d7d52a2cd9678c3a5cb14bf185ac4681604051600160a060020a03909116815260200160405180910390a150565b60005433600160a060020a03908116911614610c5657600080fd5b60125460b060020a900460ff1615610c6d57600080fd5b600160a060020a03811660009081526013602052604090205460ff161515610c9457600080fd5b600160a060020a03811660008181526013602052604090819020805460ff191690557fbf34c5f6039edf090fd50305f23b8cb49fee0348594f20190178e116cfc147b2905160405180910390a250565b60005433600160a060020a03908116911614610cff57600080fd5b60125460a860020a900460ff161515610d1757600080fd5b6012805475ff000000000000000000000000000000000000000000191690557fc2b59ac10e0ce529935226cd4598d1b33c6884837c7c6466958ec98d7f25051560405160405180910390a1565b60005433600160a060020a03908116911614610d7f57600080fd5b600160a060020a0381161515610d9457600080fd5b60018054600160a060020a031916600160a060020a0383161790557f154e089317c4af354b1797cbc6b5e25eec4bdd82fd25292b9b8ede870b7d056e81604051600160a060020a03909116815260200160405180910390a150565b60005433600160a060020a03908116911614610e0a57600080fd5b60125460a860020a900460ff161515610e2257600080fd5b60125460b060020a900460ff1615610e3957600080fd5b600160a060020a0381161515610e4e57600080fd5b600e8054600160a060020a031916600160a060020a0392909216919091179055565b600b54600160a060020a031681565b6000805433600160a060020a03908116911614610e9b57600080fd5b60125460a860020a900460ff161515610eb357600080fd5b600160a060020a03821660009081526014602052604090206001015460ff168015610ee15750601554600090115b1515610eec57600080fd5b5060158054600160a060020a0383166000908152601460208190526040822054600019840194909391929185908110610f2157fe5b6000918252602080832090910154600160a060020a031683528201929092526040019020556015805482908110610f5457fe5b6000918252602080832090910154600160a060020a0385811684526014909252604090922054601580549290931692918110610f8c57fe5b60009182526020909120018054600160a060020a031916600160a060020a03929092169190911790556015805490610fc8906000198301611ae1565b5050600160a060020a03166000908152601460205260408120908155600101805460ff19169055565b60005433600160a060020a0390811691161461100c57600080fd5b60125460a860020a900460ff16151561102457600080fd5b600160a060020a038116151561103957600080fd5b600f8054600160a060020a031916600160a060020a0392909216919091179055565b600354600160a060020a031681565b60005433600160a060020a0390811691161461108557600080fd5b60125460a860020a900460ff16151561109d57600080fd5b60125460b060020a900460ff16156110b457600080fd5b600160a060020a03811615156110c957600080fd5b600d8054600160a060020a031916600160a060020a0392909216919091179055565b60005433600160a060020a0390811691161461110657600080fd5b60125460a860020a900460ff16151561111e57600080fd5b60125460b060020a900460ff161561113557600080fd5b600160a060020a038116151561114a57600080fd5b60128054600160a060020a031916600160a060020a0383811691909117918290556111759116610786565b6012547fd02693e3bc4f9cc73e55034a78e4e6ba316053c4e3270b82b92f211a0c53977890600160a060020a0316604051600160a060020a03909116815260200160405180910390a150565b60125474010000000000000000000000000000000000000000900460ff1681565b600160a060020a031660009081526013602052604090205460ff1690565b600754600160a060020a031681565b600654600160a060020a031681565b600854600160a060020a031681565b60125460a860020a900460ff1681565b60005433600160a060020a0390811691161461125857600080fd5b60125460a860020a900460ff16151561127057600080fd5b600160a060020a038116151561128557600080fd5b60078054600160a060020a031916600160a060020a0383161790557fb292858866187b936c17a602fa789d4b9e7c629816893a4dcc28f2d4ff1ed23281604051600160a060020a03909116815260200160405180910390a150565b60005433600160a060020a039081169116146112fb57600080fd5b60125460a860020a900460ff16151561131357600080fd5b60125460b060020a900460ff161561132a57600080fd5b600160a060020a038116151561133f57600080fd5b60068054600160a060020a031916600160a060020a0392909216919091179055565b60005433600160a060020a0390811691161461137c57600080fd5b60125460a860020a900460ff16151561139457600080fd5b60125460b060020a900460ff16156113ab57600080fd5b600160a060020a03811615156113c057600080fd5b60048054600160a060020a031916600160a060020a0392909216919091179055565b600a54600160a060020a031681565b60005433600160a060020a0390811691161461140c57600080fd5b60125460a860020a900460ff16151561142457600080fd5b60125460b060020a900460ff161561143b57600080fd5b600160a060020a038116151561145057600080fd5b600c8054600160a060020a031916600160a060020a038316179055610b6681610786565b60005433600160a060020a0390811691161461148f57600080fd5b60125460a860020a900460ff16156114a657600080fd5b6012805475ff000000000000000000000000000000000000000000191660a860020a1790557f379a7ed98de1761176e6287e5f55608de8a7ab47a92b795aed8fe2fd32d8260e60405160405180910390a1565b600254600160a060020a031681565b600d54600160a060020a031681565b60005433600160a060020a0390811691161461153257600080fd5b60125460b060020a900460ff161561154957600080fd5b600160a060020a038116151561155e57600080fd5b60038054600160a060020a031916600160a060020a0383161790557f2b2c5344b3d5c0b7a2ea304baace4e0a2994895d770faf250a6b5b32157acabf81604051600160a060020a03909116815260200160405180910390a150565b600054600160a060020a031681565b600c54600160a060020a031681565b6000805433600160a060020a039081169116146115f357600080fd5b60125460a860020a900460ff16151561160b57600080fd5b5060005b601554811015610b6657601580548290811061162757fe5b600091825260209091200154600160a060020a031663e1c7392a6040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401600060405180830381600087803b151561168857600080fd5b5af1151561169557600080fd5b50505060010161160f565b600454600160a060020a031681565b60005433600160a060020a039081169116146116ca57600080fd5b60125460a860020a900460ff1615156116e257600080fd5b60125460b060020a900460ff16156116f957600080fd5b600160a060020a038116151561170e57600080fd5b60088054600160a060020a031916600160a060020a03831617905561173281610786565b7ff3fd24dc2b80417b5e8e79795b05fc9cda6e3e1d5bbe49a42c7c6e2dd6fcbf7b81604051600160a060020a03909116815260200160405180910390a150565b600554600160a060020a031681565b60005433600160a060020a0390811691161461179c57600080fd5b60125460a860020a900460ff1615156117b457600080fd5b60125460b060020a900460ff16156117cb57600080fd5b600160a060020a03811615156117e057600080fd5b600b8054600160a060020a031916600160a060020a038316179055610b6681610786565b60005433600160a060020a0390811691161461181f57600080fd5b60125460a860020a900460ff16151561183757600080fd5b60125460b060020a900460ff161561184e57600080fd5b600160a060020a038116151561186357600080fd5b60118054600160a060020a031916600160a060020a03838116919091179182905561188e9116610786565b6011547fdf53626b028f339ffa0cb6adaa59b3dcf3098899a40823a21b03097cd53320cf90600160a060020a0316604051600160a060020a03909116815260200160405180910390a150565b60125460b060020a900460ff1681565b600154600160a060020a031681565b601254600160a060020a031681565b60005433600160a060020a0390811691161461192357600080fd5b60125460a860020a900460ff16151561193b57600080fd5b60125460b060020a900460ff161561195257600080fd5b600160a060020a038116151561196757600080fd5b60058054600160a060020a031916600160a060020a0392909216919091179055565b60005433600160a060020a039081169116146119a457600080fd5b60125474010000000000000000000000000000000000000000900460ff1615156119cd57600080fd5b6012805474ff000000000000000000000000000000000000000019169055565b60005433600160a060020a03908116911614611a0857600080fd5b600160a060020a0381161515611a1d57600080fd5b60008054600160a060020a031916600160a060020a03838116918217928390559091167f8be0079c531659141344cd1fd0a4f28419497f9722a3daafe3b4186f6b6457e060405160405180910390a350565b60005433600160a060020a03908116911614611a8a57600080fd5b60125460a860020a900460ff161515611aa257600080fd5b60125460b060020a900460ff1615611ab957600080fd5b6012805476ff00000000000000000000000000000000000000000000191660b060020a179055565b815481835581811511611b0557600083815260209020611b05918101908301611b0a565b505050565b611b2891905b80821115611b245760008155600101611b10565b5090565b905600a165627a7a7230582052830ad1d96eae80acb5ffc660df43d0d4020eb12c778a0b877f9ea0491c5ebc0029";

    protected UnicornManagement(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected UnicornManagement(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public List<GamePausedEventResponse> getGamePausedEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("GamePaused", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList());
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<GamePausedEventResponse> responses = new ArrayList<GamePausedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            GamePausedEventResponse typedResponse = new GamePausedEventResponse();
            typedResponse.log = eventValues.getLog();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<GamePausedEventResponse> gamePausedEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("GamePaused", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList());
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, GamePausedEventResponse>() {
            @Override
            public GamePausedEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                GamePausedEventResponse typedResponse = new GamePausedEventResponse();
                typedResponse.log = log;
                return typedResponse;
            }
        });
    }

    public List<GameResumedEventResponse> getGameResumedEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("GameResumed", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList());
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<GameResumedEventResponse> responses = new ArrayList<GameResumedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            GameResumedEventResponse typedResponse = new GameResumedEventResponse();
            typedResponse.log = eventValues.getLog();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<GameResumedEventResponse> gameResumedEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("GameResumed", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList());
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, GameResumedEventResponse>() {
            @Override
            public GameResumedEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                GameResumedEventResponse typedResponse = new GameResumedEventResponse();
                typedResponse.log = log;
                return typedResponse;
            }
        });
    }

    public List<OwnershipTransferredEventResponse> getOwnershipTransferredEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("OwnershipTransferred", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList());
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<OwnershipTransferredEventResponse> responses = new ArrayList<OwnershipTransferredEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            OwnershipTransferredEventResponse typedResponse = new OwnershipTransferredEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.previousOwner = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.newOwner = (String) eventValues.getIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<OwnershipTransferredEventResponse> ownershipTransferredEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("OwnershipTransferred", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList());
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, OwnershipTransferredEventResponse>() {
            @Override
            public OwnershipTransferredEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                OwnershipTransferredEventResponse typedResponse = new OwnershipTransferredEventResponse();
                typedResponse.log = log;
                typedResponse.previousOwner = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.newOwner = (String) eventValues.getIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public List<NewManagerAddressEventResponse> getNewManagerAddressEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("NewManagerAddress", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<NewManagerAddressEventResponse> responses = new ArrayList<NewManagerAddressEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewManagerAddressEventResponse typedResponse = new NewManagerAddressEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.managerAddress = (String) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<NewManagerAddressEventResponse> newManagerAddressEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("NewManagerAddress", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, NewManagerAddressEventResponse>() {
            @Override
            public NewManagerAddressEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                NewManagerAddressEventResponse typedResponse = new NewManagerAddressEventResponse();
                typedResponse.log = log;
                typedResponse.managerAddress = (String) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<NewCommunityAddressEventResponse> getNewCommunityAddressEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("NewCommunityAddress", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<NewCommunityAddressEventResponse> responses = new ArrayList<NewCommunityAddressEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewCommunityAddressEventResponse typedResponse = new NewCommunityAddressEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.communityAddress = (String) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<NewCommunityAddressEventResponse> newCommunityAddressEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("NewCommunityAddress", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, NewCommunityAddressEventResponse>() {
            @Override
            public NewCommunityAddressEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                NewCommunityAddressEventResponse typedResponse = new NewCommunityAddressEventResponse();
                typedResponse.log = log;
                typedResponse.communityAddress = (String) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<NewDividendManagerAddressEventResponse> getNewDividendManagerAddressEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("NewDividendManagerAddress", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<NewDividendManagerAddressEventResponse> responses = new ArrayList<NewDividendManagerAddressEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewDividendManagerAddressEventResponse typedResponse = new NewDividendManagerAddressEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.dividendManagerAddress = (String) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<NewDividendManagerAddressEventResponse> newDividendManagerAddressEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("NewDividendManagerAddress", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, NewDividendManagerAddressEventResponse>() {
            @Override
            public NewDividendManagerAddressEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                NewDividendManagerAddressEventResponse typedResponse = new NewDividendManagerAddressEventResponse();
                typedResponse.log = log;
                typedResponse.dividendManagerAddress = (String) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<NewWalletAddressEventResponse> getNewWalletAddressEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("NewWalletAddress", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<NewWalletAddressEventResponse> responses = new ArrayList<NewWalletAddressEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewWalletAddressEventResponse typedResponse = new NewWalletAddressEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.walletAddress = (String) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<NewWalletAddressEventResponse> newWalletAddressEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("NewWalletAddress", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, NewWalletAddressEventResponse>() {
            @Override
            public NewWalletAddressEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                NewWalletAddressEventResponse typedResponse = new NewWalletAddressEventResponse();
                typedResponse.log = log;
                typedResponse.walletAddress = (String) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<NewBlackBoxAddressEventResponse> getNewBlackBoxAddressEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("NewBlackBoxAddress", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<NewBlackBoxAddressEventResponse> responses = new ArrayList<NewBlackBoxAddressEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewBlackBoxAddressEventResponse typedResponse = new NewBlackBoxAddressEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.blackBoxAddress = (String) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<NewBlackBoxAddressEventResponse> newBlackBoxAddressEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("NewBlackBoxAddress", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, NewBlackBoxAddressEventResponse>() {
            @Override
            public NewBlackBoxAddressEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                NewBlackBoxAddressEventResponse typedResponse = new NewBlackBoxAddressEventResponse();
                typedResponse.log = log;
                typedResponse.blackBoxAddress = (String) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<NewBreedingAddressEventResponse> getNewBreedingAddressEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("NewBreedingAddress", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<NewBreedingAddressEventResponse> responses = new ArrayList<NewBreedingAddressEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewBreedingAddressEventResponse typedResponse = new NewBreedingAddressEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.breedingAddress = (String) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<NewBreedingAddressEventResponse> newBreedingAddressEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("NewBreedingAddress", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, NewBreedingAddressEventResponse>() {
            @Override
            public NewBreedingAddressEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                NewBreedingAddressEventResponse typedResponse = new NewBreedingAddressEventResponse();
                typedResponse.log = log;
                typedResponse.breedingAddress = (String) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<NewGen0AddressEventResponse> getNewGen0AddressEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("NewGen0Address", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<NewGen0AddressEventResponse> responses = new ArrayList<NewGen0AddressEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewGen0AddressEventResponse typedResponse = new NewGen0AddressEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.unicornGen0Address = (String) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<NewGen0AddressEventResponse> newGen0AddressEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("NewGen0Address", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, NewGen0AddressEventResponse>() {
            @Override
            public NewGen0AddressEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                NewGen0AddressEventResponse typedResponse = new NewGen0AddressEventResponse();
                typedResponse.log = log;
                typedResponse.unicornGen0Address = (String) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<NewMarketAddressEventResponse> getNewMarketAddressEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("NewMarketAddress", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<NewMarketAddressEventResponse> responses = new ArrayList<NewMarketAddressEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewMarketAddressEventResponse typedResponse = new NewMarketAddressEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.unicornMarketAddress = (String) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<NewMarketAddressEventResponse> newMarketAddressEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("NewMarketAddress", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, NewMarketAddressEventResponse>() {
            @Override
            public NewMarketAddressEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                NewMarketAddressEventResponse typedResponse = new NewMarketAddressEventResponse();
                typedResponse.log = log;
                typedResponse.unicornMarketAddress = (String) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<NewUserRankAddressEventResponse> getNewUserRankAddressEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("NewUserRankAddress", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<NewUserRankAddressEventResponse> responses = new ArrayList<NewUserRankAddressEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewUserRankAddressEventResponse typedResponse = new NewUserRankAddressEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.userRankAddress = (String) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<NewUserRankAddressEventResponse> newUserRankAddressEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("NewUserRankAddress", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, NewUserRankAddressEventResponse>() {
            @Override
            public NewUserRankAddressEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                NewUserRankAddressEventResponse typedResponse = new NewUserRankAddressEventResponse();
                typedResponse.log = log;
                typedResponse.userRankAddress = (String) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<NewCandyLandAddressEventResponse> getNewCandyLandAddressEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("NewCandyLandAddress", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<NewCandyLandAddressEventResponse> responses = new ArrayList<NewCandyLandAddressEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewCandyLandAddressEventResponse typedResponse = new NewCandyLandAddressEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.candyLandAddress = (String) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<NewCandyLandAddressEventResponse> newCandyLandAddressEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("NewCandyLandAddress", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, NewCandyLandAddressEventResponse>() {
            @Override
            public NewCandyLandAddressEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                NewCandyLandAddressEventResponse typedResponse = new NewCandyLandAddressEventResponse();
                typedResponse.log = log;
                typedResponse.candyLandAddress = (String) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<NewCandyLandSaleAddressEventResponse> getNewCandyLandSaleAddressEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("NewCandyLandSaleAddress", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<NewCandyLandSaleAddressEventResponse> responses = new ArrayList<NewCandyLandSaleAddressEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewCandyLandSaleAddressEventResponse typedResponse = new NewCandyLandSaleAddressEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.candyLandSaleAddress = (String) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<NewCandyLandSaleAddressEventResponse> newCandyLandSaleAddressEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("NewCandyLandSaleAddress", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, NewCandyLandSaleAddressEventResponse>() {
            @Override
            public NewCandyLandSaleAddressEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                NewCandyLandSaleAddressEventResponse typedResponse = new NewCandyLandSaleAddressEventResponse();
                typedResponse.log = log;
                typedResponse.candyLandSaleAddress = (String) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<AddUnicornContractEventResponse> getAddUnicornContractEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("AddUnicornContract", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList());
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<AddUnicornContractEventResponse> responses = new ArrayList<AddUnicornContractEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            AddUnicornContractEventResponse typedResponse = new AddUnicornContractEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse._unicornContractAddress = (String) eventValues.getIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<AddUnicornContractEventResponse> addUnicornContractEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("AddUnicornContract", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList());
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, AddUnicornContractEventResponse>() {
            @Override
            public AddUnicornContractEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                AddUnicornContractEventResponse typedResponse = new AddUnicornContractEventResponse();
                typedResponse.log = log;
                typedResponse._unicornContractAddress = (String) eventValues.getIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<DelUnicornContractEventResponse> getDelUnicornContractEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("DelUnicornContract", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList());
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<DelUnicornContractEventResponse> responses = new ArrayList<DelUnicornContractEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            DelUnicornContractEventResponse typedResponse = new DelUnicornContractEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse._unicornContractAddress = (String) eventValues.getIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<DelUnicornContractEventResponse> delUnicornContractEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("DelUnicornContract", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList());
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, DelUnicornContractEventResponse>() {
            @Override
            public DelUnicornContractEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                DelUnicornContractEventResponse typedResponse = new DelUnicornContractEventResponse();
                typedResponse.log = log;
                typedResponse._unicornContractAddress = (String) eventValues.getIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public RemoteCall<TransactionReceipt> setUnicornContract(String _unicornContractAddress) {
        Function function = new Function(
                "setUnicornContract", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornContractAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> userRankAddress() {
        Function function = new Function("userRankAddress", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> unicornBreedingAddress() {
        Function function = new Function("unicornBreedingAddress", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setUnicornMarket(String _unicornMarketAddress) {
        Function function = new Function(
                "setUnicornMarket", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornMarketAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> unicornPricesAddress() {
        Function function = new Function("unicornPricesAddress", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setCommunity(String _communityAddress) {
        Function function = new Function(
                "setCommunity", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_communityAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> geneLabAddress() {
        Function function = new Function("geneLabAddress", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setUserRank(String _userRankAddress) {
        Function function = new Function(
                "setUserRank", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_userRankAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> registerInit(String _contract) {
        Function function = new Function(
                "registerInit", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_contract)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> candyLandAddress() {
        Function function = new Function("candyLandAddress", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setUnicornBreeding(String _unicornBreedingAddress) {
        Function function = new Function(
                "setUnicornBreeding", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornBreedingAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> delUnicornContract(String _unicornContractAddress) {
        Function function = new Function(
                "delUnicornContract", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornContractAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> unpause() {
        Function function = new Function(
                "unpause", 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setManagerAddress(String _managerAddress) {
        Function function = new Function(
                "setManagerAddress", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_managerAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setPrices(String _unicornPricesAddress) {
        Function function = new Function(
                "setPrices", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornPricesAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> unicornBalancesAddress() {
        Function function = new Function("unicornBalancesAddress", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> unregisterInit(String _contract) {
        Function function = new Function(
                "unregisterInit", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_contract)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setGeneLab(String _geneLabAddress) {
        Function function = new Function(
                "setGeneLab", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_geneLabAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> dividendManagerAddress() {
        Function function = new Function("dividendManagerAddress", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setBreedingDB(String _unicornBreedingDBAddress) {
        Function function = new Function(
                "setBreedingDB", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornBreedingDBAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setCandyLandSale(String _candyLandSaleAddress) {
        Function function = new Function(
                "setCandyLandSale", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_candyLandSaleAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Boolean> landPresaleOpen() {
        Function function = new Function("landPresaleOpen", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<Boolean> isUnicornContract(String _unicornContractAddress) {
        Function function = new Function("isUnicornContract", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornContractAddress)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<String> blackBoxAddress() {
        Function function = new Function("blackBoxAddress", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> unicornTokenAddress() {
        Function function = new Function("unicornTokenAddress", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> unicornGen0Address() {
        Function function = new Function("unicornGen0Address", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<Boolean> paused() {
        Function function = new Function("paused", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<TransactionReceipt> setBlackBox(String _blackBoxAddress) {
        Function function = new Function(
                "setBlackBox", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_blackBoxAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setUnicornToken(String _unicornTokenAddress) {
        Function function = new Function(
                "setUnicornToken", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornTokenAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setCandy(String _Candy) {
        Function function = new Function(
                "setCandy", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_Candy)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> unicornMarketAddress() {
        Function function = new Function("unicornMarketAddress", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setUnicornFreezing(String _unicornFreezingAddress) {
        Function function = new Function(
                "setUnicornFreezing", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornFreezingAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> pause() {
        Function function = new Function(
                "pause", 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> communityAddress() {
        Function function = new Function("communityAddress", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> unicornBreedingDBAddress() {
        Function function = new Function("unicornBreedingDBAddress", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setDividendManager(String _dividendManagerAddress) {
        Function function = new Function(
                "setDividendManager", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_dividendManagerAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> ownerAddress() {
        Function function = new Function("ownerAddress", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> unicornFreezingAddress() {
        Function function = new Function("unicornFreezingAddress", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> runInit() {
        Function function = new Function(
                "runInit", 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> candyToken() {
        Function function = new Function("candyToken", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setUnicornGen0(String _unicornGen0Address) {
        Function function = new Function(
                "setUnicornGen0", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornGen0Address)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> megaCandy() {
        Function function = new Function("megaCandy", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setUnicornBalances(String _unicornBalancesAddress) {
        Function function = new Function(
                "setUnicornBalances", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornBalancesAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setCandyLand(String _candyLandAddress) {
        Function function = new Function(
                "setCandyLand", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_candyLandAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Boolean> locked() {
        Function function = new Function("locked", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<String> managerAddress() {
        Function function = new Function("managerAddress", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> candyLandSaleAddress() {
        Function function = new Function("candyLandSaleAddress", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setMegaCandy(String _megaCandy) {
        Function function = new Function(
                "setMegaCandy", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_megaCandy)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> stopLandPresale() {
        Function function = new Function(
                "stopLandPresale", 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> transferOwnership(String _ownerAddress) {
        Function function = new Function(
                "transferOwnership", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_ownerAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> lock() {
        Function function = new Function(
                "lock", 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<UnicornManagement> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(UnicornManagement.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<UnicornManagement> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(UnicornManagement.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static UnicornManagement load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new UnicornManagement(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static UnicornManagement load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new UnicornManagement(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static class GamePausedEventResponse {
        public Log log;
    }

    public static class GameResumedEventResponse {
        public Log log;
    }

    public static class OwnershipTransferredEventResponse {
        public Log log;

        public String previousOwner;

        public String newOwner;
    }

    public static class NewManagerAddressEventResponse {
        public Log log;

        public String managerAddress;
    }

    public static class NewCommunityAddressEventResponse {
        public Log log;

        public String communityAddress;
    }

    public static class NewDividendManagerAddressEventResponse {
        public Log log;

        public String dividendManagerAddress;
    }

    public static class NewWalletAddressEventResponse {
        public Log log;

        public String walletAddress;
    }

    public static class NewBlackBoxAddressEventResponse {
        public Log log;

        public String blackBoxAddress;
    }

    public static class NewBreedingAddressEventResponse {
        public Log log;

        public String breedingAddress;
    }

    public static class NewGen0AddressEventResponse {
        public Log log;

        public String unicornGen0Address;
    }

    public static class NewMarketAddressEventResponse {
        public Log log;

        public String unicornMarketAddress;
    }

    public static class NewUserRankAddressEventResponse {
        public Log log;

        public String userRankAddress;
    }

    public static class NewCandyLandAddressEventResponse {
        public Log log;

        public String candyLandAddress;
    }

    public static class NewCandyLandSaleAddressEventResponse {
        public Log log;

        public String candyLandSaleAddress;
    }

    public static class AddUnicornContractEventResponse {
        public Log log;

        public String _unicornContractAddress;
    }

    public static class DelUnicornContractEventResponse {
        public Log log;

        public String _unicornContractAddress;
    }
}
