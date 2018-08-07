package com.web3example.web3;

import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.Request;
import org.web3j.protocol.core.methods.response.EthAccounts;
import org.web3j.protocol.http.HttpService;

public class Main1 {
    public static void main(String[] args) {
        Web3j web3j = Web3j.build(new HttpService());

        Request<?, EthAccounts> ethAccountsRequest = web3j.ethAccounts();


    }
}
