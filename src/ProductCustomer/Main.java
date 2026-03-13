package ProductCustomer;

public class Main {
    public static void main(String[] args){
        Product p1 = new Product("Telefon", 700, 5);
        Product p2 = new Product("Tablet", 100, 10);
        Product p3 = new Product("Nausnik", 50,15);

        Customer c1 = new Customer("Nigar", "Haciyeva", 950);

        c1.buy(p1, 1);
        c1.buy(p2, 2);
        c1.buy(p3,2);

        System.out.println("Qalan budce: " + c1.budget);
        System.out.println("Qalan "+p1.name+" "+ p1.count);
        System.out.println("Qalan "+p2.name+" "+ p2.count);
        System.out.println("Qalan "+p3.name+" "+ p3.count);
        System.out.println("Alinan mehsullar " + c1.products);
    }
}
