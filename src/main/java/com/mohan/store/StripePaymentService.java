package com.mohan.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("stripe")
public class StripePaymentService implements PaymentService {

    @Value("${stripe.apiurl}")
    private String stripeApiUrl;

    @Value("${stripe.enabled}")
    private boolean stripeEnabled;

    @Value("${stripe.timeout}")
    private int stripeTimeout;

    @Value("${stripe.supported-currencies}")
    private String stripeSupportedCurrencies;

    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("API URL: " + stripeApiUrl);
        System.out.println("Enabled: " + stripeEnabled);
        System.out.println("Timeout: " + stripeTimeout);
        System.out.println("Currencies: " + stripeSupportedCurrencies);
        System.out.println("Amount: " + amount);
    }
}
