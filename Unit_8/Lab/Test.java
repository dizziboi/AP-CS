package Unit_8.Lab;

public class Test {
        public static int sum(int[][] a){
            int sum = 0;
            for(int[] row: a){
                for(int value: row)
                    sum += value;
            }
            return sum;
        }        
    
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6}};
        sum(matrix);
        System.out.print(matrix);
    }
}
