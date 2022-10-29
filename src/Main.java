public class Main {
    public static void main(String[] args) {

        double[] numbers = {1.3, 2.1, 3.6, 4.4, 5.3, 6.9, 7.5, 8.1, 9.4, -1.5, -2.2, -3.8, -4.6, -5.3, -6.7};

        double average = 0.0;

        int count = 0;

        for (int a = 0; a < numbers.length; a++) {

            if (numbers[a] < 0) {

                for (int b = a + 1; b <
                        numbers.length; b++) {

                    if (numbers[b] > 0) {

                        average = average + numbers[b];

                    }
                }

            }
            System.out.println("average  " + average);

            System.out.println("count  " + count);

            System.out.println("average/count " + average / count);

        }

    }
}
