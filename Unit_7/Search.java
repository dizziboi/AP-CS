
import java.util.*;

public class Search {

    /**
   * returns the index of an integer in an arraylist
   * @param list             arraylist of ints
   * @param find             integer we are looking for
   */
    public static int linear(ArrayList<Integer> list, int find)
    { 
           //loop through the Array list
            for (int i = 0; i < list.size(); i++){
                if (list.get(i) == find) {
                    return i;
                }
            }return -1;
        }
    }

