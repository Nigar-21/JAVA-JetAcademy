package Bolt;

public class Customer {
    private String name;
    private int orderCount;

    public Customer(String name) {
        this.name = name;
        this.orderCount = 0;
    }

    public void addOrder() {
        orderCount++;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public String getName() {
        return name;
    }
}
