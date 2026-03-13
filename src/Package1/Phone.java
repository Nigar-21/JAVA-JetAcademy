package Package1;

public class Phone {
    String model;
    int year;
    String color;
    int capacity;
    public Phone(String model,String color, int capacity,int year){
        this.model=model;
        this.capacity=capacity;
        this.color=color;
        this.year= year;

    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
