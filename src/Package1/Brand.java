package Package1;

import java.util.Arrays;

public class Brand {
  public String name;
   public Phone[] phone;
   public Brand(String name, Phone[] phone){
       this.name=name;
       this.phone=phone;
   }

    @Override
    public String toString() {
        return "Brand{" +
                "name='" + name + '\'' +
                ", phone=" + Arrays.toString(phone) +
                '}';
    }
}
