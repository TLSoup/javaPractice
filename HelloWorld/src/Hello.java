public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Tim");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens.");
        }
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100.");
        }
        if ((topScore > 90 || (secondTopScore <= 90))) {
            System.out.println("Either or both of the conditions are true");
        }
        boolean isCar = false;
        if(!isCar) {
            System.out.println("This is not supposed to happen");
        }
        String makeOfCar = "Volkswagen";
       // boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        boolean isDomestic = (makeOfCar != "Volkswagen");

        if (isDomestic) {
            System.out.println("This car is domestic to our country.");
        }
        String s = (isDomestic) ? "This caris domestic" : "This car is not domestic";
        System.out.println(s);
    }
}
