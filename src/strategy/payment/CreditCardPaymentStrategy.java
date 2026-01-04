package strategy.payment;

import strategy.PaymentStrategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public boolean makePayment(double amount) {
        return true;
    }
}