class Clothes extends Product {

    Clothes(String name, double price) {
        super(name, price);
    }

    @Override
    double getFinalPrice() {
        return 0.95*price;
    }
}
