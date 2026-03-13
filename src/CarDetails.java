public class CarDetails {
    public String brand;
    public int year;
    public int cost;
    public String color;
    public Engine engine;

    public CarDetails(String brand, int year, int cost, String color, Engine engine) {
        this.brand = brand;
        this.year = year;
        this.cost = cost;
        this.color = color;
        this.engine=engine;
    }

    public void showInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Cost: " + cost);
        System.out.println("Color: " + color);
        System.out.println("Engine Type: " + engine.type);

    }
}
