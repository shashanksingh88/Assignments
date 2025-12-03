public interface DigitalPayment {
    void pay(double amount);
}

class UPI implements DigitalPayment {
    public void pay(double amount) { System.out.println("Paid via UPI: " + amount); }
}

class CreditCard implements DigitalPayment {
    public void pay(double amount) { System.out.println("Paid via Credit Card: " + amount); }
}

class Wallet implements DigitalPayment {
    public void pay(double amount) { System.out.println("Paid via Wallet: " + amount); }
}