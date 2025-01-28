package Unit_1.random;
public class ChallengeUnicode
{
    public static void main(String[] args)
    {
        System.out.println(
                "'A' in ASCII and Unicode: " + Character.toString((char) 65));
        System.out.println("Chinese for 'sun': " + Character.toString((char) 11932));
        System.out.println("A smiley emoji: " + Character.toString((char) 128512));

        // Old style. Doesn't work for all codepoints.
        System.out.println("This also works: " + (char) 65);
        System.out.println("But this doesn't: " + (char) 128512);
    }
}

