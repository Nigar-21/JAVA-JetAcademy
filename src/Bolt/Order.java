package Bolt;

public class Order {
    private Customer customer;
    private Taxi taxi;
    private double distance;

    public Order(Customer customer, Taxi taxi, double distance) {
        this.customer = customer;
        this.taxi = taxi;
        this.distance = distance;
        customer.addOrder();
    }

    public Customer getCustomer() {
        return customer;
    }

    public Taxi getTaxi() {
        return taxi;
    }

    public double getDistance() {
        return distance;
    }
}

