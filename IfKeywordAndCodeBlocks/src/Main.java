public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000) {
            System.out.println("You're score is 5000");
        } else if (score > 1000 && score < 5000){
            System.out.println("Your score is greater than 1000 and less than 5000. It was " + score);
        } else {
            System.out.println(("You're score is " + score));
        }
    }
}
