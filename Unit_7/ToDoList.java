

import java.util.ArrayList;
import java.util.List;

public class ToDoList
{
    public static void main(String[] args)
    {
        // Rewrite this code to use an ArrayList instead of an array
        List<String> toDoList = new ArrayList<String>();
        toDoList.add("Do homework"); 
        toDoList.add("Help make dinner"); 
        toDoList.add("Call grandma"); 

        // changing element 1
        toDoList.set(1, "Order pizza");

        System.out.println(toDoList.size() + " things to do!");
        System.out.println("Here's the first thing to do: " + toDoList.get(0));

        // remove item 0 and move everything down
        //  (this can be done in one method call with ArrayList)
        toDoList.set(0, null);

        System.out.println("Here's the next thing to do: " + toDoList.set(0, "Order pizza"));

        // Why is an ArrayList better than an array for a toDoList?
        // Answer: If you need to dynamically change your array you can do that with a ArrayList and not a normal array
    }
}