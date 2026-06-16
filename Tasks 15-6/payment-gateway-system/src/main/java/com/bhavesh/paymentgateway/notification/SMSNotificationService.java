package com.bhavesh.paymentgateway.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SMSNotificationService implements  NotificationService{


    @Override
    public void send(String message) {
        System.out.println("SMS : " + message);
    }
}
