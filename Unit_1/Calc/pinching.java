package Unit_1.calc;

public class pinching {
    public static void main(String[] args) {
       double goal = 200;
        double weeklyRate = 20;
        double numWeeks = 4;
        double numMonths = (goal / weeklyRate) / numWeeks;
        System.out.println(numMonths);
    }
}
