import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {
    public static void main(String[] args) {

        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("Minimum value: " + returnedMin);
    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for(int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int el: array) {
            min = el;
        }
        return min;

    }
}
