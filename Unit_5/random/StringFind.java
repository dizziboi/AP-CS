package random;
public class StringFind
{
    /**
     * findLetter looks for a letter in a String
     *
     * @param String letter to look for
     * @param String text to look in
     * @return boolean true if letter is in text After running the code, change
     *     this method to return an int count of how many times letter is in the
     *     text.
     */
    public boolean findLetter(String letter, String text)
    {
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < text.length(); i++)
        {
            if (text.substring(i, i + 1).equalsIgnoreCase(letter))
            {
                flag = true;
                count++;
            }
        }
        System.out.println(count);
        return flag;
    }

    public static void main(String args[])
    {
        StringFind test = new StringFind();
        String message = "The laws of physics";
        String letter = "s";
        System.out.println("Does " + message + " contain a " + letter + "?");
        System.out.println(test.findLetter(letter, message));
    }
}
