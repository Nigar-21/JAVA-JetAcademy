package Restaurant;

public class Burger extends Food {

    public Burger(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice() + 1.5;
    }
}

