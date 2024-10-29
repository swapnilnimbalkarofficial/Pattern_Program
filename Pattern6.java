public class Pattern6 {
    public static void main(String args[]) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }
}

/*
 * 1
 * 22
 * 333
 * 4444
 * 55555
 */