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
public class UnicornBalances extends Contract {
    private static final String BINARY = "60606040526000805460a060020a60ff0219169055341561001f57600080fd5b6040516020806114ee8339810160405280805160008054600160a060020a031916600160a060020a03838116919091179182905591935083925016632a70d1e7306040517c010000000000000000000000000000000000000000000000000000000063ffffffff8416028152600160a060020a039091166004820152602401600060405180830381600087803b15156100b757600080fd5b5af115156100c457600080fd5b5050505050611416806100d86000396000f3006060604052600436106100d75763ffffffff60e060020a6000350416630422ddf381146100dc5780632e1a7d4d14610103578063338b5dea1461011b5780633cac23871461013d578063508493bc1461015c5780635b99df7f1461019357806360010ab2146101cb578063882d851c146101ef5780638dca7a01146102175780638f4ffcb1146102465780638fa4c0b1146102b25780639e281a98146102da578063c0ee0b8a146102fc578063d0e30db01461032b578063e1c7392a14610333578063f18d03cc14610346578063f7888aec14610374575b600080fd5b34156100e757600080fd5b6100ef610399565b604051901515815260200160405180910390f35b341561010e57600080fd5b6101196004356103f4565b005b341561012657600080fd5b610119600160a060020a0360043516602435610533565b341561014857600080fd5b6100ef600160a060020a0360043516610542565b341561016757600080fd5b610181600160a060020a0360043581169060243516610557565b60405190815260200160405180910390f35b341561019e57600080fd5b6100ef600160a060020a03600435811690602435811690604435906064358116906084351660a435610574565b34156101d657600080fd5b610119600160a060020a036004351660243515156108fe565b34156101fa57600080fd5b6100ef600160a060020a036004358116906024351660443561099e565b341561022257600080fd5b61022a610a7b565b604051600160a060020a03909116815260200160405180910390f35b341561025157600080fd5b61011960048035600160a060020a0390811691602480359260443516919060849060643590810190830135806020601f82018190048102016040519081016040528181529291906020840183838082843750949650610a8a95505050505050565b34156102bd57600080fd5b6100ef600160a060020a0360043581169060243516604435610aef565b34156102e557600080fd5b610119600160a060020a0360043516602435610b98565b341561030757600080fd5b6100ef60048035600160a060020a0316906024803591604435918201910135610d60565b610119610d8f565b341561033e57600080fd5b610119610e57565b341561035157600080fd5b6100ef600160a060020a0360043581169060243581169060443516606435610ed5565b341561037f57600080fd5b610181600160a060020a036004358116906024351661110c565b60008054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156103d957600080fd5b5af115156103e657600080fd5b505050604051805191505090565b33600160a060020a031660009081526000805160206113cb83398151915260205260409020548190101561042757600080fd5b33600160a060020a031660009081526000805160206113cb833981519152602052604090205461045d908263ffffffff6111c716565b33600160a060020a031660008181526000805160206113cb833981519152602052604090819020929092559082156108fc0290839051600060405180830381858888f1935050505015156104b057600080fd5b33600160a060020a03811660009081526000805160206113cb8339815191526020526040808220547ff341246adaac6f497bc2a656f546ab9e182111d630394f0c57c710a59a2cb567939185919051600160a060020a0394851681529290931660208301526040808301919091526060820192909252608001905180910390a150565b61053e3383836111d9565b5050565b60026020526000908152604090205460ff1681565b600160209081526000928352604080842090915290825290205481565b6000805481908190600160a060020a031663541334f63360405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b15156105c957600080fd5b5af115156105d657600080fd5b5050506040518051905015156105eb57600080fd5b6105fb878563ffffffff6111c716565b600160a060020a038a1660009081526002602052604090205490925060ff161561081a575087600160a060020a038116631ffa451c89878760405160e060020a63ffffffff8616028152600160a060020a0393841660048201529190921660248201526044810191909152606401602060405180830381600087803b151561068257600080fd5b5af1151561068f57600080fd5b5050506040518051905015156106a457600080fd5b80600160a060020a0316631ffa451c89888560405160e060020a63ffffffff8616028152600160a060020a0393841660048201529190921660248201526044810191909152606401602060405180830381600087803b151561070557600080fd5b5af1151561071257600080fd5b50505060405180519050151561072757600080fd5b30600160a060020a031685600160a060020a0316141561079e57600160a060020a03808a16600090815260016020908152604080832093891683529290522054610777908563ffffffff6113b416565b600160a060020a03808b166000908152600160209081526040808320938a16835292905220555b30600160a060020a031686600160a060020a0316141561081557600160a060020a03808a166000908152600160209081526040808320938a16835292905220546107ee908363ffffffff6113b416565b600160a060020a03808b166000908152600160209081526040808320938b16835292905220555b6108ef565b600160a060020a03808a166000908152600160209081526040808320938c1683529290522054610850908863ffffffff6111c716565b600160a060020a038a811660009081526001602090815260408083208d85168452909152808220939093559088168152205461088c90836113b4565b600160a060020a038a811660009081526001602090815260408083208b8516845290915280822093909355908716815220546108c890856113b4565b600160a060020a03808b166000908152600160209081526040808320938a16835292905220555b50600198975050505050505050565b600054600160a060020a0316638f84aa096040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561093d57600080fd5b5af1151561094a57600080fd5b50505060405180519050600160a060020a031633600160a060020a031614151561097357600080fd5b600160a060020a03919091166000908152600260205260409020805460ff1916911515919091179055565b60008054600160a060020a031663541334f63360405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b15156109ef57600080fd5b5af115156109fc57600080fd5b505050604051805190501515610a1157600080fd5b600160a060020a03808516600090815260016020908152604080832093871683529290522054610a47908363ffffffff6111c716565b600160a060020a03808616600090815260016020818152604080842094891684529390529190209190915590509392505050565b600054600160a060020a031681565b610a958483856111d9565b7f098d215dbf4904f38cce693a04004ed58db6d54491b91c083e277144ce38b4ee848484604051600160a060020a03938416815260208101929092529091166040808301919091526060909101905180910390a150505050565b60008054600160a060020a031663541334f63360405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b1515610b4057600080fd5b5af11515610b4d57600080fd5b505050604051805190501515610b6257600080fd5b600160a060020a03808516600090815260016020908152604080832093871683529290522054610a47908363ffffffff6113b416565b600160a060020a0382161515610bad57600080fd5b600160a060020a03821660009081526002602052604090205460ff1615610bd357600080fd5b600160a060020a038083166000908152600160209081526040808320339094168352929052205481901015610c0757600080fd5b600160a060020a0380831660009081526001602090815260408083203390941683529290522054610c3e908263ffffffff6111c716565b600160a060020a03808416600081815260016020908152604080832033958616845290915290819020939093559163a9059cbb919084905160e060020a63ffffffff8516028152600160a060020a0390921660048301526024820152604401602060405180830381600087803b1515610cb657600080fd5b5af11515610cc357600080fd5b505050604051805190501515610cd857600080fd5b600160a060020a03808316600090815260016020908152604080832033948516845290915290819020547ff341246adaac6f497bc2a656f546ab9e182111d630394f0c57c710a59a2cb5679285929091859151600160a060020a0394851681529290931660208301526040808301919091526060820192909252608001905180910390a15050565b6000805474010000000000000000000000000000000000000000900460ff16156100d757506001949350505050565b60003411610d9c57600080fd5b33600160a060020a031660009081526000805160206113cb8339815191526020526040902054610dd2903463ffffffff6113b416565b33600160a060020a03811660009081526000805160206113cb83398151915260205260408082208490557fdcbc1c05240f31ff3ad067ef1ee35ce4997762752e3a095284754544f4c709d793919291349151600160a060020a0394851681529290931660208301526040808301919091526060820192909252608001905180910390a1565b60005433600160a060020a03908116911614610e7257600080fd5b600054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610eb157600080fd5b5af11515610ebe57600080fd5b505050604051805190501515610ed357600080fd5b565b60008054600160a060020a031663541334f63360405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b1515610f2657600080fd5b5af11515610f3357600080fd5b505050604051805190501515610f4857600080fd5b600160a060020a03851660009081526002602052604090205460ff16156110685784600160a060020a0316631ffa451c85858560405160e060020a63ffffffff8616028152600160a060020a0393841660048201529190921660248201526044810191909152606401602060405180830381600087803b1515610fca57600080fd5b5af11515610fd757600080fd5b505050604051805190501515610fec57600080fd5b30600160a060020a031683600160a060020a0316141561106357600160a060020a0380861660009081526001602090815260408083209387168352929052205461103c908363ffffffff6113b416565b600160a060020a038087166000908152600160209081526040808320938816835292905220555b611101565b600160a060020a0380861660009081526001602090815260408083209388168352929052205461109e908363ffffffff6111c716565b600160a060020a038681166000908152600160209081526040808320898516845290915280822093909355908516815220546110da90836113b4565b600160a060020a038087166000908152600160209081526040808320938816835292905220555b506001949350505050565b600160a060020a03821660009081526002602052604081205460ff16156111995782600160a060020a03166370a082318360405160e060020a63ffffffff8416028152600160a060020a039091166004820152602401602060405180830381600087803b151561117b57600080fd5b5af1151561118857600080fd5b5050506040518051905090506111c1565b50600160a060020a038083166000908152600160209081526040808320938516835292905220545b92915050565b6000828211156111d357fe5b50900390565b600160a060020a03821615156111ee57600080fd5b600160a060020a03821660009081526002602052604090205460ff161561121457600080fd5b6000811161122157600080fd5b6000805474ff0000000000000000000000000000000000000000191674010000000000000000000000000000000000000000179055600160a060020a0382166323b872dd84308460405160e060020a63ffffffff8616028152600160a060020a0393841660048201529190921660248201526044810191909152606401602060405180830381600087803b15156112b757600080fd5b5af115156112c457600080fd5b5050506040518051905015156112d957600080fd5b6000805474ff000000000000000000000000000000000000000019168155600160a060020a038084168252600160209081526040808420928716845291905290205461132b908263ffffffff6113b416565b600160a060020a03838116600090815260016020908152604080832093881683529290528190208290557fdcbc1c05240f31ff3ad067ef1ee35ce4997762752e3a095284754544f4c709d79184918691859151600160a060020a0394851681529290931660208301526040808301919091526060820192909252608001905180910390a1505050565b6000828201838110156113c357fe5b93925050505600a6eef7e35abe7026729641147f7915573c7e97b47efa546f5f6e3230263bcb49a165627a7a72305820d52858ba5b90ce9d2d969f0a760da7347bc382a20594a2de73278faa6965b4a30029";

