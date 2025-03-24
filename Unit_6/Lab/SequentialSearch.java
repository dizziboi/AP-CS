import java.util.ArrayList;

public class SequentialSearch {

    // Method to perform sequential search on an ArrayList of Integers
    public static int sequentialSearch(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(12);
        numbers.add(20);
        numbers.add(33);
        int target = 12;
        int result = sequentialSearch(numbers, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}


