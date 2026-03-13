package ZooPark;

public abstract class Animal {

    private String name;
    private int age;
    private String country;

    public Animal(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public void sleep() {
        System.out.println(name + " yatir");
    }

    public void move() {
        System.out.println(name + " hereket edir");
    }

    public abstract void makeSound();
    public abstract void eat();
    public abstract void info();
}


