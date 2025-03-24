public class studnets       // Add your class name here!
{
    // 1. Copy your class from lesson 5.6 below.

    public static void main(String[] args)
    {
       // 2. Create an array of 3 objects of your class.
       String[] names = new String[3];
       int[] age = new int[3];
       String[] job = new String[3];
       // 3. Initialize array elements 0-2 to new objects of your class.
        String programer = names[0];
        String builber = names[1];
        String coach = names[2];
        int programerage = age[0];
        int builberage = age[1];
        int coachage = age[2];
        String programerJob = job[0];
        String builderJob = job[1];
        String coachJob = job[2];

       // 4. Call the print method of each object in the array using the array index.
       for (int i = 0; i < names.length; i++)
       {
           System.out.println(names[i]);
       }
       for (int i = 0; i < age.length; i++)
       {
           System.out.println(age[i]);
       }
       for (int i = 0; i < job.length; i++)
       {
           System.out.println(job[i]);
       }


    }
}
