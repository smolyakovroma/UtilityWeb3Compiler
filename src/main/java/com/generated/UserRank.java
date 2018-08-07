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
import org.web3j.abi.datatypes.Utf8String;
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
public class UserRank extends Contract {
    private static final String BINARY = "60606040526000600455341561001457600080fd5b6040516020806113ad8339810160405280805160008054600160a060020a031916600160a060020a03838116919091179182905591935083925016632a70d1e7306040517c010000000000000000000000000000000000000000000000000000000063ffffffff8416028152600160a060020a039091166004820152602401600060405180830381600087803b15156100ac57600080fd5b5af115156100b957600080fd5b50505050506112e0806100cd6000396000f3006060604052600436106101035763ffffffff60e060020a6000350416630422ddf3811461010857806333575f641461012f5780634b8389fb146101475780634d5edd28146101a357806357e8f401146101d45780636201510a146101f35780637bb98a68146102155780638dca7a011461024457806393962dc114610257578063ac8c7b5c1461026d578063b2d1573f14610286578063b90da496146102a5578063c299a39414610332578063ca21500514610351578063cc53782114610373578063df927bbe14610386578063dfd5dd6b14610422578063e1c7392a14610435578063f793596914610448578063fc0656c91461046a578063fedbceba1461047d575b600080fd5b341561011357600080fd5b61011b610493565b604051901515815260200160405180910390f35b341561013a57600080fd5b6101456004356104ef565b005b341561015257600080fd5b610145600480359060248035919060649060443590810190830135806020601f820181900481020160405190810160405281815292919060208401838380828437509496506104fc95505050505050565b34156101ae57600080fd5b6101c2600160a060020a0360043516610689565b60405190815260200160405180910390f35b34156101df57600080fd5b6101c2600160a060020a036004351661069b565b34156101fe57600080fd5b610145600160a060020a03600435166024356106c3565b341561022057600080fd5b610228610821565b604051600160a060020a03909116815260200160405180910390f35b341561024f57600080fd5b610228610830565b341561026257600080fd5b6101c260043561083f565b341561027857600080fd5b610145600435602435610854565b341561029157600080fd5b6101c2600160a060020a0360043516610999565b34156102b057600080fd5b6102bb6004356109b4565b60405160208082528190810183818151815260200191508051906020019080838360005b838110156102f75780820151838201526020016102df565b50505050905090810190601f1680156103245780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561033d57600080fd5b6101c2600160a060020a0360043516610a72565b341561035c57600080fd5b6101c2600160a060020a0360043516602435610b37565b341561037e57600080fd5b610145610b98565b341561039157600080fd5b61039c600435610ba3565b6040518084815260200183815260200180602001828103825283818151815260200191508051906020019080838360005b838110156103e55780820151838201526020016103cd565b50505050905090810190601f1680156104125780820380516001836020036101000a031916815260200191505b5094505050505060405180910390f35b341561042d57600080fd5b6101c2610c65565b341561044057600080fd5b610145610c6b565b341561045357600080fd5b610145600160a060020a0360043516602435610de2565b341561047557600080fd5b610228610e89565b341561048857600080fd5b6101c2600435610e98565b60008054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156104d357600080fd5b5af115156104e057600080fd5b50505060405180519150505b90565b6104f93382610eaa565b50565b60008054600160a060020a0316638f84aa096040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561053c57600080fd5b5af1151561054957600080fd5b50505060405180519050600160a060020a031633600160a060020a031614151561057257600080fd5b6004546000908152600360205260409020600101548390111561059457600080fd5b5060048054600190810191829055600091825260036020526040909120848155908101839055600281018280516105cf92916020019061120a565b507f4dfa7218f23e2fffde7f66d021e71496605c851729d02e30cd51e79eb249c5736004548584866040518085815260200184815260200180602001838152602001828103825284818151815260200191508051906020019080838360005b8381101561064657808201518382015260200161062e565b50505050905090810190601f1680156106735780820380516001836020036101000a031916815260200191505b509550505050505060405180910390a150505050565b60056020526000908152604090205481565b600160a060020a03166000908152600560209081526040808320548352600390915290205490565b600054600160a060020a031663cf73a1bc6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561070257600080fd5b5af1151561070f57600080fd5b50505060405180519050600160a060020a031633600160a060020a031614151561073857600080fd5b600054600160a060020a031663500569b66040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561077757600080fd5b5af1151561078457600080fd5b50505060405180519050151561079957600080fd5b6004548111156107a857600080fd5b600160a060020a0382166000908152600560205260409020548190106107cd57600080fd5b600160a060020a038216600081815260056020526040908190208390557f7c285278a6f3f22a0cad07d8b4ef15786e47537bdcd4c3feea587a7a4730ca789083905190815260200160405180910390a25050565b600254600160a060020a031681565b600054600160a060020a031681565b60009081526003602052604090206001015490565b60008054600160a060020a031663cf73a1bc6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561089457600080fd5b5af115156108a157600080fd5b50505060405180519050600160a060020a031633600160a060020a03161415156108ca57600080fd5b6000831180156108dc57506004548311155b15156108e757600080fd5b60018311156109145760001983016000908152600360205260409020600101548290111561091457600080fd5b600454831015610940576001808401600090815260036020526040902001548290101561094057600080fd5b506000828152600360205260409081902060018101839055907fd729b36afb3f8597c2f896234539979c7f4df76605d72a7e298705223f3eb6ed90849084905191825260208201526040908101905180910390a1505050565b600160a060020a031660009081526005602052604090205490565b6109bc611288565b600360008381526020019081526020016000206002018054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610a665780601f10610a3b57610100808354040283529160200191610a66565b820191906000526020600020905b815481529060010190602001808311610a4957829003601f168201915b50505050509050919050565b600080548190600160a060020a031663541334f63360405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b1515610ac557600080fd5b5af11515610ad257600080fd5b505050604051805190501515610ae757600080fd5b50600160a060020a038216600090815260056020526040902054600454600190910190811115610b1657600080fd5b600160a060020a039290921660009081526005602052604090208290555090565b600454600090821115610b4957600080fd5b600160a060020a038316600090815260056020526040902054829010610b6e57600080fd5b600160a060020a038316600090815260056020526040902054610b919083611040565b9392505050565b610ba133611084565b565b6003602052806000526040600020600091509050806000015490806001015490806002018054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610c5b5780601f10610c3057610100808354040283529160200191610c5b565b820191906000526020600020905b815481529060010190602001808311610c3e57829003601f168201915b5050505050905083565b60045481565b60005433600160a060020a03908116911614610c8657600080fd5b600054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610cc557600080fd5b5af11515610cd257600080fd5b505050604051805190501515610ce757600080fd5b600054600160a060020a031663a63f5e2a6040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610d2657600080fd5b5af11515610d3357600080fd5b50505060405180516001805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0392831617905560005416905063451437ab6040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610d9d57600080fd5b5af11515610daa57600080fd5b50505060405180516002805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a039290921691909117905550565b600054600160a060020a031663541334f63360405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b1515610e3257600080fd5b5af11515610e3f57600080fd5b505050604051805190501515610e5457600080fd5b600454811115610e6357600080fd5b600160a060020a038216600090815260056020526040902054819011156107cd57600080fd5b600154600160a060020a031681565b60009081526003602052604090205490565b600454600090821115610ebc57600080fd5b600160a060020a038316600090815260056020526040902054829010610ee157600080fd5b600160a060020a038316600090815260056020526040902054610f049083611040565b600254600154600054929350600160a060020a039182169263f18d03cc92918216918791166349b7a9c26040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610f5c57600080fd5b5af11515610f6957600080fd5b505050604051805190508560405160e060020a63ffffffff8716028152600160a060020a0394851660048201529284166024840152921660448201526064810191909152608401602060405180830381600087803b1515610fc957600080fd5b5af11515610fd657600080fd5b505050604051805190501515610feb57600080fd5b600160a060020a038316600081815260056020526040908190208490557f7c285278a6f3f22a0cad07d8b4ef15786e47537bdcd4c3feea587a7a4730ca789084905190815260200160405180910390a2505050565b600080600184015b83811161107c5760008181526003602052604090206001015461107290839063ffffffff6111fb16565b9150600101611048565b509392505050565b600160a060020a0381166000908152600560205260409020546004546001909101908111156110b257600080fd5b600254600154600054600160a060020a039283169263f18d03cc928116918691166349b7a9c26040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561110657600080fd5b5af1151561111357600080fd5b505050604051805160008781526003602052604090819020600101549192505160e060020a63ffffffff8716028152600160a060020a0394851660048201529284166024840152921660448201526064810191909152608401602060405180830381600087803b151561118557600080fd5b5af1151561119257600080fd5b5050506040518051905015156111a757600080fd5b600160a060020a038216600081815260056020526040908190208390557ff2f6ca45f704fd1c9ce0e91f8d553b9d11c0ef903a49b78d7de368f638151afd9083905190815260200160405180910390a25050565b600082820183811015610b9157fe5b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061124b57805160ff1916838001178555611278565b82800160010185558215611278579182015b8281111561127857825182559160200191906001019061125d565b5061128492915061129a565b5090565b60206040519081016040526000815290565b6104ec91905b8082111561128457600081556001016112a05600a165627a7a7230582082f357b37693e3f92d475b50dedcd8c8efc52deeaf01704022b9b9bb47e12f3c0029";

