// draw a rhombus pattern
//     * * * * *
//    * * * * *
//   * * * * *
//  * * * * *
// * * * * *
import java.util.Scanner;
public class star_pattern02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for star pattern");
        int n = sc.nextInt();
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("  ");
        //     }
        //     for(int k=1;k<=n;k++){
        //             System.out.print("* ");
        //     }
        //     System.out.println();
        // }



// * * * * * 
//   * * * * *
//    * * * * *
//     * * * * *
//      * * * * *
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print("  ");
//     }
//     for(int k=1;k<=n;k++){
//             System.out.print("* ");
//     }
//     System.out.println();
// }




//     * * * * * 
//    *       *
//   *       *
//  *       *
// * * * * *
    // for(int i=n;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int k=1;k<=n;k++){
    //         if (i==1 || i==n || k==1 || k==n) {
    //             System.out.print("* ");
    //         }
    //         else{
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    // }




//    * * * * * 
//     *       *
//       *       *
//         *       *
//           * * * * *  

    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("  ");
        }
        for(int k=1;k<=n;k++){
            if (k==1 || k==n || i==1 || i==n) {
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}
}
