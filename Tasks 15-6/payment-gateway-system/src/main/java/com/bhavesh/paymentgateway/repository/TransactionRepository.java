package com.bhavesh.paymentgateway.repository;

import org.springframework.stereotype.Repository;

@Repository
public class TransactionRepository {
    public void saveTransaction(){
        System.out.println("Transaction saved");
    }
}
