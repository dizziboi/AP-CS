package Unit_1.calc;

public class dayCalc {
    public static void main(String[] args) {
     
        final int days = 5;
        int hoursInDay = 24;
        int hour = 60;
        int minute = 60;
        int secondsIn5Days;
    
         secondsIn5Days = days * hoursInDay * hour *minute;
        
         System.out.println(secondsIn5Days);
    }
}
