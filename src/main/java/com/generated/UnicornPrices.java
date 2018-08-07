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
import org.web3j.abi.datatypes.generated.Uint64;
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
public class UnicornPrices extends Contract {
    private static final String BINARY = "60606040526101776001818155600291909155670de0b6b3a7640000600381905560048054610e1067ffffffffffffffff1991821681179092556005929092556006805490921617905568270801d946c940000060075568015af1d78b58c400006008556009805460ff191690911790556000600a55341561008057600080fd5b604051602080610e3f8339810160405280805160008054600160a060020a031916600160a060020a03838116919091179182905591935083925016632a70d1e7306040517c010000000000000000000000000000000000000000000000000000000063ffffffff8416028152600160a060020a039091166004820152602401600060405180830381600087803b151561011857600080fd5b5af1151561012557600080fd5b5050505050610d06806101396000396000f30060606040526004361061012f5763ffffffff60e060020a600035041663022565f181146101345780630422ddf31461014c57806332f2360114610173578063354685fb1461018957806335d4a49a1461019f5780636b308ee7146101b557806373def2b7146101da5780637bf9d052146101ed5780638dca7a011461020057806392491f211461022f578063999f4b381461025f57806399d413f4146102725780639ea7647514610285578063a15404b714610298578063aa31e4a0146102ab578063cfa46990146102c1578063cfeb9a97146102d7578063d0d38b65146102f7578063d4331c211461030f578063e1c7392a1461032f578063e51bfd9a14610342578063e5dfbe7814610355578063e84742301461036b578063f01d0e2914610381578063fc22c15c14610397575b600080fd5b341561013f57600080fd5b61014a6004356103aa565b005b341561015757600080fd5b61015f61045a565b604051901515815260200160405180910390f35b341561017e57600080fd5b61014a6004356104b5565b341561019457600080fd5b61014a600435610565565b34156101aa57600080fd5b61014a600435610623565b34156101c057600080fd5b6101c86106d3565b60405190815260200160405180910390f35b34156101e557600080fd5b6101c86106d9565b34156101f857600080fd5b61015f6106df565b341561020b57600080fd5b6102136106e8565b604051600160a060020a03909116815260200160405180910390f35b341561023a57600080fd5b6102426106f7565b60405167ffffffffffffffff909116815260200160405180910390f35b341561026a57600080fd5b6101c8610707565b341561027d57600080fd5b6101c861070d565b341561029057600080fd5b610242610713565b34156102a357600080fd5b6101c8610723565b34156102b657600080fd5b61014a600435610729565b34156102cc57600080fd5b6101c86004356107d9565b34156102e257600080fd5b61014a67ffffffffffffffff600435166107fd565b341561030257600080fd5b61014a60043515156108d3565b341561031a57600080fd5b61014a67ffffffffffffffff60043516610971565b341561033a57600080fd5b61014a610a47565b341561034d57600080fd5b6101c8610ac5565b341561036057600080fd5b61014a600435610acb565b341561037657600080fd5b6101c8600435610b89565b341561038c57600080fd5b61014a600435610b9a565b34156103a257600080fd5b6101c8610c4a565b600054600160a060020a031663cf73a1bc6040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156103e957600080fd5b5af115156103f657600080fd5b50505060405180519050600160a060020a031633600160a060020a031614151561041f57600080fd5b60078190557fe136a1289cf1ab86e70cf453aa04dda03fd3bed3c2481b0662e9a8efa1e2a8eb8160405190815260200160405180910390a150565b60008054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561049a57600080fd5b5af115156104a757600080fd5b505050604051805191505090565b600054600160a060020a031663cf73a1bc6040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156104f457600080fd5b5af1151561050157600080fd5b50505060405180519050600160a060020a031633600160a060020a031614151561052a57600080fd5b60058190557f5e3a0e5343df289405b46840aed7c5b8d560abe65f007e3e4fd1bdb6ed0117f98160405190815260200160405180910390a150565b600054600160a060020a031663cf73a1bc6040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156105a457600080fd5b5af115156105b157600080fd5b50505060405180519050600160a060020a031633600160a060020a03161415156105da57600080fd5b6109c481106105e857600080fd5b60028190557f3d024e165d6b2fe059099a3c3c8d81e93981a9424967e3d6ddea6e6af5d73a498160405190815260200160405180910390a150565b600054600160a060020a031663cf73a1bc6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561066257600080fd5b5af1151561066f57600080fd5b50505060405180519050600160a060020a031633600160a060020a031614151561069857600080fd5b60038190557fe564098c5cd2c65a635c73665d2b5bcaf8934232c52206a9fb79d81ecb6ca93d8160405190815260200160405180910390a150565b60055481565b60035481565b60095460ff1681565b600054600160a060020a031681565b60065467ffffffffffffffff1681565b60025481565b60015481565b60045467ffffffffffffffff1681565b60085481565b600054600160a060020a031663cf73a1bc6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561076857600080fd5b5af1151561077557600080fd5b50505060405180519050600160a060020a031633600160a060020a031614151561079e57600080fd5b600a8190557fb2b64ec3f4c18a4ea3329df9d86b4abb877dc0b4fb206cfe2165d904cf82559b8160405190815260200160405180910390a150565b60006107f76107ea83600254610c50565b839063ffffffff610c8216565b92915050565b600054600160a060020a031663cf73a1bc6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561083c57600080fd5b5af1151561084957600080fd5b50505060405180519050600160a060020a031633600160a060020a031614151561087257600080fd5b6004805467ffffffffffffffff1916603c830267ffffffffffffffff161790557fe44219bd9323234be2f858860a7c9f3818a8e1a444e0c145504fb2f3a26e05918160405167ffffffffffffffff909116815260200160405180910390a150565b600054600160a060020a0316638f84aa096040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561091257600080fd5b5af1151561091f57600080fd5b50505060405180519050600160a060020a031633600160a060020a031614151561094857600080fd5b60095460ff161515811515141561095e57600080fd5b6009805460ff1916911515919091179055565b600054600160a060020a031663cf73a1bc6040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156109b057600080fd5b5af115156109bd57600080fd5b50505060405180519050600160a060020a031633600160a060020a03161415156109e657600080fd5b6006805467ffffffffffffffff1916603c830267ffffffffffffffff161790557f4f4686cd35a67fe3d6b289bb78dc7c3af053bc1cb4baac61c2af09194cbb7ce88160405167ffffffffffffffff909116815260200160405180910390a150565b60005433600160a060020a03908116911614610a6257600080fd5b600054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610aa157600080fd5b5af11515610aae57600080fd5b505050604051805190501515610ac357600080fd5b565b600a5481565b600054600160a060020a031663cf73a1bc6040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610b0a57600080fd5b5af11515610b1757600080fd5b50505060405180519050600160a060020a031633600160a060020a0316141515610b4057600080fd5b6109c48110610b4e57600080fd5b60018190557ffece9719f645e842a52f95b7fa3d5a596be5d6fba35dc17efaf5a5715aea0c3a8160405190815260200160405180910390a150565b60006107f76107ea83600154610c50565b600054600160a060020a031663cf73a1bc6040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610bd957600080fd5b5af11515610be657600080fd5b50505060405180519050600160a060020a031633600160a060020a0316141515610c0f57600080fd5b60088190557f4dab9e640c226e16b38d5bd9f4c94ecc6c7ac9c99db77e60e9f5ccbde182bfff8160405190815260200160405180910390a150565b60075481565b600080610c75612710610c69868663ffffffff610c9816565b9063ffffffff610cc316565b90508091505b5092915050565b600082820183811015610c9157fe5b9392505050565b600080831515610cab5760009150610c7b565b50828202828482811515610cbb57fe5b0414610c9157fe5b6000808284811515610cd157fe5b049493505050505600a165627a7a723058206c4f077d1cb1ad8606a7fd9ebccc2c0ac768c546b70bb6e253f448a11c5941920029";

