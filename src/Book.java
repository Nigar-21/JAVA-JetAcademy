public class Book {
    public int page;
    public String name;
    public String type;
    public Book(String name, String type,int page){
        this.name=name;
        this.page=page;
        this.type=type;
    }
    public void bookInfo(){
        System.out.println("Book name: "+ name);
        System.out.println("Book type: "+type);
        System.out.println("Book page: "+page);
    }
}
