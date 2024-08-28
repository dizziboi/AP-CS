package random;
public class ChallengeUnicode
{
    public static void main(String[] args)
    {
        System.out.println(
                "'A' in ASCII and Unicode: " + Character.toString(65));
        System.out.println("Chinese for 'sun': " + Character.toString(11932));
        System.out.println("A smiley emoji: " + Character.toString(128512));

        // Old style. Doesn't work for all codepoints.
        System.out.println("This also works: " + (char) 65);
        System.out.println("But this doesn't: " + (char) 128512);
    }
}

