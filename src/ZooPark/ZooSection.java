package ZooPark;
public class ZooSection {

    private String name;
    private Animal[] animals;
    private int count;

    public ZooSection(String name, int capacity) {
        this.name = name;
        animals = new Animal[capacity];
        count = 0;
    }

    public void addAnimal(Animal animal) {
        if (count < animals.length) {
            animals[count++] = animal;
        }
    }

    public void showAnimals() {
        System.out.println(" Bölmə: " + name);
        for (int i = 0; i < count; i++) {
            animals[i].info();
        }
    }

    public void makeSounds() {
        for (int i = 0; i < count; i++) {
            animals[i].makeSound();
        }
    }
}

