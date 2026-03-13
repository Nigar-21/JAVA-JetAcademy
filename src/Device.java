public abstract class Device {
    public String brand;
    public Device(String brand){
       this.brand=brand;
    }
    public abstract void start();
    public final void info1(){
        System.out.println("Device info");
    }
    public void info(){
        System.out.println("Brand: "+brand);
    }

}
