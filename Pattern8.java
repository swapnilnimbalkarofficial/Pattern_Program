public class Pattern8 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) // row
        {
            for (int j = i; j >= 1; j--) // column
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// *
// **
// ***
// ****
// *****