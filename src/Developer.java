public class Developer extends Employee{
    public Developer(String name, double salary){
        super(name,salary);
    }
    @Override
    public double getAnnualSalary() {
        return getSalary()*12+1000;
    }
}
