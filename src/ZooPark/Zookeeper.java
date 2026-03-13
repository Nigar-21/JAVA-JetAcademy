package ZooPark;

public class Zookeeper {

    private String name;

    public Zookeeper(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal animal) {
        System.out.println(name + " heyvanı yedizdirir:");
        animal.eat();
    }
}

