public class Pattern7 {
    public static void main(String args[]) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col >= row; col--) {
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
/*
 * 55555
 * 4444
 * 333
 * 22
 * 1
 */