package com.bhavesh.paymentgateway.template;

public class UPIPaymentTemplate extends AbstractPaymentTemplate{


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
        System.out.println("Processing UPI Payment");
    }

    @Override
    protected void sendNotification() {
        System.out.println("Notification Sent");
    }
}
