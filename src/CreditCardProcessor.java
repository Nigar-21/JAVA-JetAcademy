public class CreditCardProcessor implements PaymentProcessor{

    @Override
    public boolean process(double amount) {
        System.out.println("Processed $" + amount + " with Credit Card");
        return true;
    }
}
