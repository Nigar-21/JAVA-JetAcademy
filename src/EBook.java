public class EBook extends Book {
    public double fileSize;
    public String format;

    public EBook(String name, String type, int page, double fileSize, String format) {
        super(name, type, page);
        this.fileSize = fileSize;
        this.format = format;
    }
    public void bookInfo() {
        super.bookInfo();
        System.out.println("File size: " + fileSize + " MB");
        System.out.println("Format: " + format);
    }
}
