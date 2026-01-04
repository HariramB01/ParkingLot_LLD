package utils;

import strategy.PaymentStrategy;

public class Payment {
    private double amount;
    private PaymentStrategy paymentStrategy;

    public Payment(double amount, PaymentStrategy paymentStrategy) {
        this.amount = amount;
        this.paymentStrategy = paymentStrategy;
    }

    public boolean processPayment(double amount) {
        if (amount < 0) {
            System.out.println("Enter valid amount");
            return false;
        }
        boolean paymentStatus = paymentStrategy.makePayment(amount);
        System.out.println(
                paymentStatus ?
                        "Payment processed successfully" :
                        "Payment process failed"
        );
        return paymentStatus;
    }

}
