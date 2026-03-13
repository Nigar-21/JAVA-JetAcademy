package ZooPark;

public class Zoo {

    private ZooSection[] sections;
    private int count;

    public Zoo(int capacity) {
        sections = new ZooSection[capacity];
        count = 0;
    }

    public void addSection(ZooSection section) {
        if (count < sections.length) {
            sections[count++] = section;
        }
    }

    public void showZoo() {
        System.out.println("=== ZOOPARK ===");
        for (int i = 0; i < count; i++) {
            sections[i].showAnimals();
        }
    }
}
