/**
 * Pet class (complete comments)
 *
 * @author Caleb Brown
 * @since 1/26/25
 */
class pet
{
 private String name;
 private int age;
 private double weight;
 private String type;
 private String breed;
    // keep track of the name, age, weight, type of animal, and breed of the pet
    public pet(String initName, int initAge, double initWeigh,String initType, String initBreed){ // constructor for pet it need a name,age,weight,type,and breed
        name = initName;
        age = initAge;
        weight = initWeigh;
        type = initType;
        breed = initBreed;

    }
    // Write a constructor, accessor (get) methods, and a toString method. Use good
    // commenting.
    public String getName() //getter for the name 
    {
        return name;
    }
    public int getAge() // it's a getter for the age
    {
        return age;
    }
    public double getWeight() // it's a getter for the weight
    {
        return weight;
    }
    public String getType() // it's a getter for the type
    {
        return type;
    }
    public String getBreed() // it's a getter for the breed
    {
        return breed;
    }
    // Don't forget to complete the main method in the TesterClass below!
    
    public String toString() // uses the toString method to print all of the stats for a dog in a class 
    {
        return "Name: " + name + " Age: " + age + " Weight : " + weight + " Type: " + type +  " Breed: " + breed;
    }
}

public class petTester
{
    // main method for testing
    public static void main(String[] args)
    {
        // Create 2 Pet objects and test all your methods
        pet oliver = new pet("oliver", 5, 10, "cat", "gray");
        pet louie = new pet("louie", 5, 17, "cat", "white");
        System.out.println(oliver);
        System.out.println(louie);

    }
}

 