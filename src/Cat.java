public class Cat extends Animal {
    public Cat(){
        super.info();
    }
    @Override
    protected void sound(){
        System.out.println("Cat meows");
    }
}
