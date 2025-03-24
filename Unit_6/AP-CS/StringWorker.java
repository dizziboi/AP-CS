public class StringWorker {
    private String[] arr = {"Hello", "Hey", "Good morning!"};

    public int findString(String target)
    {
        String word = "test";
        for (int index = 0; index < arr.length; index++)
        {
            word = arr[index];

            if (word ==(target))
            {
                return index;
            }
            else
            {
                return -1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        StringWorker sWorker = new StringWorker();
        System.out.println(sWorker.findString("Hey"));
    }
}
