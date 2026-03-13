package Bolt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Adinizi daxil edin: ");
        String name = sc.nextLine();

        Customer customer = new Customer(name);
        Taxi econom = new Taxi("Econom", 2.0);

        boolean continueOrdering = true;

        while (continueOrdering) {

            System.out.print("Mesafeni daxil edin (km): ");
            double distance = sc.nextDouble();

            Order order = new Order(customer, econom, distance);
            double price = PriceCalculator.calculate(order);

            System.out.println("Sifaris #" + customer.getOrderCount());
            System.out.println("Odenilecek mebleg: " + price + " AZN");

            System.out.print("Yeni sifaris etmek isteyirsiniz? (beli/xeyr): ");
            String answer = sc.next();

            if (answer.equalsIgnoreCase("xeyr")) {
                continueOrdering = false;
            }
        }

        System.out.println("Tesekkurler, " + customer.getName() +
                ". Umumi sifaris sayiniz: " + customer.getOrderCount());
    }
}


