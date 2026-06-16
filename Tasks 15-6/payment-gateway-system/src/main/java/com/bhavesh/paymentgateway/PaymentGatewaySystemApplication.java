package com.bhavesh.paymentgateway;

import com.bhavesh.paymentgateway.service.PaymentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PaymentGatewaySystemApplication {
    public static void main(String[] args) {
       ApplicationContext context =  SpringApplication.run(PaymentGatewaySystemApplication.class, args);
        PaymentService paymentService = (PaymentService) context.getBean(PaymentService.class);
        paymentService.makePayment("WALLET",10);
        System.out.println();
        paymentService.makePayment("UPI",10);
    }
}
