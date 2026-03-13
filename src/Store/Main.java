package Store;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== MÜŞTƏRİ QEYDİYYATI ===");
        System.out.print("Ad: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Şifrə: ");
        String password = sc.nextLine();

        Customer customer = new Customer(name, email, password);
        UserRegister register = new UserRegister();

        if (!register.register(customer)) return;

        Product[] products = {
                new Product("Laptop", 1500),
                new Product("Telefon", 900),
                new Product("Qulaqlıq", 120),
                new Product("Mouse", 40)
        };

        System.out.println("\n=== MƏHSULLAR ===");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". "
                    + products[i].getName()
                    + " - " + products[i].getPrice() + " AZN");
        }

        Order order = new Order(customer, 10);

        while (true) {
            System.out.print("Məhsul seçin (bitirmək üçün 0): ");
            int choice = sc.nextInt();

            if (choice == 0) break;

            if (choice < 1 || choice > products.length) {
                System.out.println("Yanlış seçim!");
                continue;
            }

            order.addProduct(products[choice - 1]);
            System.out.println(products[choice - 1].getName() + " əlavə olundu!");
        }

        System.out.println("\n=== SEÇİLƏN MƏHSULLAR ===");
        order.printOrderInfo();
    }
}
