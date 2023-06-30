import java.time.LocalDate;

public class DaysBetween {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2022, 9, 7);
        //LocalDate date2 = LocalDate.of(2023, 4, 30);
        LocalDate firstNotice = date1.plusDays(150);
        LocalDate secondNotice = date1.plusDays(181);
        LocalDate feeDay = date1.plusDays(211);

       // long daysBetween = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("First Notice: " + firstNotice + ", Second Notice: " + secondNotice + ", Fee Day: " + feeDay);
        //System.out.println("Days between " + date1 + " and " + date2 + ": " + daysBetween);
    }
}
