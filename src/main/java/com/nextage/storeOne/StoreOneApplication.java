package com.nextage.storeOne;

import com.nextage.storeOne.service.OrderService;
import com.nextage.storeOne.service.PayPalPaymentService;
import com.nextage.storeOne.service.StripePaymentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreOneApplication {

	public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(StoreOneApplication.class, args);
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
    }

}
