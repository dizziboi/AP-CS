package Unit_3.If;

public class ollie {
    public static void main(String[] args)
    {
        // Test multiple values for these variables
        boolean sunny = false;
        int temperature = 90;
        boolean raining = false;

        // Write an if statement for: If it's sunny,
        //  OR if the temperature is greater than 80
        //     and it's not raining, "Go to the beach!"
        if (sunny || temperature > 80 && !raining){
            System.out.println("It's sunny");
            System.out.println("Go to the beach");
        }   
    }
}
