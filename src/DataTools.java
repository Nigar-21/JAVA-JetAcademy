public final class DataTools {
    public static int sum(int... numbers) {
        int s = 0;
        for (int n : numbers) {
            s += n;
        }
        return s;
    }
    public static double average(int... numbers) {
        if (numbers.length == 0) return 0;
        return (double) sum(numbers) / numbers.length;
    }


    public static int max(int... numbers) {
        int m = numbers[0];
        for (int n : numbers) {
            if (n > m) m = n;
        }
        return m;
    }


    public static int min(int... numbers) {
        int m = numbers[0];
        for (int n : numbers) {
            if (n < m) m = n;
        }
        return m;
    }
}
