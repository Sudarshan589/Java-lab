abstract class PaymentMethod {
    String payerName;
    double amount;

    PaymentMethod(String payerName, double amount) {
        this.payerName = payerName;
        this.amount = amount;
    }

    abstract void pay();
}

class CreditCardPayment extends PaymentMethod {
    String cardNumber;

    CreditCardPayment(String payerName, double amount, String cardNumber) {
        super(payerName, amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void pay() {
        System.out.println("Processing credit card payment of Rs. " + amount + " for " + payerName);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Payment done through Credit Card.");
    }
}

class UpiPayment extends PaymentMethod {
    String upiId;

    UpiPayment(String payerName, double amount, String upiId) {
        super(payerName, amount);
        this.upiId = upiId;
    }

    @Override
    void pay() {
        System.out.println("Processing UPI payment of Rs. " + amount + " for " + payerName);
        System.out.println("UPI ID: " + upiId);
        System.out.println("Payment done through UPI.");
    }
}

class NetBankingPayment extends PaymentMethod {
    String bankName;

    NetBankingPayment(String payerName, double amount, String bankName) {
        super(payerName, amount);
        this.bankName = bankName;
    }

    @Override
    void pay() {
        System.out.println("Processing net banking payment of Rs. " + amount + " for " + payerName);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Payment done through Net Banking.");
    }
}

class PaymentGateway {
    void processPayment(PaymentMethod paymentMethod) {
        paymentMethod.pay();
    }
}

public class PaymentGatewayDemo {
    public static void main(String[] args) {
        PaymentGateway gateway = new PaymentGateway();

        PaymentMethod payment;

        payment = new CreditCardPayment("Aman", 2500.0, "1234-5678-9876-5432");
        gateway.processPayment(payment);

        System.out.println();

        payment = new UpiPayment("Aman", 1500.0, "aman@upi");
        gateway.processPayment(payment);

        System.out.println();

        payment = new NetBankingPayment("Aman", 5000.0, "SBI");
        gateway.processPayment(payment);
    }
}