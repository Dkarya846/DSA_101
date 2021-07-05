public class Program {
    public static void main(String[] args){
        if(args.length > 0){
            System.out.println("Cmd Arguments are: ");
            for(String arg: args){
                System.out.print(arg + " ");
            }
            System.out.println();
        }
        else{
            System.out.println("No arguments are found");
        }
    }
}
