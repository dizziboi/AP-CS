package Unit_8.Lab;

public class U8L1 {
    public int sum(int[][] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) { // Traverse rows
            for (int j = 0; j < arr[i].length; j++) { // Traverse columns
                total += arr[i][j]; // Add each element to the total
            }
        }
        return total;
    }

    public int rowSum(int[][] arr, int row) {
        int sum = 0;
        for (int j = 0; j < arr[row].length; j++) { // Traverse the row
            sum += arr[row][j]; // Add each element in the row to sum
        }
        return sum;
    }

    public int colSum(int[][] arr, int col) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { // Traverse rows
            sum += arr[i][col]; // Add the element from the column to sum
        }
        return sum;
    }

    public int sum2(int[][] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) { // Traverse rows
            total += rowSum(arr, i); // Call rowSum for each row
        }
        return total;
    }

    public int largest(int[][] arr) {
        int largest = Integer.MIN_VALUE;
        for (int[] row : arr) { // Traverse each row
            for (int element : row) { // Traverse each element in the row
                if (element > largest) {
                    largest = element; // Update largest if a larger value is found
                }
            }
        }
        return largest;
    }

    public int largestByRow(int[][] arr, int row) {
        int largest = Integer.MIN_VALUE;
        for (int element : arr[row]) { // Traverse each element in the given row
            if (element > largest) {
                largest = element; // Update largest if a larger value is found
            }
        }
        return largest;
    }

    public int largest2(int[][] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) { // Traverse rows
            largest = Math.max(largest, largestByRow(arr, i)); // Call largestByRow for each row and compare with the
                                                               // current largest
        }
        return largest;
    }

    public void printTranspose(int[][] arr) {
        for (int j = 0; j < arr[0].length; j++) { // Traverse each column of the original array
            // (becomes a row in the transposed array)
            for (int i = 0; i < arr.length; i++) { // Traverse each row of the original array
                // (becomes a column in the transposed array)
                System.out.print(arr[i][j] + " "); // Print the element at (i, j), which corresponds to the transposed
                                                   // element
            }
            System.out.println(); // Move to the next line after printing a row of the transposed array
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
    }
}