    protected UserRank(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected UserRank(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
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

    public List<NewRankAddedEventResponse> getNewRankAddedEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("NewRankAdded", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<NewRankAddedEventResponse> responses = new ArrayList<NewRankAddedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewRankAddedEventResponse typedResponse = new NewRankAddedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.index = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse._landLimit = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse._title = (String) eventValues.getNonIndexedValues().get(2).getValue();
            typedResponse._priceCandy = (BigInteger) eventValues.getNonIndexedValues().get(3).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<NewRankAddedEventResponse> newRankAddedEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("NewRankAdded", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, NewRankAddedEventResponse>() {
            @Override
            public NewRankAddedEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                NewRankAddedEventResponse typedResponse = new NewRankAddedEventResponse();
                typedResponse.log = log;
                typedResponse.index = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse._landLimit = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse._title = (String) eventValues.getNonIndexedValues().get(2).getValue();
                typedResponse._priceCandy = (BigInteger) eventValues.getNonIndexedValues().get(3).getValue();
                return typedResponse;
            }
        });
    }

    public List<RankChangeEventResponse> getRankChangeEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("RankChange", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<RankChangeEventResponse> responses = new ArrayList<RankChangeEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            RankChangeEventResponse typedResponse = new RankChangeEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.index = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.priceCandy = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<RankChangeEventResponse> rankChangeEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("RankChange", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, RankChangeEventResponse>() {
            @Override
            public RankChangeEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                RankChangeEventResponse typedResponse = new RankChangeEventResponse();
                typedResponse.log = log;
                typedResponse.index = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.priceCandy = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public List<BuyNextRankEventResponse> getBuyNextRankEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("BuyNextRank", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<BuyNextRankEventResponse> responses = new ArrayList<BuyNextRankEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            BuyNextRankEventResponse typedResponse = new BuyNextRankEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.owner = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.index = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<BuyNextRankEventResponse> buyNextRankEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("BuyNextRank", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, BuyNextRankEventResponse>() {
            @Override
            public BuyNextRankEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                BuyNextRankEventResponse typedResponse = new BuyNextRankEventResponse();
                typedResponse.log = log;
                typedResponse.owner = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.index = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<BuyRankEventResponse> getBuyRankEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("BuyRank", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<BuyRankEventResponse> responses = new ArrayList<BuyRankEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            BuyRankEventResponse typedResponse = new BuyRankEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.owner = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.index = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<BuyRankEventResponse> buyRankEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("BuyRank", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, BuyRankEventResponse>() {
            @Override
            public BuyRankEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                BuyRankEventResponse typedResponse = new BuyRankEventResponse();
                typedResponse.log = log;
                typedResponse.owner = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.index = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
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

    public RemoteCall<TransactionReceipt> buyRank(BigInteger _index) {
        Function function = new Function(
                "buyRank", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_index)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> addRank(BigInteger _landLimit, BigInteger _priceCandy, String _title) {
        Function function = new Function(
                "addRank", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_landLimit), 
                new org.web3j.abi.datatypes.generated.Uint256(_priceCandy), 
                new org.web3j.abi.datatypes.Utf8String(_title)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> userRanks(String param0) {
        Function function = new Function("userRanks", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getUserLandLimit(String _user) {
        Function function = new Function("getUserLandLimit", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_user)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> getPreSaleRank(String _user, BigInteger _index) {
        Function function = new Function(
                "getPreSaleRank", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_user), 
                new org.web3j.abi.datatypes.generated.Uint256(_index)), 
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

    public RemoteCall<BigInteger> getRankPrice(BigInteger _index) {
        Function function = new Function("getRankPrice", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_index)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> editRank(BigInteger _index, BigInteger _priceCandy) {
        Function function = new Function(
                "editRank", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_index), 
                new org.web3j.abi.datatypes.generated.Uint256(_priceCandy)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getUserRank(String _user) {
        Function function = new Function("getUserRank", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_user)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> getRankTitle(BigInteger _index) {
        Function function = new Function("getRankTitle", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_index)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> getNextRank(String _user) {
        Function function = new Function(
                "getNextRank", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_user)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getIndividualPrice(String _user, BigInteger _index) {
        Function function = new Function("getIndividualPrice", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_user), 
                new org.web3j.abi.datatypes.generated.Uint256(_index)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> buyNextRank() {
        Function function = new Function(
                "buyNextRank", 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Tuple3<BigInteger, BigInteger, String>> ranks(BigInteger param0) {
        final Function function = new Function("ranks", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}));
        return new RemoteCall<Tuple3<BigInteger, BigInteger, String>>(
                new Callable<Tuple3<BigInteger, BigInteger, String>>() {
                    @Override
                    public Tuple3<BigInteger, BigInteger, String> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple3<BigInteger, BigInteger, String>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (String) results.get(2).getValue());
                    }
                });
    }

    public RemoteCall<BigInteger> ranksCount() {
        Function function = new Function("ranksCount", 
                Arrays.<Type>asList(), 
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

    public RemoteCall<TransactionReceipt> getRank(String _user, BigInteger _index) {
        Function function = new Function(
                "getRank", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_user), 
                new org.web3j.abi.datatypes.generated.Uint256(_index)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> candyTokenAddress() {
        Function function = new Function("candyTokenAddress", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<BigInteger> getRankLandLimit(BigInteger _index) {
        Function function = new Function("getRankLandLimit", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_index)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<UserRank> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _unicornManagementAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornManagementAddress)));
        return deployRemoteCall(UserRank.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<UserRank> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _unicornManagementAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornManagementAddress)));
        return deployRemoteCall(UserRank.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static UserRank load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new UserRank(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static UserRank load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new UserRank(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static class TokensTransferredEventResponse {
        public Log log;

        public String wallet;

        public BigInteger value;
    }

    public static class NewRankAddedEventResponse {
        public Log log;

        public BigInteger index;

        public BigInteger _landLimit;

        public String _title;

        public BigInteger _priceCandy;
    }

    public static class RankChangeEventResponse {
        public Log log;

        public BigInteger index;

        public BigInteger priceCandy;
    }

    public static class BuyNextRankEventResponse {
        public Log log;

        public String owner;

        public BigInteger index;
    }

    public static class BuyRankEventResponse {
        public Log log;

        public String owner;

        public BigInteger index;
    }
}
