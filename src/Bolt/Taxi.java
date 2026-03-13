package Bolt;

public class Taxi {
    private String type;
    private double pricePerKm;

    public Taxi(String type, double pricePerKm) {
        this.type = type;
        this.pricePerKm = pricePerKm;
    }

    public String getType() {
        return type;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }
}

