import java.util.Scanner;

enum Gender {
    Male,
    Female,
    Transgender
}

public class Enum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter gender (Male, Female, Transgender): ");
        String input = scan.nextLine();
        try {
            // Convert the string input to enum
            Gender gender = Gender.valueOf(input);
            System.out.println("Gender: " + gender);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid gender input. Please enter Male, Female, or Transgender.");
        }
        scan.close();
    }
}
