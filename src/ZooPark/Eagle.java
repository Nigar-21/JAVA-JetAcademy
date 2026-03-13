package ZooPark;

public class Eagle extends Animal implements Flyable {

    public Eagle(String name, int age, String country) {
        super(name, age, country);
    }

    @Override
    public void makeSound() {
        System.out.println("Qartal qışqırır");
    }

    @Override
    public void eat() {
        System.out.println("Qartal ov yeyir");
    }

    @Override
    public void fly() {
        System.out.println("Qartal yüksəkdən uçur");
    }

    @Override
    public void info() {
        System.out.println(
                "Qartal | Ad: " + getName() +
                        " | Yaş: " + getAge() +
                        " | Ölkə: " + getCountry()
        );
    }
}


