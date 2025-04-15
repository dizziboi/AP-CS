package Unit_8.Lab;

public class MagicSquareTest {
    public static void main(String[] args) {
        // Test case for a 3x3 magic square
        int[][] square1 = {
                { 8, 1, 6 },
                { 3, 5, 7 },
                { 4, 9, 2 }
        };
        MagicSquare magicSquare1 = new MagicSquare(square1);
        System.out.println("Is square1 magic? " + magicSquare1.isMagic()); // Should return true
        // Test case for a non-magic square
        int[][] square2 = {
                { 8, 1, 7 },
                { 3, 5, 7 },
                { 4, 9, 2 }
        };
        MagicSquare magicSquare2 = new MagicSquare(square2);
        System.out.println("Is square2 magic? " + magicSquare2.isMagic());
        // Should return false
    }
}