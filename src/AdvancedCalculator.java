public class AdvancedCalculator extends Calculator {

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Sıfıra bölmək olmaz!");
            return 0;
        }
        return (double) a / b;
    }
}
