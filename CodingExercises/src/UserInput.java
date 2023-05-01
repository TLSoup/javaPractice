import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        userInput(5);
    }
    public static void userInput(double num) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 1;
        while (count <= 5) {
            System.out.print("Enter number #" + count + ": ");
            if (scanner.hasNext()) {
                double input = scanner.nextDouble();
                sum += input;
                count++;
            } else {
                System.out.println("Invalid number");
                scanner.next();
            }
        }
        System.out.println("Sum of numbers: " + sum);
    }

}
