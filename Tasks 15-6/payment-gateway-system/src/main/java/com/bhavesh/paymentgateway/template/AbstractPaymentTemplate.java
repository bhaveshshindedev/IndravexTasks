package com.bhavesh.paymentgateway.template;

public abstract class AbstractPaymentTemplate {
    public final void makePayment(double amount) {
        validate();
        calculateCharges(amount);
        process(amount);
        generateReceipt();
        sendNotification();
    }

    protected abstract void validate();

    protected abstract void calculateCharges(double amount);

    protected abstract void process(double amount);

    protected abstract void sendNotification();

    private void generateReceipt(){
        System.out.println("Receipt Generated");
    }
}
