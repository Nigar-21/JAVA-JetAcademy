package Brand;

public class Model {
    private String model;
    private int capacity;
    private Color color;
    private int price;
    private String releaseDate;

    public Model(Color color, String model, int capacity, int price, String releaseDate) {
        this.color = color;
        this.model = model;
        this.capacity = capacity;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    @Override
    public String toString() {
        return "model='" + model + '\'' +
                ", capacity=" + capacity +
                ", color=" + color +
                ", price=" + price +
                ", releaseDate='" + releaseDate + '\'';
    }
}
