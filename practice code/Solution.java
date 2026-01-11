import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = "October 1 is a  2014 Nigerian  psycho­logical.";
        // System.out.println(str.toLowerCase());
        // System.out.println(str.replace(" ", "_"));
        // String letter = sc.nextLine();
        // System.out.printf("Dear %s ,Thanks a lot",letter);
        // System.out.println(str.indexOf("  "));
        // System.out.println(str.indexOf("   "));
        

        // System.out.println("Eneter the subject 1 marks : ");
        // float sub1 = sc.nextFloat();
        // System.out.println("Eneter the subject 2 marks : ");    
        // float sub2 = sc.nextFloat();
        // System.out.println("Eneter the subject 3 marks : ");    
        // float sub3 = sc.nextFloat();
        // float per = (sub1+sub2+sub3)/3;
        // int back=0;
        // if (sub1 < 33){
        //     back++;
        // }
        // if (sub2 < 33){
        //     back++;
        // }
        // if (sub3 < 33){
        //     back++;
        // }
        //     if (per >= 40){
        //         if (back==1){
        //             System.out.println("Congratulation you pass ;-) with one BACK");
        //             System.out.printf("You got overall %.2f percentage",per);
        //         }
        //         else if (back==2){
        //             System.out.println("Congratulation you pass ;-) with two BACK");
        //             System.out.printf("You got overall %.2f percentage",per);
        //         }
        //         else{
        //             System.out.println("Congratulation you pass ;-)");
        //             System.out.printf("You got overall %.2f percentage",per);
        //         }
        //         }
        // else{
        //     System.out.println("Batter luck next time :-)");
        //     System.out.printf("You got %.2f percentage",per);
        // }



        // System.out.println("Enter your salary");
        // float income =sc.nextFloat();
        // if (income <= 250000){
        //     System.out.println("You don't have pay extra ;-)");
        // }
        // else if (250000 < income && 500000 > income) {
        //     System.out.println("You will have to pay 5% tax to government");
        //     float tax = income*95/100;
        //     System.out.println("Now your salary is "+tax);
        // }
        // else if (500000 <= income && 1000000 > income) {
        //     System.out.println("You will have to pay 20% tax to government");
        //     float tax = income*80/100;
        //     System.out.println("Now your salary is "+tax);
        // }
        // else{
        //     System.out.println("You will have to pay 30% tax to government");
        //     float tax = income*95/100;
        //     System.out.println("Now your salary is "+tax);




        // System.out.println("Enter a number");
        // short num = sc.nextShort();
        // // switch (num) {
        // //     case 1:
        // //         System.out.println("Monday");
        // //         break;
        // //     case 2:
        // //         System.out.println("Tuesday");
        // //         break;
        // //     case 3:
        // //         System.out.println("Wednesday");
        // //         break;
        // //     case 4:
        // //         System.out.println("Thursday");
        // //         break;
        // //     case 5:
        // //         System.out.println("Friday");
        // //         break;
        // //     case 6:
        // //         System.out.println("Saturday");
        // //         break;
        // //     case 7:
        // //         System.out.println("Sunday"); 
        // //         break;       
        // //     default:
        // //         System.out.println("Wrong");
        // //         break;

        // switch (num) {
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
        //     default -> System.out.println("Wrong number");
        // }



        //-----------------------------------------leap year-----------------------------------------
        // System.out.println("Enter a year");
        // int year = sc.nextInt();
        // if (year%100==0) {
        //     if (year%400==0) {System.out.println("Entered year is leap");
        //     }
        //     else{
        //         System.out.println("Entered year is not leap year");
        //     }
                
                       
        // }
        // else{
        //     if (year%4==0){
        //         System.out.println("Entered year is leap");
        //     }
        //     else{
        //         System.out.println("Entered year is not leap year");
        //     }
        // }






        // System.out.println("Enter a website");
        // String str = sc.next();
        // if((str.lastIndexOf(".com"))!=-1){                          //str.endsWith(".com")
        //     System.out.println("Given website is Commercial");
        // }
        // else if (str.lastIndexOf(".org")!=-1){                      //str.endsWith(".org")
        //     System.out.println("Given website is Organization");
        // }
        // else if(str.lastIndexOf(".in")!=-1) {                       //str.endsWith(".in")
        //     System.out.println("Given website is Indian");
        // }
        // else{
        //     System.out.println("Out of range");
        // }



//----------------------------- first n odd numbers---------------
        // System.out.println("Enter a number");
        // int n =sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     if (i%2!=0){
        //         System.out.println(i);
        //     }
        // }





