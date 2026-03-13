package Package1;

public class Main {
    public static void main(String[] args){
        Phone S24 = new Phone("S24", "White",256,2024);
        Brand Samsung = new Brand("Samsung",new Phone[]{S24});
        System.out.println(Samsung);
    }
}
