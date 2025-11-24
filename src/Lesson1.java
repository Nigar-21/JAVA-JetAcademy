import java.sql.SQLOutput;
import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);;
//        System.out.println("1ci ededi daxil edin:");
//        int a = sc.nextInt();
//        System.out.println("2ci ededi daxil edin:");
//        int b = sc.nextInt();
//
//        int sum = a+b;
//        System.out.println("Cem:"+sum);

//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ededi daxil edin:");
//        int a = sc.nextInt();
//        int yuzluk = a/100;
//        int onluq = (a/10)%10;
//        int teklik = a%10;
//
//        System.out.println("Cem:" + yuzluk + onluq + teklik);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nece eded daxil edeceksiniz?");
//        int n = sc.nextInt();
//        if (n<=0){
//            System.out.println("Sayi 0dan boyuk olmalidir");
//            return;
//        }
//        double sum = 0.0;
//        System.out.println("Ededleri daxil edin:");
//for (int i = 0; i < n; i++){
//    double x = sc.nextDouble();
//    sum+=x;
//}
//double avg = sum/n;
//        System.out.println("Ededi orta: " + avg);

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if (n<=50){
//            System.out.println("F");
//        } else if (n>50 && n<=60) {
//            System.out.println("E");
//        } else if (n>60 && n<=70) {
//            System.out.println("D");
//        }
//        else if (n>70 && n<=80) {
//            System.out.println("C");
//        }
//        else if (n>80 && n<=90) {
//            System.out.println("B");
//        }
//        else {
//            System.out.println("A");
//        }
//
//Scanner sc = new Scanner(System.in);
//    System.out.println("Ededi daxil edin: ");
//        int n = sc.nextInt();
//
//        if (n%3==0 && n%5==0){
//            System.out.println("Hem 3e, hem de 5e bolunur");
//        } else if (n%3==0) {
//            System.out.println("Sadece 3e bolunur");
//        } else if (n%5==0) {
//            System.out.println("Sadece 5e bolunur");
//        }
//        else{
//            System.out.println("Hec birine bolunmur");
//        }

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b= sc.nextInt();
//        int edediOrta=(a+b)/2;
//        if (edediOrta>0){
//            System.out.println("0dan boyukdur");
//        } else if (edediOrta<0){
//            System.out.println("0dan kicikdir");
//        }
//       else{
//            System.out.println("0a beraberdir");
//        }


//        int[] arr =  {1,2,3,4,5,6,7};
//        int sum = 0;
//        for (int i=0; i<arr.length;i++){
//            sum+=arr[i];
//        }
//        System.out.println("Cem:" + sum);


        int[] arr =  {1,2,3,4,5,6,7};
        int max = arr[0];
        for (int i=1; i<arr.length;i++){
            if (arr[i] > max){
                max=arr[i];
            }
        }
        System.out.println(max);


   }
}
