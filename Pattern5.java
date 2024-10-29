public class Pattern5 {
    public static void main(String args[]) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
/*
 * 54321
 * 5432
 * 543
 * 54
 * 5
 */