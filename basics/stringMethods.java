import java.util.*;

class stringMethods
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your string 1 : ");
        String str1 = scan.nextLine();
        System.out.print("Enter your string 2 : ");
        String str2 = scan.nextLine();
        System.out.println(str1 + " " + str2);

        //Length and Character access
        System.out.println(str1.length() + " " + str2.length());
        System.out.println(str1.charAt(0) + " " + str2.charAt(0));

        //Comparison
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.compareTo(str2));

        //Searching
        System.out.println(str1.indexOf("z"));
        System.out.println(str1.lastIndexOf("l"));
        System.out.println(str1.contains("av"));

        //Modification and Substring
        System.out.println(str1.substring(0));
        System.out.println(str1.substring(0,3));
        System.out.println(str1.concat("Welcome"));
        System.out.println(str1.replace('a','z'));

        //Case modification
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        //Trimming
        String temp1 = "   Hello World!   ";
        String temp2 = "\u2000\u2000Hello World!\u2000\u2000";
        System.out.println("'" + str1.trim() + "'");
        System.out.println("'" + str1.strip() + "'");
        System.out.println("'" + str2.strip() + "'");

        //String with array operations
        String str = "apple,banana,orange";
        String[] fruits = str.split(",");
        String joinedStr = String.join(" | ", fruits);
        System.out.println(joinedStr);
    }
}