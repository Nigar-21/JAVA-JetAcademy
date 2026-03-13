public class Car extends Vehicle {
    public int maxSpeed;

    public Car(String brand, int maxSpeed) {
        super(brand);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    public void drive() {
        System.out.println("The car is driving...");
    }

    @Override
    public void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
