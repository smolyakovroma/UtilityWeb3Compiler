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
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.DynamicBytes;
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
import org.web3j.tuples.generated.Tuple2;
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
public class UnicornToken extends Contract {
    private static final String BINARY = "6060604052341561000f57600080fd5b604051602080611b0f8339810160405280805160008054600160a060020a031916600160a060020a03838116919091179182905591935083925016632a70d1e7306040517c010000000000000000000000000000000000000000000000000000000063ffffffff8416028152600160a060020a039091166004820152602401600060405180830381600087803b15156100a757600080fd5b5af115156100b457600080fd5b5050505050611a47806100c86000396000f3006060604052600436106101505763ffffffff60e060020a6000350416630422ddf3811461015557806306fdde031461017c578063095ea7b31461020657806318160ddd1461022a57806323b872dd1461024f5780632a6dd48f146102775780632dcbac97146102a9578063316524e5146102bf5780634cba4ca4146102e1578063614984d1146103375780636352211e1461036657806369f467c11461037c57806370a0823114610473578063818d4b5d146104925780638758ba8f146104b45780638dca7a01146104ca57806395d89b41146104dd57806396c81be5146104f0578063a9059cbb14610562578063b2e6ceeb14610584578063b53645601461059a578063bb90db7f146105b0578063bcf0dd8e146105c3578063c1072279146105eb578063ce5a5df7146105fe578063ddc6a1711461061d578063e1c7392a1461063f578063fe55932a14610652575b600080fd5b341561016057600080fd5b6101686106a8565b604051901515815260200160405180910390f35b341561018757600080fd5b61018f610704565b60405160208082528190810183818151815260200191508051906020019080838360005b838110156101cb5780820151838201526020016101b3565b50505050905090810190601f1680156101f85780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561021157600080fd5b610228600160a060020a036004351660243561073b565b005b341561023557600080fd5b61023d610819565b60405190815260200160405180910390f35b341561025a57600080fd5b610228600160a060020a036004358116906024351660443561081f565b341561028257600080fd5b61028d600435610860565b604051600160a060020a03909116815260200160405180910390f35b34156102b457600080fd5b61018f60043561087b565b34156102ca57600080fd5b610228600480359060248035908101910135610939565b34156102ec57600080fd5b610228600480359060446024803590810190830135806020601f82018190048102016040519081016040528181529291906020840183838082843750949650610a2295505050505050565b341561034257600080fd5b610350600435602435610b17565b60405160ff909116815260200160405180910390f35b341561037157600080fd5b61028d600435610c20565b341561038757600080fd5b610392600435610c3b565b604051808060200180602001838103835285818151815260200191508051906020019080838360005b838110156103d35780820151838201526020016103bb565b50505050905090810190601f1680156104005780820380516001836020036101000a031916815260200191505b50838103825284818151815260200191508051906020019080838360005b8381101561043657808201518382015260200161041e565b50505050905090810190601f1680156104635780820380516001836020036101000a031916815260200191505b5094505050505060405180910390f35b341561047e57600080fd5b61023d600160a060020a0360043516610d8f565b341561049d57600080fd5b610168600160a060020a0360043516602435610daa565b34156104bf57600080fd5b610228600435610dee565b34156104d557600080fd5b61028d610e20565b34156104e857600080fd5b61018f610e2f565b34156104fb57600080fd5b61050f600160a060020a0360043516610e66565b60405160208082528190810183818151815260200191508051906020019060200280838360005b8381101561054e578082015183820152602001610536565b505050509050019250505060405180910390f35b341561056d57600080fd5b610228600160a060020a0360043516602435610ee8565b341561058f57600080fd5b610228600435610f09565b34156105a557600080fd5b610228600435610f34565b34156105bb57600080fd5b61028d610f63565b34156105ce57600080fd5b610228600160a060020a0360043581169060243516604435610f72565b34156105f657600080fd5b61028d610fe7565b341561060957600080fd5b61023d600160a060020a0360043516610ff6565b341561062857600080fd5b610168600160a060020a03600435166024356111d5565b341561064a57600080fd5b6102286111fb565b341561065d57600080fd5b610168600480359060446024803590810190830135806020601f8201819004810201604051908101604052818152929190602084018383808284375094965061137295505050505050565b60008054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156106e857600080fd5b5af115156106f557600080fd5b50505060405180519150505b90565b60408051908101604052600981527f556e69636f726e474f0000000000000000000000000000000000000000000000602082015281565b806107463382610daa565b151561075157600080fd5b33600160a060020a031683600160a060020a03161415151561077257600080fd5b600061077d83610860565b600160a060020a031614158061079b5750600160a060020a03831615155b156108145760008281526007602052604090819020805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a038681169182179092559133909116907f8c5be1e5ebec7d5bd14f71427d1e84f3dd0314c0f7b2291e5b200ac8c7c3b9259085905190815260200160405180910390a35b505050565b60035490565b30600160a060020a031682600160a060020a03161415151561084057600080fd5b61084a33826111d5565b151561085557600080fd5b61081483838361147d565b600090815260076020526040902054600160a060020a031690565b6108836118e3565b600560008381526020019081526020016000206000018054600181600116156101000203166002900480601f01602080910402602001604051908101604052809291908181526020018280546001816001161561010002031660029004801561092d5780601f106109025761010080835404028352916020019161092d565b820191906000526020600020905b81548152906001019060200180831161091057829003601f168201915b50505050509050919050565b600054600160a060020a0316635550e4f36040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561097857600080fd5b5af1151561098557600080fd5b50505060405180519050600160a060020a031633600160a060020a03161415156109ae57600080fd5b6000838152600560205260409020546002600019610100600184161502019091160415156108145760008381526005602052604090206109ef9083836118f5565b50827fa3f7f3e0b681e4fc9c86b91ffcc62caeb512735803bd4949c69aa08aab9af9ad60405160405180910390a2505050565b600054600160a060020a0316631d296e8d6040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610a6157600080fd5b5af11515610a6e57600080fd5b50505060405180519050600160a060020a031633600160a060020a0316141515610a9757600080fd5b6000828152600a602052604090205460ff161515610ab457600080fd5b6000828152600a60209081526040808320805460ff1916905560059091529020818051610ae5929160200190611973565b50817f5bf9bb6f1e1bcdcd3365d65dd853dc3a3d9dfff3fc239f67430868ce7fed613d60405160405180910390a25050565b6000828152600560205260408120546002838102916001808401908216156101000260001901909116919091041015610b535760009150610c19565b610bd960056000868152602001908152602001600020600001826001018154600181600116156101000203166002900481101515610b8d57fe5b815460011615610bac5790600052602060002090602091828204019190065b90547f0100000000000000000000000000000000000000000000000000000000000000911a810204611532565b60008581526005602052604090208054600491610c0d918590600260001961010060018416150201909116048110610b8d57fe5b60ff169060020a021791505b5092915050565b600090815260066020526040902054600160a060020a031690565b6005602052806000526040600020600091509050806000018054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610ce75780601f10610cbc57610100808354040283529160200191610ce7565b820191906000526020600020905b815481529060010190602001808311610cca57829003601f168201915b505050505090806001018054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610d855780601f10610d5a57610100808354040283529160200191610d85565b820191906000526020600020905b815481529060010190602001808311610d6857829003601f168201915b5050505050905082565b600160a060020a031660009081526008602052604090205490565b600082600160a060020a0316610dbf83610c20565b600160a060020a0316148015610de757506000610ddb83610c20565b600160a060020a031614155b9392505050565b80610df93382610daa565b1515610e0457600080fd5b506000908152600a60205260409020805460ff19166001179055565b600054600160a060020a031681565b60408051908101604052600381527f554e470000000000000000000000000000000000000000000000000000000000602082015281565b610e6e6118e3565b6008600083600160a060020a0316600160a060020a0316815260200190815260200160002080548060200260200160405190810160405280929190818152602001828054801561092d57602002820191906000526020600020905b815481526020019060010190808311610ec95750505050509050919050565b80610ef33382610daa565b1515610efe57600080fd5b61081433848461147d565b610f1333826111d5565b1515610f1e57600080fd5b610f31610f2a82610c20565b338361147d565b50565b80610f3f3382610daa565b1515610f4a57600080fd5b506000908152600a60205260409020805460ff19169055565b600154600160a060020a031681565b600054600160a060020a03166379400add6040518163ffffffff1660e060020a028152600401602060405180830381600087803b1515610fb157600080fd5b5af11515610fbe57600080fd5b50505060405180519050600160a060020a031633600160a060020a031614151561085557600080fd5b600254600160a060020a031681565b600080548190600160a060020a03166307ec4b426040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561103857600080fd5b5af1151561104557600080fd5b50505060405180519050600160a060020a031633600160a060020a031614806110d45750600054600160a060020a0316635c3d9ff36040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156110a857600080fd5b5af115156110b557600080fd5b50505060405180519050600160a060020a031633600160a060020a0316145b15156110df57600080fd5b600160a060020a03831615156110f457600080fd5b50600480546001810190915561110a8382611564565b604080519081016040528060006040518059106111245750595b818152601f19601f83011681016020016040529050815260200160206040519081016040908152600080835291909252838152600560205220815181908051611171929160200190611973565b5060208201518160010190805161118c929160200190611973565b5090505082600160a060020a031660007fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef8360405190815260200160405180910390a392915050565b600082600160a060020a03166111ea83610860565b600160a060020a0316149392505050565b60005433600160a060020a0390811691161461121657600080fd5b600054600160a060020a0316635c975abb6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561125557600080fd5b5af1151561126257600080fd5b50505060405180519050151561127757600080fd5b600054600160a060020a03166307ec4b426040518163ffffffff1660e060020a028152600401602060405180830381600087803b15156112b657600080fd5b5af115156112c357600080fd5b50505060405180516002805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a039283161790556000541690506379400add6040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561132d57600080fd5b5af1151561133a57600080fd5b50505060405180516001805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a039290921691909117905550565b600061137c6118e3565b836113873382610daa565b151561139257600080fd5b600560008681526020019081526020016000206001018054600181600116156101000203166002900480601f01602080910402602001604051908101604052809291908181526020018280546001816001161561010002031660029004801561143c5780601f106114115761010080835404028352916020019161143c565b820191906000526020600020905b81548152906001019060200180831161141f57829003601f168201915b5050505050915081511561144f57600080fd5b6000858152600560205260409020600101848051611471929160200190611973565b50600195945050505050565b6114878382610daa565b151561149257600080fd5b600160a060020a03821615156114a757600080fd5b6114b081610c20565b600160a060020a03838116911614156114c857600080fd5b6114d28382611618565b6114dc8382611699565b6114e68282611564565b81600160a060020a031683600160a060020a03167fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef8360405190815260200160405180910390a3505050565b6000603a8260ff16106115595760618260ff1610611551576057611554565b60375b61155c565b60305b909103919050565b600081815260066020526040812054600160a060020a03161561158657600080fd5b506000818152600660209081526040808320805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a03871690811790915583526008909152902080549081600181016115dc83826119e1565b506000918252602080832091909101849055838252600990526040902081905560035461161090600163ffffffff6118c216565b600355505050565b6116228282610daa565b151561162d57600080fd5b600081815260076020526040808220805473ffffffffffffffffffffffffffffffffffffffff19169055600160a060020a038416907f8c5be1e5ebec7d5bd14f71427d1e84f3dd0314c0f7b2291e5b200ac8c7c3b9259084905190815260200160405180910390a35050565b60008060006116a88585610daa565b15156116b357600080fd5b600084815260096020908152604080832054600160a060020a03891684526008909252909120549093506116ee90600163ffffffff6118d116565b600160a060020a03861660009081526008602052604090208054919350908390811061171657fe5b6000918252602080832090910154868352600682526040808420805473ffffffffffffffffffffffffffffffffffffffff19169055600160a060020a038916845260089092529120805491925082918590811061176f57fe5b6000918252602080832090910192909255600160a060020a03871681526008909152604081208054849081106117a157fe5b6000918252602080832090910192909255600160a060020a03871681526008909152604090208054906117d89060001983016119e1565b50600084815260096020526040808220829055828252902083905560035461180790600163ffffffff6118d116565b600355600154600160a060020a03166374268ff28560405160e060020a63ffffffff84160281526004810191909152602401600060405180830381600087803b151561185257600080fd5b5af1151561185f57600080fd5b5050600254600160a060020a0316905063c7024b988560405160e060020a63ffffffff84160281526004810191909152602401600060405180830381600087803b15156118ab57600080fd5b5af115156118b857600080fd5b5050505050505050565b600082820183811015610de757fe5b6000828211156118dd57fe5b50900390565b60206040519081016040526000815290565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106119365782800160ff19823516178555611963565b82800160010185558215611963579182015b82811115611963578235825591602001919060010190611948565b5061196f929150611a01565b5090565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106119b457805160ff1916838001178555611963565b82800160010185558215611963579182015b828111156119635782518255916020019190600101906119c6565b815481835581811511610814576000838152602090206108149181019083015b61070191905b8082111561196f5760008155600101611a075600a165627a7a7230582002bd49b4a34c83e3e32a466350baa477b06033f49f459d4ae2dd852e25bb751f0029";

