package com.bhavesh.paymentgateway.utility;

import org.springframework.stereotype.Component;

@Component
public class NotificationUtility {
    public void logNotification(){
        System.out.println("Notification Logged");
    }
}
