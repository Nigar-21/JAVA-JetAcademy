package ZooPark;

public class Lion extends Animal {

    public Lion(String name, int age, String country) {
        super(name, age, country);
    }

    @Override
    public void makeSound() {
        System.out.println("Aslan nərildəyir");
    }

    @Override
    public void eat() {
        System.out.println("Aslan ət yeyir");
    }

    @Override
    public void info() {
        System.out.println(
                "Aslan | Ad: " + getName() +
                        " | Yaş: " + getAge() +
                        " | Ölkə: " + getCountry()
        );
    }
}


