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

public class InsertionSort {

    // Method to perform insertion sort on an array of integers
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i]; 
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {12, 11, 13, 5, 6};

        System.out.println("Original array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        insertionSort(numbers);

        System.out.println("\nSorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

