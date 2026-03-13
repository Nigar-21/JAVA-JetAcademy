package Brand;
import java.util.ArrayList;
public class Marka {
    private String brand;
    private ArrayList<Model> modelList= new ArrayList<>();

    public Marka(String brand) {
        this.brand = brand;
    }
    public void addModel(Model model){
        modelList.add(model);
    }
    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", modelList=" + modelList;
    }
}
