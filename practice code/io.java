import java.io.*;
public class io {
    public static void main(String[] args) throws Exception
    {
        FileWriter fw = new FileWriter("abc.txt");
        BufferedWriter bf = new BufferedWriter(fw);

        bf.write("Welcome to file Handling");
        bf.write("\nI am studying in BCA");
        bf.write("\nBye!...");
        bf.close();
        FileReader fr = new FileReader("abc.txt");
        int data = 1;
        while (data != -1) {
            data = fr.read();
            char chardata = (char)data;
            System.out.print(chardata);
        }

        // FileInputStream fr = new FileInputStream("Screenshot (1).png");
        // int data = 1;
        // while (data != -1) {
        //     data = fr.read();
        //     char chardata = (char)data;
        //     System.out.print(chardata);
        // }
    }
}
