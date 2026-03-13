package ZooPark;

public class Penguin extends Animal implements Swimmable {

    public Penguin(String name, int age, String country) {
        super(name, age, country);
    }

    @Override
    public void makeSound() {
        System.out.println("Pinqvin səslənir ");
    }

    @Override
    public void eat() {
        System.out.println("Pinqvin balıq yeyir");
    }

    @Override
    public void swim() {
        System.out.println("Pinqvin üzür");
    }

    @Override
    public void info() {
        System.out.println(
                "Pinqvin | Ad: " + getName() +
                        " | Yaş: " + getAge() +
                        " | Ölkə: " + getCountry()
        );
    }
}

