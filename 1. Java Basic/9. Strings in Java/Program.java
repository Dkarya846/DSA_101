public class Program{
    public static void main(String [] args){
        char []a = {'g', 'e', 'e', 'k', 's'};

        for(char item: a )
            System.out.print(item);
        System.out.println();
        String str = "geeks";
        System.out.println("String with String Class: " + str);
        
        StringBuffer str1 = new  StringBuffer("geeks");
        System.out.println("String with StringBuffer Class: " +str1);

        StringBuilder str2 = new  StringBuilder("geeks");
        System.out.println("String with StringBuilder Class: " +str2);

        System.out.println("Methods of String: \n");

        String string = "geeksforgeeks";
        System.out.println("String is: " + string);

        System.out.println("\"geeksforgeeks\".length(): " + string.length());
        System.out.println("\"geeksforgeeks\".charAt(3): " + string.charAt(3));
        System.out.println("\"geeksforgeeks\".substring(2): " + string.substring(2));
        System.out.println("\"geeksforgeeks\".substring(2, 5): " + string.substring(2, 5));
        System.out.println("\"geeksforgeeks\".contains(\"geeks\"): " + string.contains("geeks"));
        System.out.println("\"geeksforgeeks\".equals(\"gfg\"): " + string.equals("gfg"));
        System.out.println("\"geeksforgeeks\".compareTo(\"geeksforgeeks\"): " + string.compareTo("geeksforgeeks"));
        System.out.println("\"geeksforgeeks\".indexOf(\"g\"): " + string.indexOf("g"));
        System.out.println("\"geeksforgeeks\".lastIndexOf(\"g\"): " + string.lastIndexOf("g"));
        System.out.println("\"geeksforgeeks\".equalIgnoreCase(\"GeeksForGeeks\"): " + string.equalsIgnoreCase("GeeksForGeeks"));
        System.out.println("\"geeksforgeeks\".toUpperCase(): " + string.toUpperCase());
        System.out.println("\"geeksforgeeks\".toLowerCase(): " + string.toLowerCase());

        System.out.println("String and StringBuilder: ");

        String string1 = "geeks";
        String string2 = string1;

        string1 += "forgeeks";

        System.out.println("are string1 and string2 same: "+(string1 == string2));


        StringBuilder string3 = new StringBuilder("geeks");
        StringBuilder string4 = string3;

        string3.append("forgeeks");

        System.out.println("are string3 and string4 same: "+ (string3 == string4));
    }
}