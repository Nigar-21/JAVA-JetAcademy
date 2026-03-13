package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci ədədi daxil et: ");
        int firstNumber = sc.nextInt();

        System.out.print("İkinci ədədi daxil et: ");
        int secondNumber = sc.nextInt();

        System.out.print("Əməliyyatı daxil et (+, -, *, /): ");
        String symbol = sc.next();

        calculator(symbol, firstNumber, secondNumber);
    }
    public static void calculator(String symbol,int firstNumber,int secondNumber){
        switch (symbol){
            case"+":
                System.out.println(firstNumber+secondNumber);
                break;
            case "-":
                System.out.println(firstNumber-secondNumber);
                break;
            case "*":
                System.out.println(firstNumber*secondNumber);
                break;
            case "/":
                System.out.println(firstNumber/secondNumber);
                break;
        }

    }
}
