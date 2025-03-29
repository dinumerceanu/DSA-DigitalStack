public class PrintingPatterns {

    private static void trianglePattern(int nr_of_rows) {
        int acc = 1;
        for (int i = 1; i <= nr_of_rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(acc);
                acc += 1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        trianglePattern(5);
    }
}