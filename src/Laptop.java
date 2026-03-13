import java.util.Scanner;

public class Laptop extends Computer {
    public Laptop(String type){
        super(type);
    }
    public void analyzeRAM() {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 5;

        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". RAM dəyərini daxil edin (GB): ");
            int ram = sc.nextInt();
            sum += ram;
        }

        double average = (double) sum / count;

        System.out.println("Ümumi RAM: " + sum + " GB");
        System.out.println("Orta RAM: " + average + " GB");

        if (average >= 8) {
            System.out.println("Nəticə: kafi");
        } else {
            System.out.println("Nəticə: aşağı");
        }
    }
}
