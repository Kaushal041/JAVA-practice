public class patterns{
    public static void main(String[] args) {
        int n = 15;
        for(int i = 0;i<4;i++){
            for(int j=1;j<n;j++){
                if(j%3==0)
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}