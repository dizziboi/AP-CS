public class TesterClass
{
    // main method for testing
    public static void main(String[] args)
    {
        Student s1 = new Student("Skyler", "skyler@sky.com", 123456);
        System.out.println("Name:" + s1.getName());
        // Fix the bug here!
        System.out.println("Email:" + s1.getEmail());
        System.out.println("ID: " + s1.getId());
    }
}

/** Class Student keeps track of name, email, and id of a Student. */
class Student
{
    private String name;
    private String email;
    private int id;

    public Student(String initName, String initEmail, int initId)
    {
        name = initName;
        email = initEmail;
        id = initId;
    }

    // accessor methods - getters
    /** getName() @return name */
    public String getName()
    {
        return name;
    }

    /** getEmail() @return email */
    public String getEmail()
    {
        return email;
    }

    /** getName() @return id */
    public int getId()
    {
        return id;
    }
}

