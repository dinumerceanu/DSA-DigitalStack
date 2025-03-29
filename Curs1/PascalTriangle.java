public class PascalTriangle {

    /*
     * 1
     * 1 1
     * 1 2 1
     * 1 3 3 1
     * 1 4 6 4 1
     * 1 5 10 10 5 1
     * 1 6 15 20 15 6 1
     */
    
    private static void compute(int n) {
        if (n == 0) {
            System.out.println(1);
            return;
        }
        if (n == 1) {
            System.out.println(1);
            System.out.println( "1" + " 1");
            return;
        }
        int[][] matrix = new int[n + 1][n + 1];
        matrix[0][0] = 1;
        matrix[1][0] = 1;
        matrix[1][1] = 1;
        for (int row = 2; row <= n; row++) {
            for (int col = 0; col <= row; col++) {
                if (col == 0) {
                    matrix[row][col] = 1;
                } else {
                    matrix[row][col] = matrix[row - 1][col] + matrix[row - 1][col - 1];
                } 
            }
        }
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PascalTriangle.compute(8);
    }
}
