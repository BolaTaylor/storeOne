package com.nextage.storeOne.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment is of Type STRIPE");
        System.out.println("Amount is Paid is : " + amount);
    }
}
