package com.web3example.web3;


import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.response.EthGetBalance;
import org.web3j.protocol.core.methods.response.EthTransaction;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.tuples.generated.Tuple5;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;

import static org.web3j.tx.Contract.GAS_LIMIT;
import static org.web3j.tx.Contract.GAS_PRICE;

/**
 * A simple web3j application that demonstrates a number of core features of web3j:
 * <p>
 * <ol>
 * <li>Connecting to a node on the Ethereum network</li>
 * <li>Loading an Ethereum wallet file</li>
 * <li>Sending Ether from one address to another</li>
 * <li>Deploying a smart contract to the network</li>
 * <li>Reading a value from the deployed smart contract</li>
 * <li>Updating a value in the deployed smart contract</li>
 * <li>Viewing an event logged by the smart contract</li>
 * </ol>
 * <p>
 * <p>To run this demo, you will need to provide:
 * <p>
 * <ol>
 * <li>Ethereum client (or node) endpoint. The simplest thing to do is
 * <a href="https://infura.io/register.html">request a free access token from Infura</a></li>
 * <li>A wallet file. This can be generated using the web3j
 * <a href="https://docs.web3j.io/command_line.html">command line tools</a></li>
 * <li>Some Ether. This can be requested from the
 * <a href="https://www.rinkeby.io/#faucet">Rinkeby Faucet</a></li>
 * </ol>
 * <p>
 * <p>For further background information, refer to the project README.
 */
