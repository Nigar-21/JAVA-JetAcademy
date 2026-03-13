public class PrintedBook extends Book {
    public double weight;
    public String coverType;

    public PrintedBook(String name, String type, int page, double weight, String coverType) {
        super(name, type, page);
        this.weight = weight;
        this.coverType = coverType;
    }

    public void bookInfo() {
        super.bookInfo();
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Cover type: " + coverType);
    }
}

