package Unit_8.Lab;

public class MagicSquare {
        private int[][] square;

        // Constructor that accepts a 2D array
        public MagicSquare(int[][] square) {
            this.square = square;
        }

        // Returns the row sum indicated by row
        public int rowSum(int row) {
            int sum = 0;
            for (int i = 0; i < square[row].length; i++) {
                sum += square[row][i];
            }
            return sum;
        }

        // Returns the column sum indicated by col
        public int colSum(int col) {
            int sum = 0;
            for (int i = 0; i < square.length; i++) {
                sum += square[i][col];
            }
            return sum;
        }

        // Returns whether both the major and minor diagonal sums are equal to sum
        public boolean diagSums(int sum) {
        int majorDiagonalSum = 0;
        int minorDiagonalSum = 0;
        for (int i = 0; i < square.length; i++) {
        majorDiagonalSum += square[i][i]; // Major diagonal (top-left to bottom-right)
        minorDiagonalSum += square[i][square.length - 1 - i]; // Minor diagonal (top-right to bottom-left)
        }
        return majorDiagonalSum == sum && minorDiagonalSum == sum;
        }

        // Returns true if the numbers 1 to N^2 occur exactly once in square
        public boolean exactlyOnce() {
        boolean[] found = new boolean[square.length * square.length + 1]; // To mark the numbers found
        for (int i = 0; i < square.length; i++) {
        for (int j = 0; j < square[i].length; j++) {
        int num = square[i][j];
        if (num < 1 || num > square.length * square.length || found[num]) {
        return false; // Number out of range or repeated
        }
        found[num] = true;
        }
        }
        return true;
        }

        // Returns true if the square is magic and false otherwise
        public boolean isMagic() {
            int n = square.length;
            int targetSum = rowSum(0); // Assume the sum of the first row is the target sum
            // Check if all rows sum to targetSum
            for (int i = 0; i < n; i++) {
                if (rowSum(i) != targetSum) {
                    return false;
                }
            }
            // Check if all columns sum to targetSum
            for (int i = 0; i < n; i++) {
                if (colSum(i) != targetSum) {
                    return false;
                }
            }
            // Check if the diagonals sum to targetSum
            if (!diagSums(targetSum)) {
                return false;
            }
            // Check if all numbers from 1 to N^2 appear exactly once
            if (!exactlyOnce()) {
                return false;
            }
                        return false;
        }
        
    }

