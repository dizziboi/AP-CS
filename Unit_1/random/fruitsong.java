package Unit_1.random;

public class fruitsong {
    public static void print()
    {
        System.out.print("I like to ");
        eat();
        eat();
        eat();
        fruit();
    }

    public static void fruit()
    {
        System.out.println("apples and bananas!");
    }

    public static void eat()
    {
        System.out.print("eat ");
    }

    public static void main(String[] args)
    {
        print();
    }
}
