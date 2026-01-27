// Strategy
interface PaymentStrategy {
    void pay(int amount);
}

// ConcreteStrategy
class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Pagando $" + amount + " con tarjeta de crédito");
    }
}

// ConcreteStrategy
class PaypalPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Pagando $" + amount + " con PayPal");
    }
}

// Context
class ShoppingCart {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void checkout(int amount) {
        strategy.pay(amount);
    }
}

// Demo
public class StrategyPattern {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(500);

        cart.setPaymentStrategy(new PaypalPayment());
        cart.checkout(300);
    }
}
