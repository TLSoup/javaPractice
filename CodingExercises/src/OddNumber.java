public class OddNumber {

    public static void main(String[] args) {
        System.out.println(OddNumber.isOdd(5)); // Output: true
        System.out.println(OddNumber.isOdd(6)); // Output: false

        System.out.println(OddNumber.sumOdd(1, 10)); // Output: 25
        System.out.println(OddNumber.sumOdd(-5, 10)); // Output: -1
        System.out.println(OddNumber.sumOdd(10, 1)); // Output: -1

    }
    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (start <= 0 || end <= 0 || end < start) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
