public class Pattern25 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j >= n; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
// 12345
// 1234
// 123
// 12
// 1