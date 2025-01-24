package constructor;
public class Car {
    //  instance variables
   private String model;
   private int year;

   // constructor: set instance variables to init parameters
   public Car(String initModel, int initYear)
   {
       // 1. set the instance variables to the init parameter variables
    model = initModel;
    year = initYear;

   }

   // Print Car info
   public void print()
   {
     System.out.println("Car model: " + model);
     System.out.println("Car year: " + year);
   }

   // main method for testing
   public static void main(String[] args)
   {
       // 2. Call the constructor to create 2 new Car objects with different
       // values The first car should be a 2023 Ford and the second car
       // should be a 2010 Honda.

       Car car1 = new Car("Ford", 2023);
       Car car2 = new Car("Honda", 2010);

       car1.print();
       car2.print();
   }
}
