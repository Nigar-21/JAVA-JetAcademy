public class Square extends Shape {
    public int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }
 @Override
    public double area() {
        return side * side;
    }

    public void printSquareInfo() {
        System.out.println("Square side: " + side);
        System.out.println("Square area: " + area());
    }
    @Override
    public void draw() {
        System.out.println("Drawing a square...");
    }
}
