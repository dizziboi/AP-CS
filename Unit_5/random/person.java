package random;

public class person {
    private String name;
    private String email;

    public person(String initName, String initEmail)
    {
        name = initName;
        email = initEmail;
    }

    public String toString()
    {
        int i;
        int id = 0;
        for (i = 0; i < 5; i++)
        {
            id = i;
        }
        // Can you access the blockScope variables i or id?
        System.out.println("i at the end of the loop is " + i);
        System.out.println("The last id is " + id);

        // Can toString() access parameter variables in Person()?
        return name + ": " + email;
    }

    // main method for testing
    public static void main(String[] args)
    {
        // call the constructor to create a new person
        person p1 = new person("Sana", "sana@gmail.com");
        System.out.println(p1);
    }
}
