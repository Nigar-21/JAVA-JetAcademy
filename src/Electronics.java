class Electronics extends Product {

    Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    double getFinalPrice() {
        return 1.10*price ;
    }
}
