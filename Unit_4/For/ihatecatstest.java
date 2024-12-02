package Unit_4.For;

public class ihatecatstest {
    public static void main(String[] args)
    {
        String message = "I love cats! I have a cat named Coco. My cat's very smart!";
        int index = 0;
        int oneFound = 0;


        // while more 1's in the message
        while (message.indexOf("cat") >= 0)
        {
            oneFound++;
            // Find the next index for 1
            index = message.indexOf("cat");
            System.out.println("Found a 1 at index: " + index);
            // Replace the 1 with a l at index by concatenating substring up to
            // index and then the rest of the string.
            String firstpart = message.substring(0, index);
            String lastpart = message.substring(index + 1);
            message = firstpart + "dog" + lastpart;
            System.out.println("Replaced 1 with l at index " + index);
            System.out.println(
                "The message is currently "
                + message
                + " but we aren't done looping yet!");
        }
        System.out.println("1 found: " + oneFound);
        System.out.println("Cleaned text: " + message);
    }
}
