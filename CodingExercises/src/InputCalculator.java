import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        boolean hasNextInt = scanner.hasNextInt();

        while (hasNextInt) {
            int number = scanner.nextInt();
            sum += number;
            count++;

            hasNextInt = scanner.hasNextInt();
        }

        scanner.close();

        long average = 0;

        if (count > 0) {
            average = Math.round((double) sum / count);
        }

        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
