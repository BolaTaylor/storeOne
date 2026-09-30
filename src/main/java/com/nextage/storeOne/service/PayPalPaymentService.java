package com.nextage.storeOne.service;

import org.springframework.stereotype.Service;

@Service
public class PayPalPaymentService implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment is of Type PAYPAL");
        System.out.println("Amount is Paid is : " + amount);
    }
}
