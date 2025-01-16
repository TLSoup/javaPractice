import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {
        int count = readInteger();           // e.g., user inputs 5
        int[] elements = readElements(count); // reads 5 lines from user
        int minValue = findMin(elements);
        System.out.println("Minimum value: " + minValue);
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count: ");
        int count = scanner.nextInt();

        return count;
    }

    private static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];

        for(int i = 0; i < count; i++) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            array[i] = number;
        }

        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
