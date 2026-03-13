public class CashPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Payment made with CASH.");
    }
}
