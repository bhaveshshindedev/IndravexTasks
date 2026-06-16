package com.bhavesh.paymentgateway.payment;

import com.bhavesh.paymentgateway.template.AbstractPaymentTemplate;
import com.bhavesh.paymentgateway.template.UPIPaymentTemplate;
import org.springframework.stereotype.Component;

@Component
public class UPIPayment extends AbstractPaymentTemplate implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        makePayment(amount);
    }

    @Override
    protected void validate() {
        System.out.println("Validate UPI Id");
    }

    @Override
    protected void calculateCharges(double amount) {
        System.out.println("Charges : Rs. 0");
    }

    @Override
    protected void process(double amount) {
        System.out.println("Processing UPI Payment" + amount);
    }

    @Override
    protected void sendNotification() {
        System.out.println("Notification Sent");
    }
}
