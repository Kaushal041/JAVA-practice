//Draw that patten with n numbers
// *****
// *   *
// *   *
// *   *
// *****

import java.util.Scanner;

public class star_pattern01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for star pattern");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (i==1 || j==1 ||j==n ||i==n) {
                    
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }        
    

// * * * * * * * * * * * 
// * *               * *
// *   *           *   *
// *     *       *     *
// *       *   *       *
// *         *         *
// *       *   *       *
// *     *       *     *
// *   *           *   * 
// * *               * *
// * * * * * * * * * * *


// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n;j++){
//         if (i==1 || j==1 ||j==n ||i==n ||i==j || j==n-i+1) {
            
//             System.out.print("* ");
//         }
//         else{
//             System.out.print("  ");
//         }
//     }
//     System.out.print("\n");
// }        
    }
}
