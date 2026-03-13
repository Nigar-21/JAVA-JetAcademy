package ZooPark;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo(2);

        ZooSection wild = new ZooSection("Yırtıcılar", 3);
        ZooSection birds = new ZooSection("Quşlar", 3);

        wild.addAnimal(new Lion("Simba", 5, "Kenya"));
        wild.addAnimal(new Elephant("Dumbo", 12, "India"));

        birds.addAnimal(new Eagle("Qara", 4, "Azerbaijan"));
        birds.addAnimal(new Penguin("Pingo", 6, "Antarctica"));

        zoo.addSection(wild);
        zoo.addSection(birds);

        zoo.showZoo();
        System.out.println("------");

        birds.makeSounds();


    }
}

