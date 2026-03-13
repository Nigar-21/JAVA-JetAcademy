package Restaurant;

public class OrderServiceL implements OrderService {

    @Override
    public double getTotalPrice(Food[] foods) {
        double total = 0;

        for (int i = 0; i < foods.length; i++) {
            total += foods[i].calculatePrice();
        }

        return total;
    }
}

