public abstract class Product {
    protected String name;
    protected double price;
//    protected double basePrice;

    public Product(String name,double price) {
        this.name = name;
        this.price = price;
    }
    abstract double getFinalPrice();
//        this.basePrice = basePrice;
//    }
//    public void setPrice(double price) {
//        this.price = price;
//        if(price<0){
//            System.out.println(0);
//        }else{
//            System.out.println(price);
//        }
//    }
//    public double getPrice(){
//        return price;
//    }

//    public double getBasePrice() {
//        return basePrice;
//    }
}
