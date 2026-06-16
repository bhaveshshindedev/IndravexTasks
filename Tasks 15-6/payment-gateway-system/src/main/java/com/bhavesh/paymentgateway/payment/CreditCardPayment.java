package com.bhavesh.paymentgateway.payment;

import com.bhavesh.paymentgateway.template.AbstractPaymentTemplate;
import com.bhavesh.paymentgateway.template.CreditCardPaymentTemplate;
import org.springframework.stereotype.Component;

@Component
public class CreditCardPayment extends AbstractPaymentTemplate
        implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {

        makePayment(amount);
    }

    @Override
    protected void validate() {
        System.out.println("Validating Credit Card Number");
    }

    @Override
    protected void calculateCharges(double amount) {
        System.out.println("Charges : " + amount * 0.02);
    }

    @Override
    protected void process(double amount) {
        System.out.println("Processing Credit Card Payment");
    }

    @Override
    protected void sendNotification() {
        System.out.println("SMS Notification Sent");
    }
}