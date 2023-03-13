public class DayOfTheWeek {

    public static void main(String[] args) {
        printDayOfWeek(3);
        printWeekDay(3);
    }

    public static void printDayOfWeek(int day) {
        switch (day) {
            case 0 -> System.out.println(day + " Sunday");
            case 1 -> System.out.println(day + " Monday");
            case 2 -> System.out.println(day + " Tuesday");
            case 3 -> System.out.println(day + " Wednesday");
            case 4 -> System.out.println(day + " Thursday");
            case 5 -> System.out.println(day + " Friday");
            case 6 -> System.out.println(day + "Saturday");
            default -> System.out.println(day + " is an invalid day");
        }
    }

    public static void printWeekDay(int day) {
        if(day == 0) {
            System.out.println(day + " Sunday");
        } else if (day == 1) {
            System.out.println(day + " Monday");
        } else if (day == 2) {
            System.out.println(day + " Tuesday");
        } else if (day == 3) {
            System.out.println(day + " Wednesday");
        } else if (day == 4) {
            System.out.println(day + " Thursday");
        } else if (day == 5) {
            System.out.println(day + " Friday");
        } else if (day == 6) {
            System.out.println(day + " Saturday");
        } else {
            System.out.println(day + " is an invalid day. Please try again.");
        }
    }
}
