package ZooPark;

public class Elephant extends Animal {

    public Elephant(String name, int age, String country) {
        super(name, age, country);
    }

    @Override
    public void makeSound() {
        System.out.println("Fil borazan səsi çıxarır 🐘");
    }

    @Override
    public void eat() {
        System.out.println("Fil bitki yeyir");
    }

    @Override
    public void info() {
        System.out.println(
                "Fil | Ad: " + getName() +
                        " | Yaş: " + getAge() +
                        " | Ölkə: " + getCountry()
        );
    }
}


