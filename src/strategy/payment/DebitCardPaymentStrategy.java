package strategy.payment;

import strategy.PaymentStrategy;

public class DebitCardPaymentStrategy implements PaymentStrategy {
    @Override
    public boolean makePayment(double amount) {
        return true;
    }
}