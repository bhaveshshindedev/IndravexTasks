package com.bhavesh.paymentgateway.template;

public class CreditCardPaymentTemplate extends AbstractPaymentTemplate {
    @Override
    protected void validate() {
        System.out.println("Validating Credit Card Num.");
    }

    @Override
    protected void calculateCharges(double amount) {
        System.out.println("Charges : " + amount * 0.2);
    }

    @Override
    protected void process(double amount) {
        System.out.println("Processing crd payment");
    }

    @Override
    protected void sendNotification() {
        System.out.println("SMS Notification sent");
    }
}
