package Unit_4.For;

public class ihatecats {
    public static void main(String[] args)
    {
        String message = "I love cats! I have a cat named Coco. My cat's very smart!";
        int index = 0;



        // while more 1's in the message
        while (message.indexOf("cat") >= 0)
        {
            // Find the next index for 1
            index = message.indexOf("cat");
            // Replace the 1 with a l at index by concatenating substring up to
            // index and then the rest of the string.
            String firstpart = message.substring(0, index);
            String lastpart = message.substring(index + 3);
            message = firstpart + "dog" + lastpart;

        }
        System.out.println("Cleaned text: " + message);
    }
}