    protected UnicornBalances(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected UnicornBalances(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public List<DepositEventResponse> getDepositEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("Deposit", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<DepositEventResponse> responses = new ArrayList<DepositEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            DepositEventResponse typedResponse = new DepositEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.token = (String) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.user = (String) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.amount = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
            typedResponse.balance = (BigInteger) eventValues.getNonIndexedValues().get(3).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<DepositEventResponse> depositEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("Deposit", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, DepositEventResponse>() {
            @Override
            public DepositEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                DepositEventResponse typedResponse = new DepositEventResponse();
                typedResponse.log = log;
                typedResponse.token = (String) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.user = (String) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.amount = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
                typedResponse.balance = (BigInteger) eventValues.getNonIndexedValues().get(3).getValue();
                return typedResponse;
            }
        });
    }

    public List<WithdrawEventResponse> getWithdrawEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("Withdraw", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<WithdrawEventResponse> responses = new ArrayList<WithdrawEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            WithdrawEventResponse typedResponse = new WithdrawEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.token = (String) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.user = (String) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.amount = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
            typedResponse.balance = (BigInteger) eventValues.getNonIndexedValues().get(3).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<WithdrawEventResponse> withdrawEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("Withdraw", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, WithdrawEventResponse>() {
            @Override
            public WithdrawEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                WithdrawEventResponse typedResponse = new WithdrawEventResponse();
                typedResponse.log = log;
                typedResponse.token = (String) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.user = (String) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.amount = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
                typedResponse.balance = (BigInteger) eventValues.getNonIndexedValues().get(3).getValue();
                return typedResponse;
            }
        });
    }

