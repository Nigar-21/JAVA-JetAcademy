     public class Lesson6 {
public String name;
         public Lesson6(String name){
this.name=name;
         }
         public void sayHi(){
             System.out.println("Hi"+ name);
         }
         public void sayBye(){
             System.out.println("Bye"+ name);
         }

     }


         //    public boolean Palindrome(int n) {
//        int original = n;
//        int reversed = 0;
//
//        while (n != 0) {
//            int digit = n % 10;
//            reversed = reversed * 10 + digit;
//            n = n / 10;
//        }
//
//        return original == reversed;
//    }
//
//----------------------------------------------------------------------------------------------------------------
//         public int edediOrta(int a, int b, int c) {
//             int edediOrta = (a + b + c) / 3;
//             if(edediOrta<=50){
//                 System.out.println('F');
//             } else if (edediOrta>50 && edediOrta<=60) {
//                 System.out.println("E");
//             }
//             else if (edediOrta>60 && edediOrta<=70) {
//                 System.out.println("D");
//             }
//             else if (edediOrta>70 && edediOrta<=80) {
//                 System.out.println("C");
//             }
//             else if (edediOrta>80 && edediOrta<=90) {
//                 System.out.println("B");
//             }
//             else if (edediOrta>90 && edediOrta<=100) {
//                 System.out.println("A");
//             }
//             return edediOrta;
//         }
//----------------------------------------------------------------------------------------------------------

//         public void faktorial(int n) {
//             int faktorial = 1;
//             System.out.print("faktorial:");
//             for (int i = 1; i <= n; i++) {
//                 faktorial *= i;
//                 System.out.print(i);
//                 if (i != n) { //
//                     System.out.print("*");
//                 }
//
//             }
//             System.out.println("=" + faktorial);
//
//         }
//-----------------------------------------------------------------------------------------------------------
//public void sadeMurekkeb(int n) {
//    if (n <= 1) {
//        System.out.println("Murekkebdir");
//        return;
//    }
//
//    boolean sade = true;
//    for (int i = 2; i < n; i++) {
//        if (n % i == 0) {
//            sade = false;
//            break;
//        }
//    }
//
//    if (sade) {
//        System.out.println("Sadedir");
//    } else {
//        System.out.println("Murekkebdir");
//    }
//}
//---------------------------------------------------------------------------------------------------

