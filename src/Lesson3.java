import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {

//        int num = 45720831;
//        int sum = 0;
//
//        for (; num > 0; num /= 10) {
//
//            int digit = num % 10;
//
//            if (digit == 0) {
//                break;
//            }
//
//            if (digit % 2 == 0) {
//                continue;
//            }
//
//            sum += digit;
//        }
//
//        System.out.println("Cəm = " + sum);
//---------------------------------------------------------------------------------------------------------------------
//
//        Scanner sc= new Scanner(System.in);
//        int sum = 0;
//
//        while(true){
//            System.out.println("Eded daxil edin:");
//            int a = sc.nextInt();
//
//            if(a<0){
//                break;
//            } else if (a==0) {
//                continue;
//            }
//            else{
//                sum+=a;
//            }
//            System.out.println("Cem:"+sum);
//        }
//---------------------------------------------------------------------------------------------------------------------

//        int[] arr = {1,2,3};
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//               int sum = arr[i] + arr[j];
//                System.out.println(arr[i]+"+"+arr[j]+"="+sum);
//        }
//        }
//---------------------------------------------------------------------------------------------------------------------
//
//        Scanner sc= new Scanner(System.in);
//        int sum = 0;
//        for(int a = sc.nextInt(); a>0;a/=10){
//
//            int digit = a % 10;
//            sum+=digit;
//        }
//        System.out.println(sum);
//---------------------------------------------------------------------------------------------------------------------

//                Scanner sc = new Scanner(System.in);
//                System.out.println("Ədədlər daxil edin:");
//
//                int prev1 = sc.nextInt();
//                int prev2 = sc.nextInt();
//
//                while (true) {
//
//                    int sum = prev1 + prev2;
//                    System.out.println(sum);
//
//                    int next = sc.nextInt();
//                    prev1 = prev2;
//                    prev2 = next;
//                }
//--------------------------------------------------------------------------------------------------------------------
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mesaj daxil edin:");
//
//while(true){
//    String message = sc.nextLine();
//    if(message.equals("Stop")){
//        break;
//    }
//}
//--------------------------------------------------------------------------------------------------------------------

        Scanner sc = new Scanner(System.in);
        System.out.println("Ədəd daxil edin:");
int sum=0;

        while (sum < 100) {
            int n = sc.nextInt();
            sum += n;
            System.out.println("Cari cəm: " + sum);
        }

        System.out.println("Cəm 100 və ya daha çox oldu! Bitdi.");





















    }
}