    public List<FundsMigratedEventResponse> getFundsMigratedEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("FundsMigrated", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<FundsMigratedEventResponse> responses = new ArrayList<FundsMigratedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            FundsMigratedEventResponse typedResponse = new FundsMigratedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.user = (String) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.newContract = (String) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<FundsMigratedEventResponse> fundsMigratedEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("FundsMigrated", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, FundsMigratedEventResponse>() {
            @Override
            public FundsMigratedEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                FundsMigratedEventResponse typedResponse = new FundsMigratedEventResponse();
                typedResponse.log = log;
                typedResponse.user = (String) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.newContract = (String) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
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

    public List<ReceiveApprovalEventResponse> getReceiveApprovalEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("ReceiveApproval", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Address>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<ReceiveApprovalEventResponse> responses = new ArrayList<ReceiveApprovalEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            ReceiveApprovalEventResponse typedResponse = new ReceiveApprovalEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.from = (String) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.token = (String) eventValues.getNonIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<ReceiveApprovalEventResponse> receiveApprovalEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("ReceiveApproval", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Address>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, ReceiveApprovalEventResponse>() {
            @Override
            public ReceiveApprovalEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                ReceiveApprovalEventResponse typedResponse = new ReceiveApprovalEventResponse();
                typedResponse.log = log;
                typedResponse.from = (String) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.token = (String) eventValues.getNonIndexedValues().get(2).getValue();
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

    public RemoteCall<TransactionReceipt> withdraw(BigInteger amount) {
        Function function = new Function(
                "withdraw", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(amount)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> depositToken(String token, BigInteger amount) {
        Function function = new Function(
                "depositToken", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(token), 
                new org.web3j.abi.datatypes.generated.Uint256(amount)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Boolean> trustedTokens(String param0) {
        Function function = new Function("trustedTokens", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<BigInteger> tokens(String param0, String param1) {
        Function function = new Function("tokens", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(param0), 
                new org.web3j.abi.datatypes.Address(param1)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> transferWithFee(String _token, String _userFrom, BigInteger _fullPrice, String _feeTaker, String _priceTaker, BigInteger _price) {
        Function function = new Function(
                "transferWithFee", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_token), 
                new org.web3j.abi.datatypes.Address(_userFrom), 
                new org.web3j.abi.datatypes.generated.Uint256(_fullPrice), 
                new org.web3j.abi.datatypes.Address(_feeTaker), 
                new org.web3j.abi.datatypes.Address(_priceTaker), 
                new org.web3j.abi.datatypes.generated.Uint256(_price)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setTrustedTokens(String _token, Boolean _trusted) {
        Function function = new Function(
                "setTrustedTokens", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_token), 
                new org.web3j.abi.datatypes.Bool(_trusted)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> tokenMinus(String _token, String _user, BigInteger _value) {
        Function function = new Function(
                "tokenMinus", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_token), 
                new org.web3j.abi.datatypes.Address(_user), 
                new org.web3j.abi.datatypes.generated.Uint256(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> unicornManagement() {
        Function function = new Function("unicornManagement", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> receiveApproval(String _from, BigInteger _value, String _token, byte[] _extraData) {
        Function function = new Function(
                "receiveApproval", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_from), 
                new org.web3j.abi.datatypes.generated.Uint256(_value), 
                new org.web3j.abi.datatypes.Address(_token), 
                new org.web3j.abi.datatypes.DynamicBytes(_extraData)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> tokenPlus(String _token, String _user, BigInteger _value) {
        Function function = new Function(
                "tokenPlus", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_token), 
                new org.web3j.abi.datatypes.Address(_user), 
                new org.web3j.abi.datatypes.generated.Uint256(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> withdrawToken(String token, BigInteger amount) {
        Function function = new Function(
                "withdrawToken", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(token), 
                new org.web3j.abi.datatypes.generated.Uint256(amount)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Boolean> tokenFallback(String sender, BigInteger amount, byte[] data) {
        Function function = new Function("tokenFallback", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(sender), 
                new org.web3j.abi.datatypes.generated.Uint256(amount), 
                new org.web3j.abi.datatypes.DynamicBytes(data)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<TransactionReceipt> deposit(BigInteger weiValue) {
        Function function = new Function(
                "deposit", 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, weiValue);
    }

    public RemoteCall<TransactionReceipt> init() {
        Function function = new Function(
                "init", 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> transfer(String _token, String _from, String _to, BigInteger _value) {
        Function function = new Function(
                "transfer", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_token), 
                new org.web3j.abi.datatypes.Address(_from), 
                new org.web3j.abi.datatypes.Address(_to), 
                new org.web3j.abi.datatypes.generated.Uint256(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> balanceOf(String token, String user) {
        Function function = new Function("balanceOf", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(token), 
                new org.web3j.abi.datatypes.Address(user)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<UnicornBalances> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _unicornManagementAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornManagementAddress)));
        return deployRemoteCall(UnicornBalances.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<UnicornBalances> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _unicornManagementAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornManagementAddress)));
        return deployRemoteCall(UnicornBalances.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static UnicornBalances load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new UnicornBalances(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static UnicornBalances load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new UnicornBalances(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static class DepositEventResponse {
        public Log log;

        public String token;

        public String user;

        public BigInteger amount;

        public BigInteger balance;
    }

    public static class WithdrawEventResponse {
        public Log log;

        public String token;

        public String user;

        public BigInteger amount;

        public BigInteger balance;
    }

    public static class FundsMigratedEventResponse {
        public Log log;

        public String user;

        public String newContract;
    }

    public static class FundsTransferredEventResponse {
        public Log log;

        public String dividendManager;

        public BigInteger value;
    }

    public static class ReceiveApprovalEventResponse {
        public Log log;

        public String from;

        public BigInteger value;

        public String token;
    }
}
