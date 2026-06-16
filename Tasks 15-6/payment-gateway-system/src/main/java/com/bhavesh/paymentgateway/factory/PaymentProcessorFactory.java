package com.bhavesh.paymentgateway.factory;

import com.bhavesh.paymentgateway.payment.*;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class PaymentProcessorFactory {

    private final Map<String, PaymentProcessor> processors;

    public PaymentProcessorFactory(
            Map<String, PaymentProcessor> processors) {

        this.processors = processors;
    }

    public PaymentProcessor getPaymentProcessor(String type) {

        switch (type.toUpperCase()) {

            case "UPI":
                return processors.get("UPIPayment");

            case "CREDIT":
                return processors.get("creditCardPayment");

            case "WALLET":
                return processors.get("walletPayment");

            case "NETBANKING":
                return processors.get("netBankingPayment");

            default:
                throw new IllegalArgumentException("Invalid Payment");
        }
    }
}