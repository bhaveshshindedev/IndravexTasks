package com.bhavesh.paymentgateway.notification;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EmailNotificationService implements NotificationService{

    @Override
    public void send(String message) {
        System.out.println("Email : "+message);
    }
}
