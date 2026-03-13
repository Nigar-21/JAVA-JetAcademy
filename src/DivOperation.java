public class DivOperation extends Operation {
    @Override
    public double calculate(double a, double b) {
        if (b == 0) {
            System.out.println("Sıfıra bölmək olmaz!");
            return 0;
        } else {
            return a / b;
        }
    }
}