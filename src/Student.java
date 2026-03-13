import javax.xml.namespace.QName;

public class Student extends Person {
private String name;
public final String university = "UNEC";
// private int age;
    static int count =0;

    public Student(String name) {
        this.name=name;
        count++;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public Adress adress;

//    public int grade;
//    public Student(String name,int grade){
//        super(name);
//        this.name=name;
//        this.age=age;
//        this.adress= adress;
//        this.grade=grade;
//        System.out.println("Sagirgin adi:"+name);
//        System.out.println("Sagirgin yasi:"+age);
//        System.out.println("Sagirgin adresi:"+adress.city);
//    }



//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getAge() {
//        return age;
//    }
    //    public void showGrade() {
//        System.out.println("Student grade: " + grade);
   }

