import java.util.Scanner;
import java.util.Random;
public class rock_paper_scissor {
    public static void main(String[] args) {
    int i = 0;
    while (i!=5) 
    {
    System.out.println("Choose Rock, Paper, Scissor");
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    String str = sc.next();
    int com = random.nextInt(2);
    int l = 0;
    switch (str) {
        case ("Rock") ->l=1;
        case ("Paper") ->l=2;
        case ("Scissor") ->l=3;
        case ("rock") ->l=1;
        case ("paper") ->l=2;
        case ("scissor") ->l=3;
        default -> System.out.println("Wrong speling or text");
    }
    if (com==0){
        System.out.println("Computer choose Rock");
        if (l==1) {
            System.out.println("Tie");            
        }
        else if (l==2) {
            System.out.println("You Won");            
        }
        else{
            System.out.println("You Lose");
        }
    }
    else if (com==1){
        System.out.println("Computer choose Paper");
        if (l==1) {
            System.out.println("You lose");            
        }
        else if (l==2) {
            System.out.println("Tie");            
        }
        else{
            System.out.println("You Win");
        }
    }
    else{
        System.out.println("Computer choose Scissor");
        if (l==1) {
            System.out.println("You lose");            
        }
        else if (l==2) {
            System.out.println("You Won");            
        }
        else{
            System.out.println("Tie");
        }
    }
    i++;
    }
    }
}
