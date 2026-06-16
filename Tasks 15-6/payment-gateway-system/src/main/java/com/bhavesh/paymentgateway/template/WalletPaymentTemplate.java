package com.bhavesh.paymentgateway.template;

public class WalletPaymentTemplate extends AbstractPaymentTemplate {
    @Override
    protected void validate() {
        System.out.println("Validation User wallet");
    }

    @Override
    protected void calculateCharges(double amount) {
        System.out.println("Charges : " + amount * 0.5);
    }

    @Override
    protected void process(double amount) {
        System.out.println("Processing Wallet Payment");
    }

    @Override
    protected void sendNotification() {
        System.out.println("Notification sent");
    }
}
