import java.util.*;
class Ispalindrome {
    public boolean isPalindrome(int x) {
        int rev=0,temp = x;
        if(x<0) return false;
        while(temp != 0){
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if(x==rev){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Ispalindrome sl = new Ispalindrome();
        System.out.println(sl.isPalindrome(x));
        sc.close();
    }
}