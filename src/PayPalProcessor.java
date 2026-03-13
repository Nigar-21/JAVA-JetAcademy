public class PayPalProcessor implements PaymentProcessor{

    @Override
    public boolean process(double amount) {
        System.out.println("Processed $" + amount + " with PayPal");
        return true;
    }
}
