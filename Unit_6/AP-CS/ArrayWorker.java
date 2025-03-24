public class ArrayWorker {
    private int[] values;

    public ArrayWorker(int[] theValues)
    {
        values = theValues;
    }

    public double getSum()
    {
         // TODO: Write a loop that computes and returns
         // the sum of the elements in the array
        int sum = 0;
        for (int val : values)
        {
         sum += val;  
        }
        return sum;

    }
    public double getAverage()
    {
        double total = 0;
        for (int val : values)
        {
            total = total + val;
        }
        return total / values.length;
    }

    public static void main(String[] args)
    {
        int[] numArray = {2, 6, 7, 12, 5};
        ArrayWorker aWorker = new ArrayWorker(numArray);
        System.out.println(aWorker.getAverage());
        System.out.println(aWorker.getSum());
    }
}
