import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        userInput(5);
    }
    public static void userInput(int num) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 1;
        while (count <= 5) {
            System.out.print("Enter number #" + count + ": ");
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
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