// ------------------------ first n natural numbers=--------------------
        // System.out.println("Enter a number");
        // int n = sc.nextInt();
        // for (int i=n;i>0;i--){
        //     System.out.println(i);
        // } 





//---------------sum of first n even number---------------------
        // System.out.println("Enter a number");
        // int n = sc.nextInt();
        // int sum =0;
        // for(int i=0;i<n;i++){
        //         if (i%2==0) {
        //                 sum=sum+i;
        //         }
        // }
        // System.out.println("\nTotal sum even numbers is :"+sum);







//---------------------Table print -------------------
        // System.out.println("Enter a number");
        // int n = sc.nextInt();
        // for (int i=1;i<11;i++){
        //         System.out.printf("%d x %d = %d",n,i,i*n);
        //         System.out.println(" ");
        // }







//---------------------Table printe in reverse order-----------------------
        // System.out.println("Enter a number");
        // int n = sc.nextInt();
        // for (int i=10;i>=1;i--){
        //         System.out.printf("%d x %d = %d",n,i,i*n);
        //         System.out.println(" ");
        // }





        //-----------------Find factorial-------------
        // System.out.println("Enter a number");
        // int n = sc.nextInt();
        // int fact = 1;
        // for(int i=n;i>=1;i--){
        //         fact = fact*i;
        // }
        // System.out.println(fact);





//--------------infite 5 repeat-------------
        // int i = 5;
        // while (true) {
        //         System.out.println(i);           
        // }



        // for(int i=5;true;i++){
        //         System.out.println(i);
        //         i--;
        // }

        //---------------multiply of mutitiple of 8-------------------
        // int n = 0;
        // for(int i=1;i<=10;i++){
        //         n+=i*8;
        // }
        // System.out.println(n);

//WAP to create an array and display it in the screen
        // System.out.println("Enter the 5 elements of array ");
        // int [] a =new int [5];
        // for(int i=0;i<5;i++){
        //         a[i]=sc.nextInt();
        // }
        // System.out.println("Printed array ");
        // for(int i=0;i<a.length;i++){
        //         System.out.println(a[i]);
        // }
        




//WAP to find max and min element of array
        // int max=0,a[] = {1,6,3,4,5};
        // int min=0;
        // for(int i=0;i<a.length;i++){
        //         if(max<a[i]){
        //                 max=a[i];
        //         }
        // }
        // min=max;
        // for(int i=0;i<a.length;i++){
        //         if(min>a[i]){
        //                 min=a[i];
        //         }
        // }
        // System.out.println("Maximum number is : "+max);
        // System.out.println("Minimum number is : "+min);

//WAP to insert an element in an array at:
//i.Begining position
        // System.out.println("Enter new element of insertion at begining position");
        // int ib=sc.nextInt();
        // a[0]=ib;

//ii.Spacified position
        // System.out.println("Enter position for element insertion ");
        // int eip=sc.nextInt();
        // System.out.println("Enter new element of insertion at begining position");
        // int sp=sc.nextInt();
        // a[eip-1]=sp;
        // System.out.println("After insertion ");
        // for(int i=0;i<a.length;i++){
        //         System.out.println(a[i]);
        // }



//WAP to deletion an element in an array at:
// i.Begining posision
// System.out.println("Deleted element from begining");
// int a1 [] =new int [4];
// for(int i=0;i<4;i++){
//         if (a[i]!=a[0]) {
//                 a1[i]=a[i];
//                 System.out.println(a1[i]);
//         }
// }

//ii.Spacified position
// System.out.println("Enter the position for delition element");
// int d = sc.nextInt();
// System.out.println("Deleted element from spacified position");
// int a2 [] = new int [a.length];
// for(int i=0;i<a2.length;i++){
//         if (a[i]!=a[d-1]) {
//                 a2[i]=a[i];
//                 System.out.println(a[i]);
//         }
// }

//WAP to find the reverse of a string(Words)
        // String str = sc.nextLine();
        // String [] s = str.split(" ");
        // for(int i=s.length-1;i>=0;i--){
        //         System.out.print(s[i]+" ");
        // }
        
//         import java.util.*;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int N = scanner.nextInt();
//         scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//         if(N%2==0){
//             if(2<=N && N<=5){
//                 System.out.println("Not Weird");
//             }
//             else if(N>=6 && N<=20){
//                 System.out.println("Weird");
//             }
//             else{
//                 System.out.println("Not Weird");
//             }
//         }
//         else{
//             System.err.println("Weird");
//         }

//         scanner.close();
//     }
// }
}
}
