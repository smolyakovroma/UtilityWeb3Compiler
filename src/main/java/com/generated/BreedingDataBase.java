package com.generated;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple3;
import org.web3j.tuples.generated.Tuple6;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.3.0.
 */
public class BreedingDataBase extends Contract {
    private static final String BINARY = "60606040526175306001556103476002556103e86003556103e8600455600060055560006008556000600c55341561003657600080fd5b6040516020806117c78339810160405280805160008054600160a060020a031916600160a060020a03838116919091179182905591935083925016632a70d1e7306040517c010000000000000000000000000000000000000000000000000000000063ffffffff8416028152600160a060020a039091166004820152602401600060405180830381600087803b15156100ce57600080fd5b5af115156100db57600080fd5b50505050506116d8806100ef6000396000f3006060604052600436106101d45763ffffffff60e060020a600035041663020f899a81146101d95780630422ddf31461020157806309850495146102285780630c516283146102435780630ecda1131461025957806311f02c871461026f5780631327d383146102885780631afed875146102c457806328861d22146102dd5780632b100a31146102f35780633c2f7df51461030c578063438e49c41461031f57806347e4ddf214610335578063549ddcbd1461034e57806354e921cb146103675780635c752f6b1461038257806365089dd81461039557806367ae9e8f146103ab57806374268ff2146103c15780637cd022d4146103d75780638091fbe1146103ea578063883a92e1146103fd5780638a72ea6a146104165780638dca7a011461042c57806391256ed01461045b5780639616b41014610471578063b30387a414610487578063b556a8951461049a578063b5c83592146104b0578063c7024b98146104c6578063cef6db7c146104dc578063d224c3e01461052d578063dd1b89c614610540578063de0d50e414610556578063e1c7392a14610569578063e515a4d11461057c578063eb1bb9d91461058f578063eb56105d146105a2578063ee34c6ad146105b5578063f8cbd580146105cb575b600080fd5b34156101e457600080fd5b6101ef6004356105e1565b60405190815260200160405180910390f35b341561020c57600080fd5b6102146105f9565b604051901515815260200160405180910390f35b341561023357600080fd5b610241600435602435610654565b005b341561024e57600080fd5b6101ef600435610756565b341561026457600080fd5b6101ef60043561076b565b341561027a57600080fd5b610241600435602435610780565b341561029357600080fd5b61029e6004356108d7565b604051928352602083019190915215156040808301919091526060909101905180910390f35b34156102cf57600080fd5b6102416004356024356108fb565b34156102e857600080fd5b6101ef6004356109e1565b34156102fe57600080fd5b6102416004356024356109f3565b341561031757600080fd5b610241610aee565b341561032a57600080fd5b6101ef600435610b71565b341561034057600080fd5b610241600435602435610b86565b341561035957600080fd5b610241600435602435610c9e565b341561037257600080fd5b6102416004356024351515610d99565b341561038d57600080fd5b610241610ea2565b34156103a057600080fd5b6101ef600435610f22565b34156103b657600080fd5b6101ef600435610f37565b34156103cc57600080fd5b610241600435610f49565b34156103e257600080fd5b6101ef611028565b34156103f557600080fd5b6101ef61102e565b341561040857600080fd5b610241600435602435611034565b341561042157600080fd5b61029e60043561112f565b341561043757600080fd5b61043f611153565b604051600160a060020a03909116815260200160405180910390f35b341561046657600080fd5b610214600435611162565b341561047c57600080fd5b61024160043561117a565b341561049257600080fd5b6101ef611277565b34156104a557600080fd5b61024160043561127d565b34156104bb57600080fd5b61021460043561137f565b34156104d157600080fd5b610214600435611397565b34156104e757600080fd5b6104f2600435611514565b604051958652602086019490945260408086019390935260608501919091521515608084015290151560a083015260c0909101905180910390f35b341561053857600080fd5b6101ef61154f565b341561054b57600080fd5b610214600435611555565b341561056157600080fd5b610241611572565b341561057457600080fd5b6102416115f2565b341561058757600080fd5b6101ef611670565b341561059a57600080fd5b6101ef611676565b34156105ad57600080fd5b6101ef61167c565b34156105c057600080fd5b610214600435611682565b34156105d657600080fd5b6101ef60043561169a565b6000818152600660205260409020600101545b919050565b60008054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561063957600080fd5b5af1151561064657600080fd5b505050604051805191505090565b600054600160a060020a03166307ec4b426040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561069357600080fd5b5af115156106a057600080fd5b50505060405180519050600160a060020a031633600160a060020a0316148061072f5750600054600160a060020a0316639d5bf5026040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561070357600080fd5b5af1151561071057600080fd5b50505060405180519050600160a060020a031633600160a060020a0316145b151561073a57600080fd5b6000918252600960205260409091206003018054919091039055565b60009081526009602052604090206001015490565b60009081526009602052604090206003015490565b600054600160a060020a03166307ec4b426040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156107bf57600080fd5b5af115156107cc57600080fd5b50505060405180519050600160a060020a031633600160a060020a0316148061085b5750600054600160a060020a0316639d5bf5026040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561082f57600080fd5b5af1151561083c57600080fd5b50505060405180519050600160a060020a031633600160a060020a0316145b151561086657600080fd5b6060604051908101604090815260085482526020808301849052600182840152600085815260069091522081518155602082015181600101556040820151600291909101805460ff191691151591909117905550506008805460018101909155600090815260076020526040902055565b60066020526000908152604090208054600182015460029092015490919060ff1683565b600054600160a060020a03166379400add6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561093a57600080fd5b5af1151561094757600080fd5b50505060405180519050600160a060020a031633600160a060020a031614151561097057600080fd5b60606040519081016040908152600c54825260208083018490526001828401526000858152600a9091522081518155602082015181600101556040820151600291909101805460ff19169115159190911790555050600c8054600181019091556000908152600b6020526040902055565b600b6020526000908152604090205481565b600054600160a060020a03166307ec4b426040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610a3257600080fd5b5af11515610a3f57600080fd5b50505060405180519050600160a060020a031633600160a060020a03161480610ace5750600054600160a060020a0316639d5bf5026040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610aa257600080fd5b5af11515610aaf57600080fd5b50505060405180519050600160a060020a031633600160a060020a0316145b1515610ad957600080fd5b60009182526009602052604090912060020155565b600054600160a060020a0316635c3d9ff36040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610b2d57600080fd5b5af11515610b3a57600080fd5b50505060405180519050600160a060020a031633600160a060020a0316141515610b6357600080fd5b600354600180549091019055565b6000908152600a602052604090206001015490565b600054600160a060020a03166307ec4b426040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610bc557600080fd5b5af11515610bd257600080fd5b50505060405180519050600160a060020a031633600160a060020a03161480610c615750600054600160a060020a0316639d5bf5026040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610c3557600080fd5b5af11515610c4257600080fd5b50505060405180519050600160a060020a031633600160a060020a0316145b1515610c6c57600080fd5b600091825260096020526040822060048101805460ff1961ff0019909116610100171660019081179091559181550155565b600054600160a060020a03166307ec4b426040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610cdd57600080fd5b5af11515610cea57600080fd5b50505060405180519050600160a060020a031633600160a060020a03161480610d795750600054600160a060020a0316639d5bf5026040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610d4d57600080fd5b5af11515610d5a57600080fd5b50505060405180519050600160a060020a031633600160a060020a0316145b1515610d8457600080fd5b60009182526009602052604090912060010155565b600054600160a060020a03166307ec4b426040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610dd857600080fd5b5af11515610de557600080fd5b50505060405180519050600160a060020a031633600160a060020a03161480610e745750600054600160a060020a0316639d5bf5026040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610e4857600080fd5b5af11515610e5557600080fd5b50505060405180519050600160a060020a031633600160a060020a0316145b1515610e7f57600080fd5b600091825260096020526040909120600401805460ff1916911515919091179055565b600054600160a060020a0316635c3d9ff36040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610ee157600080fd5b5af11515610eee57600080fd5b50505060405180519050600160a060020a031633600160a060020a0316141515610f1757600080fd5b600280546001019055565b60009081526009602052604090206002015490565b60076020526000908152604090205481565b600054600160a060020a03166379400add6040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610f8857600080fd5b5af11515610f9557600080fd5b50505060405180519050600160a060020a031633600160a060020a0316141515610fbe57600080fd5b6000818152600a602081815260408084208054600c8054600019018082558752600b8086528488205488528686528488209290925580548752908452828620548254875283872055548552908420849055938352528082556001820155600201805460ff19169055565b60045481565b60055481565b600054600160a060020a03166307ec4b426040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561107357600080fd5b5af1151561108057600080fd5b50505060405180519050600160a060020a031633600160a060020a0316148061110f5750600054600160a060020a0316639d5bf5026040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156110e357600080fd5b5af115156110f057600080fd5b50505060405180519050600160a060020a031633600160a060020a0316145b151561111a57600080fd5b60009182526009602052604090912060030155565b600a6020526000908152604090208054600182015460029092015490919060ff1683565b600054600160a060020a031681565b60009081526009602052604090206004015460ff1690565b600054600160a060020a03166307ec4b426040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156111b957600080fd5b5af115156111c657600080fd5b50505060405180519050600160a060020a031633600160a060020a031614806112555750600054600160a060020a0316639d5bf5026040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561122957600080fd5b5af1151561123657600080fd5b50505060405180519050600160a060020a031633600160a060020a0316145b151561126057600080fd5b600090815260096020526040902080546001019055565b60025481565b600054600160a060020a03166307ec4b426040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156112bc57600080fd5b5af115156112c957600080fd5b50505060405180519050600160a060020a031633600160a060020a031614806113585750600054600160a060020a0316639d5bf5026040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561132c57600080fd5b5af1151561133957600080fd5b50505060405180519050600160a060020a031633600160a060020a0316145b151561136357600080fd5b6000908152600960205260409020600190810180549091019055565b6000908152600a602052604090206002015460ff1690565b60008054600160a060020a03166307ec4b426040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156113d757600080fd5b5af115156113e457600080fd5b50505060405180519050600160a060020a031633600160a060020a031614806114735750600054600160a060020a0316639d5bf5026040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561144757600080fd5b5af1151561145457600080fd5b50505060405180519050600160a060020a031633600160a060020a0316145b151561147e57600080fd5b60008281526006602052604090206002015460ff161561150c5750600081815260066020818152604080842080546008805460001901808255875260078086528488205488528686528488209290925580548752908452828620548254875283872055548552908420849055848452919052818155600180820192909255600201805460ff191690556105f4565b506000919050565b600960205260009081526040902080546001820154600283015460038401546004909401549293919290919060ff8082169161010090041686565b60035481565b600090815260096020526040902060040154610100900460ff1690565b600054600160a060020a0316635c3d9ff36040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156115b157600080fd5b5af115156115be57600080fd5b50505060405180519050600160a060020a031633600160a060020a03161415156115e757600080fd5b600580546001019055565b60005433600160a060020a0390811691161461160d57600080fd5b600054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561164c57600080fd5b5af1151561165957600080fd5b50505060405180519050151561166e57600080fd5b565b60015481565b60085481565b600c5481565b60009081526006602052604090206002015460ff1690565b600090815260096020526040902054905600a165627a7a723058204b2142d50d13258335fe3ebfc22eb6f31c41cda11a1cad2511ff8dfcf6bcc09f0029";

