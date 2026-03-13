package Restaurant;

public abstract class Food {
    private String name;
    private double price;
    public Food(String name, double price){
        this.name=name;
        this.price=price;
    }
    public abstract double calculatePrice();

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
