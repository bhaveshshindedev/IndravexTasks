package com.bhavesh.paymentgateway.service;

import com.bhavesh.paymentgateway.factory.PaymentProcessorFactory;
import com.bhavesh.paymentgateway.notification.NotificationService;
import com.bhavesh.paymentgateway.payment.PaymentProcessor;
import com.bhavesh.paymentgateway.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentProcessorFactory factory;

    public PaymentService(PaymentProcessorFactory factory) {
        this.factory = factory;
    }

    public void makePayment(String type, double amount) {

        PaymentProcessor processor =
                factory.getPaymentProcessor(type);

        processor.processPayment(amount);
    }
}