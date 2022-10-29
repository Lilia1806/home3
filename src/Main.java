public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.3, 2.1, 3.6, -4.4, 5.3, 6.9, 7.5, 8.1, 9.4, -1.5, -2.2, -3.8, -4.6, -5.3, -6.7};
        double i = 0.0;
        int count = 0;
        boolean b = false;
        for (double v : numbers) {
            if (v < 0) {
                b = true;
            } else if (b) {
                if (v > 0) {
                    i++;
                    count += v;
                }
            }
        }
        System.out.println(count/i);
    }
}
