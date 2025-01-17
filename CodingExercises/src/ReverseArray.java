import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,20};
        reverse(numbers);
        System.out.println(Arrays.toString(numbers) + " ");
    }

    private static void reverse(int[] array) {
        int left = 0;
        int right = array.length -1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }

    }
}