public class Application {

//    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws Exception {
        new Application().run();
    }

    Credentials credentials;
    Web3j web3j;

    private void run() throws Exception {

        // We start by creating a new web3j instance to connect to remote nodes on the network.
//        web3j = Web3j.build(new HttpService(
//                "https://rinkeby.infura.io/oShbYdHLGQhi0rn1audL"));  // FIXME: Enter your Infura token here;
        web3j = Web3j.build(new HttpService("https://mainnet.infura.io/oShbYdHLGQhi0rn1audL"));  // FIXME:
////        log.info("Connected to Ethereum client version: "
////                + web3j.web3ClientVersion().send().getWeb3ClientVersion());
//        System.out.println("connect");
//        // We then need to load our Ethereum wallet file
//        // FIXME: Generate a new wallet file using the web3j command line tools https://docs.web3j.io/command_line.html
        credentials =
                WalletUtils.loadCredentials(
                        "123123123",
                        "path/to/key");


        long counter = 0l;


        while (true) {
            EthGetBalance ethGetBalance = web3j
                    .ethGetBalance(credentials.getAddress(), DefaultBlockParameterName.LATEST)
                    .sendAsync()
                    .get();

            if (ethGetBalance != null) {
                System.out.println("<<<<<<<<"+(++counter)+">>>>>>>>"+ethGetBalance.getBalance().toString());
            }
        }
        // FIXME: Request some Ether for the Rinkeby test network at https://www.rinkeby.io/#faucet
//        log.info("Sending 1 Wei ("
//                + Convert.fromWei("1", Convert.Unit.ETHER).toPlainString() + " Ether)");
//        log.info("Sending 1 Eth ("
//                + Convert.fromWei("1", Convert.Unit.ETHER).toPlainString() + " Ether)");
//        TransactionReceipt transferReceipt = Transfer.sendFunds(
//                web3j, credentials,
//                "0x3596ddf5181c9F6Aa1bcE87D967Bf227DDE70ddf",  // you can put any address here
//                BigDecimal.ONE, Convert.Unit.ETHER)  // 1 wei = 10^-18 Ether
//                .send();
//        log.info("Transaction complete, view it at https://rinkeby.etherscan.io/tx/"
//                + transferReceipt.getTransactionHash());

//        // Now lets deploy a smart contract
//        log.info("Deploying smart contract");
//        UnicornBreeding contract = UnicornBreeding.deploy(
//                web3j, credentials,
//                ManagedTransaction.GAS_PRICE, Contract.GAS_LIMIT,
//                "0x3596ddf5181c9F6Aa1bcE87D967Bf227DDE70ddf").send();

//
//        String contractAddress = contract.getContractAddress();
//        log.info("Smart contract deployed to address " + contractAddress);
//        log.info("View contract at https://rinkeby.etherscan.io/address/" + contractAddress);
//


//        tokenUse();
//        createUnicornAndSubscribe();
//        observer();
//        createUnicornEvents.add(contract.createUnicornEventObservable(DefaultBlockParameterName.EARLIEST, DefaultBlockParameterName.LATEST)
//                .subscribe((a) ->{
//                    System.out.println(a);
//                }));
//        contract.createUnicornEventObservable(DefaultBlockParameterName.EARLIEST, DefaultBlockParameterName.LATEST)
//                .subscribe((a) ->{
//                    System.out.println(a);
//                });
//        log.info(send.getStatus());

//        log.info("Contract valid "+contract.isValid());
//        log.info("Value stored in remote smart contract: " + contract.greet().send());

        // Lets modify the value in our smart contract
//        TransactionReceipt transactionReceipt = contract.newGreeting("Well hello again").send();
//
//        log.info("New value stored in remote smart contract: " + contract.greet().send());

        // Events enable us to log specific events happening during the execution of our smart
        // contract to the blockchain. Index events cannot be logged in their entirety.
        // For Strings and arrays, the hash of values is provided, not the original value.
        // For further information, refer to https://docs.web3j.io/filters.html#filters-and-events
//        for (UnicornBreeding.ModifiedEventResponse event : contract.getModifiedEvents(transactionReceipt)) {
//            log.info("Modify event fired, previous value: " + event.oldGreeting
//                    + ", new value: " + event.newGreeting);
//            log.info("Indexed event previous value: " + Numeric.toHexString(event.oldGreetingIdx)
//                    + ", new value: " + Numeric.toHexString(event.newGreetingIdx));
//        }

//        System.out.println(contract.);
    }

    private void observer() {
//        Subscription subscription = web3j.catchUpToLatestAndSubscribeToNewTransactionsObservable(
//                DefaultBlockParameterName.LATEST)
//                .subscribe(tx -> {
//                    System.out.println(tx);
//                });

//        EthFilter filter = new EthFilter(DefaultBlockParameterName.LATEST,
//                DefaultBlockParameterName.LATEST, "0x4fc7f4a7b02f2bb1de99095b23b4cf78eebece08");


//        web3j.ethLogObservable(filter).subscribe(log -> {
//            System.out.println(log);
//        });

//        web3j.transactionObservable().filter(tx -> tx.getFrom().equalsIgnoreCase("0xDa9e2E12472239f996B1C0E0FCDE965695FE6983"))
//                .subscribe(tx -> {
//                    System.out.println(tx);
//                });
//        Subscription subscription = web3j
//                .catchUpToLatestAndSubscribeToNewTransactionsObservable(DefaultBlockParameterName.LATEST)
//                .filter(tx -> tx.getFrom()
//                .equalsIgnoreCase("0xDa9e2E12472239f996B1C0E0FCDE965695FE6983"))
//                .subscribe(tx -> {
//            System.out.println(tx);
//        });
//            web3j.ethGetTransactionCount("0xDa9e2E12472239f996B1C0E0FCDE965695FE6983",
//                    DefaultBlockParameterName.LATEST).observable().subscribe(tx -> {
//                System.out.println(tx);
//            });
//        try {
//            EthGetTransactionReceipt send = web3j.ethGetTransactionReceipt("0xDa9e2E12472239f996B1C0E0FCDE965695FE6983").send();
//            Optional<TransactionReceipt> tr = send.getTransactionReceipt();
//            System.out.println(tr);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            EthTransaction send = web3j.ethGetTransactionByHash("0x6e7b751219372781584cc1a24e21fe754b07c37788e9db1aac3732847baa1c65 ").send();
//            System.out.println(send);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

//    private void createUnicornAndSubscribe() throws Exception {
//        UnicornBreeding contract = UnicornBreeding.load(
//                "0x3a8a5401f9639d4b69fd5ee6512d06fcd754e174", web3j, credentials, GAS_PRICE, GAS_LIMIT);
//        BigInteger unicornPrice = contract.getCreateUnicornPrice().send();
//        System.out.println(unicornPrice);
//        TransactionReceipt send = contract.createUnicorn(unicornPrice).send();
//
////        Subscription subscription = web3j.blockObservable(false).subscribe(block -> {
////            System.out.println(block);
////        });
//
//        List<UnicornBreeding.CreateUnicornEventResponse> createUnicornEvents = contract.getCreateUnicornEvents(send);
//        for (UnicornBreeding.CreateUnicornEventResponse event : createUnicornEvents) {
//            System.out.println("unicorn id " + event.unicornId + " by owner " + event.owner);
//        }
//    }
//
//    private void tokenUse() throws Exception {
//        UnicornToken contract = UnicornToken.load(
//                "0xae102cdc1cd9c869af690744372316d41eb4d971", web3j, credentials, GAS_PRICE, GAS_LIMIT);
//
//        List<BigInteger> send = contract.unicornsOf(credentials.getAddress()).send();
//        BigInteger balance = contract.balanceOf(credentials.getAddress()).send();
//
//        if (balance.compareTo(new BigInteger("0")) == 1) {
//            Tuple5<byte[], BigInteger, BigInteger, BigInteger, String> unicorn = contract.unicorns(send.get(0)).send();
//        }
//        System.out.println("Balance equal " + balance);
//    }
}
