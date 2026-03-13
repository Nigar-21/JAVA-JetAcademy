package ProductCustomer;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    String name;
    String surname;
    double budget;
    List<Product> products = new ArrayList<>();

    public Customer(String name, String surname, double budget) {
        this.name = name;
        this.surname = surname;
        this.budget = budget;
    }

    public void buy(Product product, int quantity) {
        double totalPrice = product.price * quantity;

        if (quantity > product.count) {
            System.out.println("Stokda kifayet qeder mehsul yoxdur");
            return;
        }

        if (budget >= totalPrice) {
            budget -= totalPrice;
            product.count -= quantity;
            products.add(product);
            System.out.println(name + " mehsulu aldi: " + product.name);
        } else {
            System.out.println("Budce catmir "+product.name+" alina bilmez");
        }
    }


}
