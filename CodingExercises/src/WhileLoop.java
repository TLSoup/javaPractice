public class WhileLoop {
    public static void main(String[] args) {

        for (int i = 1; i <=5; i++) {
            System.out.println(i);
        }
        int j = 1;
        while (true) {
            if (j > 5) {
                break;
            }
            System.out.println("J = "+j);
            j++;
        }
        int k = 1;
        boolean isReady = false;
        do {
            if (k > 5) {
                break;
            }
            System.out.println("k = " + k);
            k++;
            isReady = (k > 0);
        } while (isReady);
    }
}