    protected UnicornToken(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected UnicornToken(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
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
            typedResponse.unicornId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
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
                typedResponse.unicornId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
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
            typedResponse.approved = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.unicornId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
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
                typedResponse.approved = (String) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.unicornId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<UnicornGeneSetEventResponse> getUnicornGeneSetEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("UnicornGeneSet", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList());
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<UnicornGeneSetEventResponse> responses = new ArrayList<UnicornGeneSetEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            UnicornGeneSetEventResponse typedResponse = new UnicornGeneSetEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.unicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<UnicornGeneSetEventResponse> unicornGeneSetEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("UnicornGeneSet", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList());
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, UnicornGeneSetEventResponse>() {
            @Override
            public UnicornGeneSetEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                UnicornGeneSetEventResponse typedResponse = new UnicornGeneSetEventResponse();
                typedResponse.log = log;
                typedResponse.unicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<UnicornGeneUpdateEventResponse> getUnicornGeneUpdateEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("UnicornGeneUpdate", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList());
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<UnicornGeneUpdateEventResponse> responses = new ArrayList<UnicornGeneUpdateEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            UnicornGeneUpdateEventResponse typedResponse = new UnicornGeneUpdateEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.unicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<UnicornGeneUpdateEventResponse> unicornGeneUpdateEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("UnicornGeneUpdate", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList());
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, UnicornGeneUpdateEventResponse>() {
            @Override
            public UnicornGeneUpdateEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                UnicornGeneUpdateEventResponse typedResponse = new UnicornGeneUpdateEventResponse();
                typedResponse.log = log;
                typedResponse.unicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
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

    public List<UnicornTourFreezingTimeSetEventResponse> getUnicornTourFreezingTimeSetEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("UnicornTourFreezingTimeSet", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<UnicornTourFreezingTimeSetEventResponse> responses = new ArrayList<UnicornTourFreezingTimeSetEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            UnicornTourFreezingTimeSetEventResponse typedResponse = new UnicornTourFreezingTimeSetEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.unicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.time = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<UnicornTourFreezingTimeSetEventResponse> unicornTourFreezingTimeSetEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("UnicornTourFreezingTimeSet", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, UnicornTourFreezingTimeSetEventResponse>() {
            @Override
            public UnicornTourFreezingTimeSetEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                UnicornTourFreezingTimeSetEventResponse typedResponse = new UnicornTourFreezingTimeSetEventResponse();
                typedResponse.log = log;
                typedResponse.unicornId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.time = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
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

    public RemoteCall<TransactionReceipt> approve(String _to, BigInteger _unicornId) {
        Function function = new Function(
                "approve", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_to), 
                new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> totalSupply() {
        Function function = new Function("totalSupply", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> transferFrom(String _from, String _to, BigInteger _unicornId) {
        Function function = new Function(
                "transferFrom", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_from), 
                new org.web3j.abi.datatypes.Address(_to), 
                new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> approvedFor(BigInteger _unicornId) {
        Function function = new Function("approvedFor", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<byte[]> getGen(BigInteger _unicornId) {
        Function function = new Function("getGen", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicBytes>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<TransactionReceipt> setGene(BigInteger _unicornId, byte[] _gene) {
        Function function = new Function(
                "setGene", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId), 
                new org.web3j.abi.datatypes.DynamicBytes(_gene)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> updateGene(BigInteger _unicornId, byte[] _gene) {
        Function function = new Function(
                "updateGene", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId), 
                new org.web3j.abi.datatypes.DynamicBytes(_gene)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getUnicornGenByte(BigInteger _unicornId, BigInteger _byteNo) {
        Function function = new Function("getUnicornGenByte", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId), 
                new org.web3j.abi.datatypes.generated.Uint256(_byteNo)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> ownerOf(BigInteger _unicornId) {
        Function function = new Function("ownerOf", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<Tuple2<byte[], String>> unicorns(BigInteger param0) {
        final Function function = new Function("unicorns", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicBytes>() {}, new TypeReference<Utf8String>() {}));
        return new RemoteCall<Tuple2<byte[], String>>(
                new Callable<Tuple2<byte[], String>>() {
                    @Override
                    public Tuple2<byte[], String> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<byte[], String>(
                                (byte[]) results.get(0).getValue(), 
                                (String) results.get(1).getValue());
                    }
                });
    }

    public RemoteCall<BigInteger> balanceOf(String _owner) {
        Function function = new Function("balanceOf", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<Boolean> owns(String _claimant, BigInteger _unicornId) {
        Function function = new Function("owns", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_claimant), 
                new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<TransactionReceipt> approveForGeneLab(BigInteger _unicornId) {
        Function function = new Function(
                "approveForGeneLab", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
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

    public RemoteCall<List> unicornsOf(String _owner) {
        Function function = new Function("unicornsOf", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Uint256>>() {}));
        return new RemoteCall<List>(
                new Callable<List>() {
                    @Override
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteCall<TransactionReceipt> transfer(String _to, BigInteger _unicornId) {
        Function function = new Function(
                "transfer", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_to), 
                new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> takeOwnership(BigInteger _unicornId) {
        Function function = new Function(
                "takeOwnership", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> clearApprovalForGeneLab(BigInteger _unicornId) {
        Function function = new Function(
                "clearApprovalForGeneLab", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> unicornMarket() {
        Function function = new Function("unicornMarket", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> marketTransfer(String _from, String _to, BigInteger _unicornId) {
        Function function = new Function(
                "marketTransfer", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_from), 
                new org.web3j.abi.datatypes.Address(_to), 
                new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> unicornBreeding() {
        Function function = new Function("unicornBreeding", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> createUnicorn(String _owner) {
        Function function = new Function(
                "createUnicorn", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Boolean> allowance(String _owner, BigInteger _unicornId) {
        Function function = new Function("allowance", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner), 
                new org.web3j.abi.datatypes.generated.Uint256(_unicornId)), 
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

    public RemoteCall<TransactionReceipt> setName(BigInteger _unicornId, String _name) {
        Function function = new Function(
                "setName", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_unicornId), 
                new org.web3j.abi.datatypes.Utf8String(_name)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<UnicornToken> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _unicornManagementAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornManagementAddress)));
        return deployRemoteCall(UnicornToken.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<UnicornToken> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _unicornManagementAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_unicornManagementAddress)));
        return deployRemoteCall(UnicornToken.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static UnicornToken load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new UnicornToken(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static UnicornToken load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new UnicornToken(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static class TransferEventResponse {
        public Log log;

        public String from;

        public String to;

        public BigInteger unicornId;
    }

    public static class ApprovalEventResponse {
        public Log log;

        public String owner;

        public String approved;

        public BigInteger unicornId;
    }

    public static class UnicornGeneSetEventResponse {
        public Log log;

        public BigInteger unicornId;
    }

    public static class UnicornGeneUpdateEventResponse {
        public Log log;

        public BigInteger unicornId;
    }

    public static class UnicornFreezingTimeSetEventResponse {
        public Log log;

        public BigInteger unicornId;

        public BigInteger time;
    }

    public static class UnicornTourFreezingTimeSetEventResponse {
        public Log log;

        public BigInteger unicornId;

        public BigInteger time;
    }
}
