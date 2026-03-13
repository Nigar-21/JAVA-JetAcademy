public class Phone extends Device{
   public String model;
   public Phone(String  brand, String model){
       super(brand);
       this.model=model;
   }
   @Override
   public void start(){
       System.out.println("Phone is starting...");
   }
   @Override
   public void info(){
       System.out.println("Brand: "+brand);
       System.out.println("Model: "+model);
   }
}
