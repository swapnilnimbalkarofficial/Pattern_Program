class Pattern29 {
    public static void main(String rgs[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print((char) (i + 64));
            }
            System.out.println();
        }
    }
}
// AAAAA
// BBBB
// CCC
// DD
// E