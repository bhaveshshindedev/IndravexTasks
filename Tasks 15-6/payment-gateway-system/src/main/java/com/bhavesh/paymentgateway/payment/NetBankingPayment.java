package com.bhavesh.paymentgateway.payment;

import org.springframework.stereotype.Component;

@Component
public class NetBankingPayment implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("NetBanking Payment: ₹" + amount);
    }
}
