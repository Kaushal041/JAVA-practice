import java.util.*;

class a{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int p = (int) Math.pow(2,i);
            System.out.println(p+" = p ");
            for(int j = 0;j<n;j++){
                System.out.print(a+(p*b)+" ");
            }
        }
        in.close();
    }
}