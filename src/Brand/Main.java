package Brand;

public class Main {
    public static void main(String[] args){
        Marka apple = new Marka("Apple");
        Marka samsung = new Marka("Samsung");
        Model iphone13 = new Model(Color.BLACK, "iPhone 13", 128, 1800, "2021");
        Model iphone14 = new Model(Color.SILVER, "iPhone 14", 256, 2200, "2022");
        Model s22 = new Model(Color.WHITE, "Galaxy S22", 128, 1600, "2022");
        Model s23 = new Model(Color.BLUE, "Galaxy S23", 256, 2100, "2023");
        apple.addModel(iphone13);
        apple.addModel(iphone14);
        samsung.addModel(s22);
        samsung.addModel(s23);
        System.out.println(apple);
        System.out.println("---------------");
        System.out.println(samsung);
    }
}