    protected UnicornPrices(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected UnicornPrices(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public List<NewCreateUnicornPriceEventResponse> getNewCreateUnicornPriceEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("NewCreateUnicornPrice", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<NewCreateUnicornPriceEventResponse> responses = new ArrayList<NewCreateUnicornPriceEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewCreateUnicornPriceEventResponse typedResponse = new NewCreateUnicornPriceEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.priceCandy = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<NewCreateUnicornPriceEventResponse> newCreateUnicornPriceEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("NewCreateUnicornPrice", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, NewCreateUnicornPriceEventResponse>() {
            @Override
            public NewCreateUnicornPriceEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                NewCreateUnicornPriceEventResponse typedResponse = new NewCreateUnicornPriceEventResponse();
                typedResponse.log = log;
                typedResponse.priceCandy = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<NewSubFreezingPriceEventResponse> getNewSubFreezingPriceEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("NewSubFreezingPrice", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<NewSubFreezingPriceEventResponse> responses = new ArrayList<NewSubFreezingPriceEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewSubFreezingPriceEventResponse typedResponse = new NewSubFreezingPriceEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.price = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<NewSubFreezingPriceEventResponse> newSubFreezingPriceEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("NewSubFreezingPrice", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, NewSubFreezingPriceEventResponse>() {
            @Override
            public NewSubFreezingPriceEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                NewSubFreezingPriceEventResponse typedResponse = new NewSubFreezingPriceEventResponse();
                typedResponse.log = log;
                typedResponse.price = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<NewSubFreezingTimeEventResponse> getNewSubFreezingTimeEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("NewSubFreezingTime", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<NewSubFreezingTimeEventResponse> responses = new ArrayList<NewSubFreezingTimeEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewSubFreezingTimeEventResponse typedResponse = new NewSubFreezingTimeEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.time = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<NewSubFreezingTimeEventResponse> newSubFreezingTimeEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("NewSubFreezingTime", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, NewSubFreezingTimeEventResponse>() {
            @Override
            public NewSubFreezingTimeEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                NewSubFreezingTimeEventResponse typedResponse = new NewSubFreezingTimeEventResponse();
                typedResponse.log = log;
                typedResponse.time = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<NewSubTourFreezingPriceEventResponse> getNewSubTourFreezingPriceEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("NewSubTourFreezingPrice", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<NewSubTourFreezingPriceEventResponse> responses = new ArrayList<NewSubTourFreezingPriceEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewSubTourFreezingPriceEventResponse typedResponse = new NewSubTourFreezingPriceEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.price = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<NewSubTourFreezingPriceEventResponse> newSubTourFreezingPriceEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("NewSubTourFreezingPrice", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, NewSubTourFreezingPriceEventResponse>() {
            @Override
            public NewSubTourFreezingPriceEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                NewSubTourFreezingPriceEventResponse typedResponse = new NewSubTourFreezingPriceEventResponse();
                typedResponse.log = log;
                typedResponse.price = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<NewSubTourFreezingTimeEventResponse> getNewSubTourFreezingTimeEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("NewSubTourFreezingTime", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<NewSubTourFreezingTimeEventResponse> responses = new ArrayList<NewSubTourFreezingTimeEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewSubTourFreezingTimeEventResponse typedResponse = new NewSubTourFreezingTimeEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.time = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<NewSubTourFreezingTimeEventResponse> newSubTourFreezingTimeEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("NewSubTourFreezingTime", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, NewSubTourFreezingTimeEventResponse>() {
            @Override
            public NewSubTourFreezingTimeEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                NewSubTourFreezingTimeEventResponse typedResponse = new NewSubTourFreezingTimeEventResponse();
                typedResponse.log = log;
                typedResponse.time = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<NewCreateDividendPercentEventResponse> getNewCreateDividendPercentEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("NewCreateDividendPercent", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<NewCreateDividendPercentEventResponse> responses = new ArrayList<NewCreateDividendPercentEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewCreateDividendPercentEventResponse typedResponse = new NewCreateDividendPercentEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.percent = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<NewCreateDividendPercentEventResponse> newCreateDividendPercentEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("NewCreateDividendPercent", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, NewCreateDividendPercentEventResponse>() {
            @Override
            public NewCreateDividendPercentEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                NewCreateDividendPercentEventResponse typedResponse = new NewCreateDividendPercentEventResponse();
                typedResponse.log = log;
                typedResponse.percent = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<NewSellDividendPercentEventResponse> getNewSellDividendPercentEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("NewSellDividendPercent", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<NewSellDividendPercentEventResponse> responses = new ArrayList<NewSellDividendPercentEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewSellDividendPercentEventResponse typedResponse = new NewSellDividendPercentEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.percent = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<NewSellDividendPercentEventResponse> newSellDividendPercentEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("NewSellDividendPercent", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, NewSellDividendPercentEventResponse>() {
            @Override
            public NewSellDividendPercentEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                NewSellDividendPercentEventResponse typedResponse = new NewSellDividendPercentEventResponse();
                typedResponse.log = log;
                typedResponse.percent = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<NewLandPriceEventResponse> getNewLandPriceEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("NewLandPrice", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<NewLandPriceEventResponse> responses = new ArrayList<NewLandPriceEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewLandPriceEventResponse typedResponse = new NewLandPriceEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse._candyPrice = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<NewLandPriceEventResponse> newLandPriceEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("NewLandPrice", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, NewLandPriceEventResponse>() {
            @Override
            public NewLandPriceEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                NewLandPriceEventResponse typedResponse = new NewLandPriceEventResponse();
                typedResponse.log = log;
                typedResponse._candyPrice = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<NewSelfHybridizationPriceEventResponse> getNewSelfHybridizationPriceEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("NewSelfHybridizationPrice", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<NewSelfHybridizationPriceEventResponse> responses = new ArrayList<NewSelfHybridizationPriceEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewSelfHybridizationPriceEventResponse typedResponse = new NewSelfHybridizationPriceEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.percentCandy = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<NewSelfHybridizationPriceEventResponse> newSelfHybridizationPriceEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("NewSelfHybridizationPrice", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, NewSelfHybridizationPriceEventResponse>() {
            @Override
            public NewSelfHybridizationPriceEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                NewSelfHybridizationPriceEventResponse typedResponse = new NewSelfHybridizationPriceEventResponse();
                typedResponse.log = log;
                typedResponse.percentCandy = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public RemoteCall<TransactionReceipt> setLandPrice(BigInteger _candyPrice) {
        Function function = new Function(
                "setLandPrice", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_candyPrice)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Boolean> isGamePaused() {
        Function function = new Function("isGamePaused", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<TransactionReceipt> setSubTourFreezingPrice(BigInteger _price) {
        Function function = new Function(
                "setSubTourFreezingPrice", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_price)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setSellDividendPercent(BigInteger _percent) {
        Function function = new Function(
                "setSellDividendPercent", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_percent)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setSubFreezingPrice(BigInteger _price) {
        Function function = new Function(
                "setSubFreezingPrice", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_price)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> subTourFreezingPrice() {
        Function function = new Function("subTourFreezingPrice", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> subFreezingPrice() {
        Function function = new Function("subFreezingPrice", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<Boolean> firstRankForFree() {
        Function function = new Function("firstRankForFree", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<String> unicornManagement() {
        Function function = new Function("unicornManagement", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<BigInteger> subTourFreezingTime() {
        Function function = new Function("subTourFreezingTime", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint64>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> sellDividendPercent() {
        Function function = new Function("sellDividendPercent", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> createDividendPercent() {
        Function function = new Function("createDividendPercent", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> subFreezingTime() {
        Function function = new Function("subFreezingTime", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint64>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> createUnicornPrice() {
        Function function = new Function("createUnicornPrice", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setSelfHybridizationPrice(BigInteger _percentCandy) {
        Function function = new Function(
                "setSelfHybridizationPrice", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_percentCandy)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getSellUnicornFullPrice(BigInteger _price) {
        Function function = new Function("getSellUnicornFullPrice", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_price)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setSubFreezingTime(BigInteger _time) {
        Function function = new Function(
                "setSubFreezingTime", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint64(_time)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setFirstRankForFree(Boolean _firstRankForFree) {
        Function function = new Function(
                "setFirstRankForFree", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Bool(_firstRankForFree)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setSubTourFreezingTime(BigInteger _time) {
        Function function = new Function(
                "setSubTourFreezingTime", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint64(_time)), 
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

    public RemoteCall<BigInteger> selfHybridizationPrice() {
        Function function = new Function("selfHybridizationPrice", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setCreateDividendPercent(BigInteger _percent) {
        Function function = new Function(
                "setCreateDividendPercent", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_percent)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getHybridizationFullPrice(BigInteger _price) {
        Function function = new Function("getHybridizationFullPrice", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_price)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setCreateUnicornPrice(BigInteger _candyPrice) {
        Function function = new Function(
                "setCreateUnicornPrice", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_candyPrice)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> landPrice() {
        Function function = new Function("landPrice", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<UnicornPrices> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _unicornManagementAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornManagementAddress)));
        return deployRemoteCall(UnicornPrices.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<UnicornPrices> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _unicornManagementAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornManagementAddress)));
        return deployRemoteCall(UnicornPrices.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static UnicornPrices load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new UnicornPrices(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static UnicornPrices load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new UnicornPrices(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static class NewCreateUnicornPriceEventResponse {
        public Log log;

        public BigInteger priceCandy;
    }

    public static class NewSubFreezingPriceEventResponse {
        public Log log;

        public BigInteger price;
    }

    public static class NewSubFreezingTimeEventResponse {
        public Log log;

        public BigInteger time;
    }

    public static class NewSubTourFreezingPriceEventResponse {
        public Log log;

        public BigInteger price;
    }

    public static class NewSubTourFreezingTimeEventResponse {
        public Log log;

        public BigInteger time;
    }

    public static class NewCreateDividendPercentEventResponse {
        public Log log;

        public BigInteger percent;
    }

    public static class NewSellDividendPercentEventResponse {
        public Log log;

        public BigInteger percent;
    }

    public static class NewLandPriceEventResponse {
        public Log log;

        public BigInteger _candyPrice;
    }

    public static class NewSelfHybridizationPriceEventResponse {
        public Log log;

        public BigInteger percentCandy;
    }
}
