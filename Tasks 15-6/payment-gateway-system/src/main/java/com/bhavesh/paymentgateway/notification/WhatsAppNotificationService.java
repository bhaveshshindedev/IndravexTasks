package com.bhavesh.paymentgateway.notification;

import org.springframework.stereotype.Service;

@Service
public class WhatsAppNotificationService implements  NotificationService{
    @Override
    public void send(String message) {
        System.out.println("WhatsApp : "+message);
    }
}
