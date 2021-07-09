import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        
        System.out.print("Enter a pattern to match: ");
        String pattern = input.nextLine();

        System.out.print("Enter a Decimal number: ");
        String number = input.nextLine();
        input.close();

        patternMatching(string, pattern);
        patternMatchingTut(string, pattern);
        printAfterDecimal(number);

        
    }    

    public static void patternMatching(String string, String pattern){
        
        for(int i = 0; i < string.length() - pattern.length() + 1; i++){
            int index = string.indexOf(pattern, i);
            if(index < 0){
                System.out.print("Pattern not found in String");
                return;
            }
            System.out.print( index + " ");
            i = index; 
        }
        System.out.println();
    }

    public static void patternMatchingTut(String string, String pattern){
        int pos = string.indexOf(pattern);
        if(pos == -1){
            System.out.println("Pattern not found");
            return;
        }
        while(pos >= 0){
            System.out.print(pos+" ");
            pos = string.indexOf(pattern, pos + 1);
        }
        System.out.println();
    }

    public static void printAfterDecimal(String number){
        int index = number.indexOf('.');
        if(index >= 0)
            System.out.println(number.substring(index + 1));
        else
            System.out.println("Not a decimal number");
    }

}
