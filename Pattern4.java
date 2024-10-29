// public class Pattern4 {
//     public static void main(String args[]) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }

// }

/*
 * 12345
 * 1234
 * 123
 * 12
 * 1
 */

// class Pattern4 {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int row = 1; row <= n; row++) {
//             for (int col = 1; col <= row; col++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/*
*
**
***
****
*****
 */

class Pattern4 {
    public static void main(String args[]) {
        int n = 26;
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
 * *****
 * ****
 * ***
 * **
 * *
 */

/*
 * 
 */