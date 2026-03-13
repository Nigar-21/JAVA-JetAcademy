package Restaurant;

public class Main {
    public static void main(String[] args) {

        Food[] order = new Food[2];
        order[0] = new Pizza("Pepperoni", 10);
        order[1] = new Burger("Cheeseburger", 8);

        OrderService orderService = new OrderServiceL();

        double totalPrice = orderService.getTotalPrice(order);

        System.out.println("Ümumi məbləğ: " + totalPrice);
    }
}

