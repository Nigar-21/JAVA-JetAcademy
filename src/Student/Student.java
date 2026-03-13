package Student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;
    public String surname;
    public int age;
    private static final ArrayList<Student> db = new ArrayList<>();

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public static void addStudent(Student s) {
   try {
       if(s.age<18){
           throw new AgeException("18-dən kiçik olmaz");
       }else {
           db.add(s);
       }
   }catch(AgeException e){
       System.out.println(e.getMessage());
   }

    }

    public static List<Student> getStudent() {
        return db;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", surname=" + surname +
                ", age=" + age;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Nigar", "Hajiyeva", 21);
        Student student2 = new Student("Gulchin", "Mammadova", 26);
        Student student3=new Student("Fidan", "Hajiyeva",17);
        Student.addStudent(student1);
        Student.addStudent(student2);
        Student.addStudent(student3);

        for (Student s : Student.getStudent()) {
            System.out.println(s);
        }

    }
}