public class Challenge {
    public static void main(String[] args) {
       double Money = 20.00d;
       double Money2 = 80.00d;
       double MoneyTotal = (Money + Money2) * 100.00d;
       System.out.println("MoneyTotal = " + MoneyTotal);
       double Remainder = MoneyTotal % 40.00d;
       System.out.println("Remainder = " + Remainder);
       boolean isNoRemainder = (Remainder == 0) ? true : false;
       System.out.println("isNoRemainder = " + isNoRemainder);
       if (!isNoRemainder) {
           System.out.print("Got some remainder");
       }
    }
}
