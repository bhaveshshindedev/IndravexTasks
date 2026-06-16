package com.bhavesh.paymentgateway.payment;

import com.bhavesh.paymentgateway.template.AbstractPaymentTemplate;
import org.springframework.stereotype.Component;

@Component
public class WalletPayment extends AbstractPaymentTemplate
        implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        makePayment(amount);
    }

    @Override
    protected void validate() {
        System.out.println("Validating Wallet Account");
    }

    @Override
    protected void calculateCharges(double amount) {
        System.out.println("Charges : 5");
    }

    @Override
    protected void process(double amount) {
        System.out.println("Processing Wallet Payment : " + amount);
    }

    @Override
    protected void sendNotification() {
        System.out.println("Wallet Notification Sent");
    }
}