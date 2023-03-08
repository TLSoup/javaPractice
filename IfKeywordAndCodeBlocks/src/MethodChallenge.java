public class MethodChallenge {

    public static void main(String[] args) {
        int score1 = 1500;
        int score2 = 1000;
        int score3 = 500;
        int score4 = 100;
        int score5 = 25;

        int position1 = calculateHighScorePosition(score1);
        int position2 = calculateHighScorePosition(score2);
        int position3 = calculateHighScorePosition(score3);
        int position4 = calculateHighScorePosition(score4);
        int position5 = calculateHighScorePosition(score5);

        displayHighScorePosition("John", position1);
        displayHighScorePosition("Mary", position2);
        displayHighScorePosition("Bob", position3);
        displayHighScorePosition("Jane", position4);
        displayHighScorePosition("Tom", position5);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}