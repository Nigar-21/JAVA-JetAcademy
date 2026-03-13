public class Vehicle {
    public String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void move() {
        System.out.println("The vehicle is moving...");
    }

    public void start() {
        System.out.println("Vehicle is starting...");
    }

    public void printInfo() {
        System.out.println("Brand: " + brand);
    }
}
