package Unit_2.random;

public class veryberry {
    public static void main(String[] args)
    {
        String message = "I am very happy!";
        String target = " very ";
        int findVery = message.indexOf(target);
        String removeVery = message.replace(target, " ");
        String message2 = message.substring(findVery);
        System.out.print(removeVery);
    }
}
