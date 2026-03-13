public class Circle extends Shape{
    public double radius;
    public Circle(String color,double radius){
        super(color);
        this.radius=radius;
    }
    @Override
    public double area(){
        return radius * radius * 3.14;
    }

    public void printCircleInfo() {
        System.out.println("Circle radius: " + radius);
        System.out.println("Circle area: " + area());
    }
    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }
}