    protected BreedingDataBase(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected BreedingDataBase(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<BigInteger> hybridizationPrice(BigInteger _unicornId) {
        Function function = new Function("hybridizationPrice", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<Boolean> isGamePaused() {
        Function function = new Function("isGamePaused", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<TransactionReceipt> minusFreezeEndTime(BigInteger _unicornId, BigInteger _time) {
        Function function = new Function(
                "minusFreezeEndTime", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId), 
                new org.web3j.abi.datatypes.generated.Uint256(_time)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> freezeHybridizationsCount(BigInteger _unicornId) {
        Function function = new Function("freezeHybridizationsCount", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> freezeEndTime(BigInteger _unicornId) {
        Function function = new Function("freezeEndTime", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> createHybridization(BigInteger _unicornId, BigInteger _price) {
        Function function = new Function(
                "createHybridization", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId), 
                new org.web3j.abi.datatypes.generated.Uint256(_price)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Tuple3<BigInteger, BigInteger, Boolean>> hybridizations(BigInteger param0) {
        final Function function = new Function("hybridizations", 
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

    public RemoteCall<TransactionReceipt> createOffer(BigInteger _unicornId, BigInteger _priceCandy) {
        Function function = new Function(
                "createOffer", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId), 
                new org.web3j.abi.datatypes.generated.Uint256(_priceCandy)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> market(BigInteger param0) {
        Function function = new Function("market", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setStatsSumHours(BigInteger _unicornId, BigInteger _statsSumHours) {
        Function function = new Function(
                "setStatsSumHours", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId), 
                new org.web3j.abi.datatypes.generated.Uint256(_statsSumHours)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> incGen0Limit() {
        Function function = new Function(
                "incGen0Limit", 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> offerPrice(BigInteger _unicornId) {
        Function function = new Function("offerPrice", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> createFreeze(BigInteger _unicornId, BigInteger _index) {
        Function function = new Function(
                "createFreeze", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId), 
                new org.web3j.abi.datatypes.generated.Uint256(_index)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setFreezeHybridizationsCount(BigInteger _unicornId, BigInteger _count) {
        Function function = new Function(
                "setFreezeHybridizationsCount", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId), 
                new org.web3j.abi.datatypes.generated.Uint256(_count)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setFreezeMustCalculate(BigInteger _unicornId, Boolean _mustCalculate) {
        Function function = new Function(
                "setFreezeMustCalculate", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId), 
                new org.web3j.abi.datatypes.Bool(_mustCalculate)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> incGen0Count() {
        Function function = new Function(
                "incGen0Count", 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> freezeStatsSumHours(BigInteger _unicornId) {
        Function function = new Function("freezeStatsSumHours", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> hybridizationList(BigInteger param0) {
        Function function = new Function("hybridizationList", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> deleteOffer(BigInteger _unicornId) {
        Function function = new Function(
                "deleteOffer", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> gen0PresaleLimit() {
        Function function = new Function("gen0PresaleLimit", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> gen0PresaleCount() {
        Function function = new Function("gen0PresaleCount", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setFreezeEndTime(BigInteger _unicornId, BigInteger _time) {
        Function function = new Function(
                "setFreezeEndTime", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId), 
                new org.web3j.abi.datatypes.generated.Uint256(_time)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Tuple3<BigInteger, BigInteger, Boolean>> offers(BigInteger param0) {
        final Function function = new Function("offers", 
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

    public RemoteCall<String> unicornManagement() {
        Function function = new Function("unicornManagement", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<Boolean> freezeMustCalculate(BigInteger _unicornId) {
        Function function = new Function("freezeMustCalculate", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<TransactionReceipt> incFreezeIndex(BigInteger _unicornId) {
        Function function = new Function(
                "incFreezeIndex", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> gen0Count() {
        Function function = new Function("gen0Count", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> incFreezeHybridizationsCount(BigInteger _unicornId) {
        Function function = new Function(
                "incFreezeHybridizationsCount", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Boolean> offerExists(BigInteger _unicornId) {
        Function function = new Function("offerExists", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<TransactionReceipt> deleteHybridization(BigInteger _unicornId) {
        Function function = new Function(
                "deleteHybridization", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Tuple6<BigInteger, BigInteger, BigInteger, BigInteger, Boolean, Boolean>> unicornsFreeze(BigInteger param0) {
        final Function function = new Function("unicornsFreeze", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Bool>() {}, new TypeReference<Bool>() {}));
        return new RemoteCall<Tuple6<BigInteger, BigInteger, BigInteger, BigInteger, Boolean, Boolean>>(
                new Callable<Tuple6<BigInteger, BigInteger, BigInteger, BigInteger, Boolean, Boolean>>() {
                    @Override
                    public Tuple6<BigInteger, BigInteger, BigInteger, BigInteger, Boolean, Boolean> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple6<BigInteger, BigInteger, BigInteger, BigInteger, Boolean, Boolean>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (BigInteger) results.get(3).getValue(), 
                                (Boolean) results.get(4).getValue(), 
                                (Boolean) results.get(5).getValue());
                    }
                });
    }

    public RemoteCall<BigInteger> gen0Step() {
        Function function = new Function("gen0Step", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<Boolean> freezeExists(BigInteger _unicornId) {
        Function function = new Function("freezeExists", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<TransactionReceipt> incGen0PresaleCount() {
        Function function = new Function(
                "incGen0PresaleCount", 
                Arrays.<Type>asList(), 
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

    public RemoteCall<BigInteger> gen0Limit() {
        Function function = new Function("gen0Limit", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> hybridizationListSize() {
        Function function = new Function("hybridizationListSize", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> marketSize() {
        Function function = new Function("marketSize", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<Boolean> hybridizationExists(BigInteger _unicornId) {
        Function function = new Function("hybridizationExists", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<BigInteger> freezeIndex(BigInteger _unicornId) {
        Function function = new Function("freezeIndex", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<BreedingDataBase> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _unicornManagementAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornManagementAddress)));
        return deployRemoteCall(BreedingDataBase.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<BreedingDataBase> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _unicornManagementAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornManagementAddress)));
        return deployRemoteCall(BreedingDataBase.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static BreedingDataBase load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new BreedingDataBase(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static BreedingDataBase load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new BreedingDataBase(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
