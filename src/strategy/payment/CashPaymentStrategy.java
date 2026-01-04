package strategy.payment;

import strategy.PaymentStrategy;

public class CashPaymentStrategy implements PaymentStrategy {
    @Override
    public boolean makePayment(double amount) {
        return true;
    }
}
