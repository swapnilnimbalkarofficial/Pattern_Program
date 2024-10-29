public class Pattern14 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++)// 5<=1
        {
            for (int j = n; j >= n - i + 1; j--)// 5>=1
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
// 5
// 54
// 543
// 5432
// 54321