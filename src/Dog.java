public class Dog extends Animal{
    public Dog(){
        super.info();
    }
    @Override
    protected void sound(){
        System.out.println("Dog barks");
    }
}
