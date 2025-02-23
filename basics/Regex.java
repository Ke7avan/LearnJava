import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex
{
    public static void main(String args[])
    {
        Pattern pattern = Pattern.compile("kesav");
        // Pattern pattern = Pattern.compile("kesav", Pattern.CASE_INSENSITIVE); // case insensitive
        Matcher matcher = pattern.matcher("Hello kesav");
        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("Match found");
        }
        else {
            System.out.println("Match not found");
        }

        Pattern.compile("[abefjj]"); //Find one character from the options between the brackets
        Pattern.compile("[^hfrshd]") //Find one character NOT between the brackets
        Pattern.compile("[0-9]") //Find one character from the range 0 to 9
        Pattern.compile("\\d+"); // Matches one or more digits
        Pattern.compile("\\D+"); // Matches one or more non-digits
        Pattern.compile("\\w+"); // Matches words (a-z, A-Z, 0-9, _)
        Pattern.compile("\\W+"); // Matches special characters (except a-z, A-Z, 0-9, _)
        Pattern.compile("\\s+"); // Matches spaces, tabs, newlines
        Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"); //Matching Email Pattern
        Pattern.compile("\\d{10}"); // Matches a 10-digit number

    }
} 