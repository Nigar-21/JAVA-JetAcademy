package Store;

public class Order {

    private Customer customer;
    private Product[] products;
    private int count = 0;

    public Order(Customer customer, int maxProduct) {
        this.customer = customer;
        this.products = new Product[maxProduct];
    }

    public void addProduct(Product product) {
        products[count] = product;
        count++;
    }

    public void printOrderInfo() {
        System.out.println("----- SİFARİŞ -----");
        System.out.println("Müştəri: " + customer.getName());

        double total = 0;

        for (int i = 0; i < count; i++) {
            System.out.println("- " + products[i].getName()
                    + " : " + products[i].getPrice() + " AZN");
            total += products[i].getPrice();
        }

        System.out.println("Ümumi məbləğ: " + total + " AZN");
    }
}
