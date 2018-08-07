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
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;
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
public class CandyLand extends Contract {
    private static final String BINARY = "6060604052617530600755341561001557600080fd5b604051604080611c45833981016040528080519190602001805160008054600160a060020a031916600160a060020a03838116919091179182905591935083925016632a70d1e7306040517c010000000000000000000000000000000000000000000000000000000063ffffffff8416028152600160a060020a039091166004820152602401600060405180830381600087803b15156100b457600080fd5b5af115156100c157600080fd5b505060048054600160a060020a03909516600160a060020a031990951694909417909355505050611b4e806100f76000396000f3006060604052600436106101505763ffffffff60e060020a6000350416630422ddf3811461015557806306fdde031461017c578063095ea7b31461020657806311308d661461022857806318160ddd14610259578063182493f21461026c5780631ffa451c1461028b57806323b872dd146102b3578063313ce567146102db57806332cb6b0c1461030457806340c10f191461031757806344abd7901461033957806357e8f40114610354578063661884631461037357806370a0823114610395578063738fa7a4146103b45780638bc7fa9c146103e35780638dca7a01146103f957806395d89b411461040c578063a891af671461041f578063a9059cbb14610432578063b9fb3a3814610454578063c0b14de714610467578063d73dd6231461047a578063dd62ed3e1461049c578063e1c7392a146104c1578063e346bac8146104d4578063fc0656c9146104e7575b600080fd5b341561016057600080fd5b6101686104fa565b604051901515815260200160405180910390f35b341561018757600080fd5b61018f610555565b60405160208082528190810183818151815260200191508051906020019080838360005b838110156101cb5780820151838201526020016101b3565b50505050905090810190601f1680156101f85780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561021157600080fd5b610168600160a060020a036004351660243561058c565b341561023357600080fd5b610247600160a060020a03600435166105f8565b60405190815260200160405180910390f35b341561026457600080fd5b610247610631565b341561027757600080fd5b610247600160a060020a0360043516610637565b341561029657600080fd5b610168600160a060020a0360043581169060243516604435610652565b34156102be57600080fd5b610168600160a060020a0360043581169060243516604435610863565b34156102e657600080fd5b6102ee610a8a565b60405160ff909116815260200160405180910390f35b341561030f57600080fd5b610247610a8f565b341561032257600080fd5b610168600160a060020a0360043516602435610a95565b341561034457600080fd5b610352600435602435610c8c565b005b341561035f57600080fd5b610247600160a060020a0360043516610f50565b341561037e57600080fd5b610168600160a060020a0360043516602435611035565b34156103a057600080fd5b610247600160a060020a0360043516611131565b34156103bf57600080fd5b6103c761114c565b604051600160a060020a03909116815260200160405180910390f35b34156103ee57600080fd5b61035260043561115b565b341561040457600080fd5b6103c7611485565b341561041757600080fd5b61018f611494565b341561042a57600080fd5b6103c76114cb565b341561043d57600080fd5b610168600160a060020a03600435166024356114da565b341561045f57600080fd5b6103c761167a565b341561047257600080fd5b610352611689565b341561048557600080fd5b610168600160a060020a036004351660243561175d565b34156104a757600080fd5b610247600160a060020a0360043581169060243516611801565b34156104cc57600080fd5b61035261182c565b34156104df57600080fd5b6103c7611a91565b34156104f257600080fd5b6103c7611aa0565b60008054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561053a57600080fd5b5af1151561054757600080fd5b505050604051805191505090565b60408051908101604052600c81527f556e69636f726e204c616e640000000000000000000000000000000000000000602082015281565b600160a060020a03338116600081815260096020908152604080832094871680845294909152808220859055909291907f8c5be1e5ebec7d5bd14f71427d1e84f3dd0314c0f7b2291e5b200ac8c7c3b9259085905190815260200160405180910390a350600192915050565b600160a060020a0381166000908152600a6020908152604080832054600890925282205461062b9163ffffffff611aaf16565b92915050565b60065490565b600160a060020a03166000908152600a602052604090205490565b60008054600160a060020a031663541334f63360405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b15156106a357600080fd5b5af115156106b057600080fd5b5050506040518051905015156106c557600080fd5b600160a060020a03831615156106da57600080fd5b600160a060020a0384166000908152600a602090815260408083205460089092529091205461070e9163ffffffff611aaf16565b82111561071a57600080fd5b600154600160a060020a03166357e8f4018460405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b151561076a57600080fd5b5af1151561077757600080fd5b5050506040518051600160a060020a0385166000908152600860205260409020549091506107ab908463ffffffff611ac116565b11156107b657600080fd5b600160a060020a0384166000908152600860205260409020546107df908363ffffffff611aaf16565b600160a060020a038086166000908152600860205260408082209390935590851681522054610814908363ffffffff611ac116565b600160a060020a0380851660008181526008602052604090819020939093559190861690600080516020611b038339815191529085905190815260200160405180910390a35060019392505050565b6000600160a060020a038316151561087a57600080fd5b600160a060020a0384166000908152600a60209081526040808320546008909252909120546108ae9163ffffffff611aaf16565b8211156108ba57600080fd5b600160a060020a03808516600090815260096020908152604080832033909416835292905220548211156108ed57600080fd5b600154600160a060020a03166357e8f4018460405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b151561093d57600080fd5b5af1151561094a57600080fd5b5050506040518051600160a060020a03851660009081526008602052604090205490915061097e908463ffffffff611ac116565b111561098957600080fd5b600160a060020a0384166000908152600860205260409020546109b2908363ffffffff611aaf16565b600160a060020a0380861660009081526008602052604080822093909355908516815220546109e7908363ffffffff611ac116565b600160a060020a03808516600090815260086020908152604080832094909455878316825260098152838220339093168252919091522054610a2f908363ffffffff611aaf16565b600160a060020a0380861660008181526009602090815260408083203386168452909152908190209390935590851691600080516020611b038339815191529085905190815260200160405180910390a35060019392505050565b600081565b60075481565b60008054600160a060020a031663541334f63360405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b1515610ae657600080fd5b5af11515610af357600080fd5b505050604051805190501515610b0857600080fd5b600754600654610b1e908463ffffffff611ac116565b1115610b2957600080fd5b600154600160a060020a03166357e8f4018460405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b1515610b7957600080fd5b5af11515610b8657600080fd5b5050506040518051600160a060020a038516600090815260086020526040902054909150610bba908463ffffffff611ac116565b1115610bc557600080fd5b600654610bd8908363ffffffff611ac116565b600655600160a060020a038316600090815260086020526040902054610c04908363ffffffff611ac116565b600160a060020a0384166000818152600860205260409081902092909255907f0f6798a560793a54c3bcfe86a93cde1e73087d944c0ea20544137d41213968859084905190815260200160405180910390a2600160a060020a0383166000600080516020611b038339815191528460405190815260200160405180910390a350600192915050565b600160a060020a0333166000908152600a60209081526040808320546008909252822054610cbf9163ffffffff611aaf16565b8311158015610cce5750600083115b1515610cd957600080fd5b6000821115610e3657600354600554600054600160a060020a039283169263f18d03cc928116913391166349b7a9c26040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610d3657600080fd5b5af11515610d4357600080fd5b5050506040518051600454909150610dbf908990600160a060020a031663ba158a748a60405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b1515610d9c57600080fd5b5af11515610da957600080fd5b505050604051805191905063ffffffff611ad716565b60405160e060020a63ffffffff8716028152600160a060020a0394851660048201529284166024840152921660448201526064810191909152608401602060405180830381600087803b1515610e1457600080fd5b5af11515610e2157600080fd5b505050604051805190501515610e3657600080fd5b600454600160a060020a0316638bf4e16d33858560405160e060020a63ffffffff8616028152600160a060020a03909316600484015260248301919091526044820152606401602060405180830381600087803b1515610e9557600080fd5b5af11515610ea257600080fd5b505050604051805191505060008111610eba57600080fd5b600160a060020a0333166000908152600a6020526040902054610ee3908463ffffffff611ac116565b600160a060020a0333166000818152600a60205260409081902092909255907f666afaed3423c42c8166c1391f4713921e16732036a05780223ea22f8eb3f7fa908390869086905180848152602001838152602001828152602001935050505060405180910390a2505050565b600160a060020a0380821660009081526008602052604080822054600154929361062b93919291169063fedbceba90829063b2d1573f9088905160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b1515610fc557600080fd5b5af11515610fd257600080fd5b5050506040518051905060405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b151561101257600080fd5b5af1151561101f57600080fd5b505050604051805191905063ffffffff611aaf16565b600160a060020a0333811660009081526009602090815260408083209386168352929052908120548083111561109257600160a060020a0333811660009081526009602090815260408083209388168352929052908120556110c9565b6110a2818463ffffffff611aaf16565b600160a060020a033381166000908152600960209081526040808320938916835292905220555b600160a060020a0333811660008181526009602090815260408083209489168084529490915290819020547f8c5be1e5ebec7d5bd14f71427d1e84f3dd0314c0f7b2291e5b200ac8c7c3b925915190815260200160405180910390a3600191505b5092915050565b600160a060020a031660009081526008602052604090205490565b600154600160a060020a031681565b6004546000908190600160a060020a0316636352211e8460405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b15156111a857600080fd5b5af115156111b557600080fd5b50505060405180519050600160a060020a031633600160a060020a03161415156111de57600080fd5b6004546112a490600160a060020a03166327dd38736040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561122157600080fd5b5af1151561122e57600080fd5b5050506040518051600454909150600160a060020a0316638b9563308660405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b151561128157600080fd5b5af1151561128e57600080fd5b505050604051805191905063ffffffff611ac116565b4210156112b057600080fd5b600454600160a060020a031663a2fcf3ed338560405160e060020a63ffffffff8516028152600160a060020a03909216600483015260248201526044016040805180830381600087803b151561130557600080fd5b5af1151561131257600080fd5b5050506040518051906020018051919350909150508015156113cf576004546113b590600160a060020a031663525a2a248560405160e060020a63ffffffff84160281526004810191909152602401602060405180830381600087803b151561137a57600080fd5b5af1151561138757600080fd5b5050506040518051600160a060020a0333166000908152600a6020526040902054915063ffffffff611aaf16565b600160a060020a0333166000908152600a60205260409020555b600254600160a060020a03166340c10f19338460405160e060020a63ffffffff8516028152600160a060020a0390921660048301526024820152604401602060405180830381600087803b151561142557600080fd5b5af1151561143257600080fd5b50505060405180515050600160a060020a0333167fcade61307acda3243e179ed08240abd9df8f26ae5aa4b098ce9bc4d756115e69848460405191825260208201526040908101905180910390a2505050565b600054600160a060020a031681565b60408051908101604052600481527f4c616e6400000000000000000000000000000000000000000000000000000000602082015281565b600254600160a060020a031681565b6000600160a060020a03831615156114f157600080fd5b600160a060020a0333166000908152600a60209081526040808320546008909252909120546115259163ffffffff611aaf16565b82111561153157600080fd5b600154600160a060020a03166357e8f4018460405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b151561158157600080fd5b5af1151561158e57600080fd5b5050506040518051600160a060020a0385166000908152600860205260409020549091506115c2908463ffffffff611ac116565b11156115cd57600080fd5b600160a060020a0333166000908152600860205260409020546115f6908363ffffffff611aaf16565b600160a060020a03338116600090815260086020526040808220939093559085168152205461162b908363ffffffff611ac116565b600160a060020a038085166000818152600860205260409081902093909355913390911690600080516020611b038339815191529085905190815260200160405180910390a350600192915050565b600454600160a060020a031681565b600054600160a060020a03166386e476dd6040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156116c857600080fd5b5af115156116d557600080fd5b50505060405180519050600160a060020a031633600160a060020a03161415156116fe57600080fd5b6007546006541461170e57600080fd5b600754611723906103e863ffffffff611ac116565b60078190557f58023637e77b02a92776683f79289c6c2daaf581cbdd2d5fca74dd15d25c77a19060405190815260200160405180910390a1565b600160a060020a033381166000908152600960209081526040808320938616835292905290812054611795908363ffffffff611ac116565b600160a060020a0333811660008181526009602090815260408083209489168084529490915290819020849055919290917f8c5be1e5ebec7d5bd14f71427d1e84f3dd0314c0f7b2291e5b200ac8c7c3b92591905190815260200160405180910390a350600192915050565b600160a060020a03918216600090815260096020908152604080832093909416825291909152205490565b60005433600160a060020a0390811691161461184757600080fd5b600054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561188657600080fd5b5af1151561189357600080fd5b5050506040518051905015156118a857600080fd5b600054600160a060020a031663a63f5e2a6040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156118e757600080fd5b5af115156118f457600080fd5b50505060405180516005805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0392831617905560005416905063071467866040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561195e57600080fd5b5af1151561196b57600080fd5b50505060405180516001805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0392831617905560005416905063a891af676040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156119d557600080fd5b5af115156119e257600080fd5b50505060405180516002805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0392831617905560005416905063451437ab6040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515611a4c57600080fd5b5af11515611a5957600080fd5b50505060405180516003805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a039290921691909117905550565b600354600160a060020a031681565b600554600160a060020a031681565b600082821115611abb57fe5b50900390565b600082820183811015611ad057fe5b9392505050565b600080831515611aea576000915061112a565b50828202828482811515611afa57fe5b0414611ad057fe00ddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3efa165627a7a723058201ce244b307ac196818921faa38e74c3a30e250b99b155b86014509bfa012e3a10029";

