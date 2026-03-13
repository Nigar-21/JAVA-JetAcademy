import java.util.Arrays;
import java.util.Scanner;

public class Lesson2 {


    public static void main(String[] args) {

//        int [] arr = {-5,3,6,8,-2,-13,21,23,-34,-42,56};
//int[] positive = new int[arr.length];
//        int[] negative = new int[arr.length];
//        for (int i=0;i< arr.length;i++){
//            if (arr[i]>0){
//                positive[i]=arr[i];
//            } else if (arr[i]<0) {
//                negative[i]=arr[i];
//            }
//        }
//        System.out.print("Positive: ");
//        for (int i = 0; i < positive.length; i++) {
//            if (positive[i] != 0) {
//                System.out.print(positive[i] + " ");
//            }
//        }
//
//        System.out.println();
//
//        System.out.print("Negative: ");
//        for (int i = 0; i < negative.length; i++) {
//            if (negative[i] != 0) {
//                System.out.print(negative[i] + " ");
//            }
//}

        //-----------------------------------------------------------------------------------------------------------

//
//        int[] nums = {1,2,3,4,5,6,7,8,9};
//        int[] odd = new int[nums.length];
//        int[] even = new int[nums.length];
//for (int i=0; i< nums.length;i++){
//    if(nums[i]%2==0){
//         even[i]=nums[i];
//    }
//    else{
//        odd[i]=nums[i];
//    }
//}
//        System.out.print("Odd: {");
//        for (int i = 0; i < odd.length; i++) {
//            if (odd[i] != 0) {
//                System.out.print(odd[i] + " ");
//            }
//        }
//        System.out.println("}");
//
//
//        System.out.print("Even: {");
//        for (int i = 0; i < even.length; i++) {
//            if (even[i] != 0) {
//                System.out.print(even[i] + " " );
//            }
//}
//        System.out.println("}");

        //-----------------------------------------------------------------------------------------------------------
//
//int [] nums = {3,4,5,6,8,11};
//int[] tekArray = new int[3];
//int[] cutArray = new int[3];
//
//int tekIndex = 0;
//int cutIndex = 0;
//
//        for (int i=0; i< nums.length;i++){
//            if (nums[i]%2==0) {
//                cutArray[cutIndex] = nums[i];
//                cutIndex++;
//            }
//            else{
//                tekArray[tekIndex] = nums[i];
//                tekIndex++;
//            }
//        }
//
//        System.out.println("Tek ededler:" + Arrays.toString(tekArray));
//        System.out.println("Cut ededler:" + Arrays.toString(cutArray));
//--------------------------------------------------------------------------------------------------------------------

//int num = 10;
//while(num>0){
//    System.out.println(num);
//    num--;
//}


//    String [] arr = {"Jet", "UNEC", "IKTA"};
//    int i = arr.length-1;
//while(i>=0){
//    System.out.println(arr[i]);
//    i--;
//}


//        String [] arr = {"Jet", "UNEC", "IKTA"};
//        for(int i=0;i< arr.length;i++){
//            if(arr[i].equals("Jet")){
//                System.out.println("Jet var");
//                break;
//            }
//            else {
//                System.out.println("Jet yoxdur");
//            }
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Ad daxil edin:");
        String[] arr = {"Jet", "UNEC", "IKTA"};
String username =sc.nextLine();
boolean state = true;
        for(int i=0;i< arr.length;i++){
            if(arr[i].equals(username)){
                System.out.println("Bu adi istifade etmek olmaz");
                state=false;
                break;
            }
            if(state
            ) {
                System.out.println("Ad:"+ username);
            }
        }









    }
}

