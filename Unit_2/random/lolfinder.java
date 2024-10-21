package Unit_2.random;

public class lolfinder {
    public static void main(String[] args) {
        String message = "That was great - lol.";
        int lolFind = message.indexOf("lol");
        String message2 = message.substring(lolFind);
        String newMessage = message.replace("lol", "laugh out loud");
        System.out.print(newMessage);


    }
}
