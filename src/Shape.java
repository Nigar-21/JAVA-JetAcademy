public abstract class Shape {
    public String color;

    public Shape(String color) {
        this.color = color;
    }

    protected abstract double area();

    public void printColor() {
        System.out.println("Color: " + color);
    }
    public void draw() {
        System.out.println("Drawing a shape...");
    }

}