    protected CandyLand(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected CandyLand(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public List<MakePlantEventResponse> getMakePlantEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("MakePlant", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<MakePlantEventResponse> responses = new ArrayList<MakePlantEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            MakePlantEventResponse typedResponse = new MakePlantEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.owner = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.gardenId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.count = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.gardenerId = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<MakePlantEventResponse> makePlantEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("MakePlant", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, MakePlantEventResponse>() {
            @Override
            public MakePlantEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                MakePlantEventResponse typedResponse = new MakePlantEventResponse();
                typedResponse.log = log;
                typedResponse.owner = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.gardenId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.count = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.gardenerId = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
                return typedResponse;
            }
        });
    }

    public List<GetCropEventResponse> getGetCropEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("GetCrop", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<GetCropEventResponse> responses = new ArrayList<GetCropEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            GetCropEventResponse typedResponse = new GetCropEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.owner = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.gardenId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.megaCandyCount = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<GetCropEventResponse> getCropEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("GetCrop", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, GetCropEventResponse>() {
            @Override
            public GetCropEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                GetCropEventResponse typedResponse = new GetCropEventResponse();
                typedResponse.log = log;
                typedResponse.owner = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.gardenId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.megaCandyCount = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public List<MintEventResponse> getMintEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("Mint", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<MintEventResponse> responses = new ArrayList<MintEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            MintEventResponse typedResponse = new MintEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.to = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.amount = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<MintEventResponse> mintEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("Mint", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, MintEventResponse>() {
            @Override
            public MintEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                MintEventResponse typedResponse = new MintEventResponse();
                typedResponse.log = log;
                typedResponse.to = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.amount = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<NewLandLimitEventResponse> getNewLandLimitEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("NewLandLimit", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<NewLandLimitEventResponse> responses = new ArrayList<NewLandLimitEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewLandLimitEventResponse typedResponse = new NewLandLimitEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.newLimit = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<NewLandLimitEventResponse> newLandLimitEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("NewLandLimit", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, NewLandLimitEventResponse>() {
            @Override
            public NewLandLimitEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                NewLandLimitEventResponse typedResponse = new NewLandLimitEventResponse();
                typedResponse.log = log;
                typedResponse.newLimit = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
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

    public List<TransferEventResponse> getTransferEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("Transfer", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<TransferEventResponse> responses = new ArrayList<TransferEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            TransferEventResponse typedResponse = new TransferEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.from = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.to = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<TransferEventResponse> transferEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("Transfer", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, TransferEventResponse>() {
            @Override
            public TransferEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                TransferEventResponse typedResponse = new TransferEventResponse();
                typedResponse.log = log;
                typedResponse.from = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.to = (String) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<ApprovalEventResponse> getApprovalEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("Approval", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<ApprovalEventResponse> responses = new ArrayList<ApprovalEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            ApprovalEventResponse typedResponse = new ApprovalEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.owner = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.spender = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<ApprovalEventResponse> approvalEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("Approval", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, ApprovalEventResponse>() {
            @Override
            public ApprovalEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                ApprovalEventResponse typedResponse = new ApprovalEventResponse();
                typedResponse.log = log;
                typedResponse.owner = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.spender = (String) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
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

    public RemoteCall<String> name() {
        Function function = new Function("name", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> approve(String _spender, BigInteger _value) {
        Function function = new Function(
                "approve", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_spender), 
                new org.web3j.abi.datatypes.generated.Uint256(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> freeLandsOf(String _owner) {
        Function function = new Function("freeLandsOf", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> totalSupply() {
        Function function = new Function("totalSupply", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> plantedOf(String _owner) {
        Function function = new Function("plantedOf", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> serviceTransfer(String _from, String _to, BigInteger _value) {
        Function function = new Function(
                "serviceTransfer", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_from), 
                new org.web3j.abi.datatypes.Address(_to), 
                new org.web3j.abi.datatypes.generated.Uint256(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> transferFrom(String _from, String _to, BigInteger _value) {
        Function function = new Function(
                "transferFrom", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_from), 
                new org.web3j.abi.datatypes.Address(_to), 
                new org.web3j.abi.datatypes.generated.Uint256(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> decimals() {
        Function function = new Function("decimals", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> MAX_SUPPLY() {
        Function function = new Function("MAX_SUPPLY", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> mint(String _to, BigInteger _amount) {
        Function function = new Function(
                "mint", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_to), 
                new org.web3j.abi.datatypes.generated.Uint256(_amount)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> makePlant(BigInteger _count, BigInteger _gardenerId) {
        Function function = new Function(
                "makePlant", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_count), 
                new org.web3j.abi.datatypes.generated.Uint256(_gardenerId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getUserLandLimit(String _user) {
        Function function = new Function("getUserLandLimit", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_user)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> decreaseApproval(String _spender, BigInteger _subtractedValue) {
        Function function = new Function(
                "decreaseApproval", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_spender), 
                new org.web3j.abi.datatypes.generated.Uint256(_subtractedValue)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> balanceOf(String _owner) {
        Function function = new Function("balanceOf", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> userRank() {
        Function function = new Function("userRank", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> getCrop(BigInteger _gardenId) {
        Function function = new Function(
                "getCrop", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_gardenId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> unicornManagement() {
        Function function = new Function("unicornManagement", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> symbol() {
        Function function = new Function("symbol", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> megaCandy() {
        Function function = new Function("megaCandy", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> transfer(String _to, BigInteger _value) {
        Function function = new Function(
                "transfer", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_to), 
                new org.web3j.abi.datatypes.generated.Uint256(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> candyTrees() {
        Function function = new Function("candyTrees", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setLandLimit() {
        Function function = new Function(
                "setLandLimit", 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> increaseApproval(String _spender, BigInteger _addedValue) {
        Function function = new Function(
                "increaseApproval", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_spender), 
                new org.web3j.abi.datatypes.generated.Uint256(_addedValue)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> allowance(String _owner, String _spender) {
        Function function = new Function("allowance", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner), 
                new org.web3j.abi.datatypes.Address(_spender)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> init() {
        Function function = new Function(
                "init", 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> unicornBalances() {
        Function function = new Function("unicornBalances", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> candyTokenAddress() {
        Function function = new Function("candyTokenAddress", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public static RemoteCall<CandyLand> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _candyTrees, String _unicornManagementAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_candyTrees), 
                new org.web3j.abi.datatypes.Address(_unicornManagementAddress)));
        return deployRemoteCall(CandyLand.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<CandyLand> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _candyTrees, String _unicornManagementAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_candyTrees), 
                new org.web3j.abi.datatypes.Address(_unicornManagementAddress)));
        return deployRemoteCall(CandyLand.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static CandyLand load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new CandyLand(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static CandyLand load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new CandyLand(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static class MakePlantEventResponse {
        public Log log;

        public String owner;

        public BigInteger gardenId;

        public BigInteger count;

        public BigInteger gardenerId;
    }

    public static class GetCropEventResponse {
        public Log log;

        public String owner;

        public BigInteger gardenId;

        public BigInteger megaCandyCount;
    }

    public static class MintEventResponse {
        public Log log;

        public String to;

        public BigInteger amount;
    }

    public static class NewLandLimitEventResponse {
        public Log log;

        public BigInteger newLimit;
    }

    public static class TokensTransferredEventResponse {
        public Log log;

        public String wallet;

        public BigInteger value;
    }

    public static class TransferEventResponse {
        public Log log;

        public String from;

        public String to;

        public BigInteger value;
    }

    public static class ApprovalEventResponse {
        public Log log;

        public String owner;

        public String spender;

        public BigInteger value;
    }
}
