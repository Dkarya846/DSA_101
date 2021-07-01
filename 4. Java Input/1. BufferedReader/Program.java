import java.io.*;
public class Program {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a String: ");
        String str = br.readLine();
        System.out.println("Entered String is: "+str);

        System.out.print("Enter a Number: ");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Entered Integer is: "+a);

    }
}
