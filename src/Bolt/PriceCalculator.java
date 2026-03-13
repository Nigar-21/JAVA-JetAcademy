package Bolt;

public class PriceCalculator {

    public static double calculate(Order order) {

        double price =
                order.getDistance() * order.getTaxi().getPricePerKm();

        if (order.getCustomer().getOrderCount() > 3) {
            price *= 0.8;
        }

        return price;
    }
}

