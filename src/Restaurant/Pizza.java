package Restaurant;
public class Pizza extends Food {

    public Pizza(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice() + 2;
    }
}

