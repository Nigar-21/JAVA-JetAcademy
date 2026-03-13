public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name=name;
        this.salary=salary;
    }
//
//    public Employee(String name) {
//        this.name = name;
//    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public double getAnnualSalary(){
        return salary*12;
    }

    public void printInfo() {
        System.out.println("Employee Name: " + name);
    }
}
