import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;


class Login {
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                                              "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    public void loginAuth(String email, String password){
        try {
            File file = new File("userCredentials.txt");
            Scanner scanner = new Scanner(file);
            boolean isExists = false;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] arr = line.split("-");
                if (arr[0].equals(email) && arr[1].equals(password)) {
                    isExists = true;
                    break;
                } 
            }
            if (isExists) {
                System.out.println("Login successful!!!");
            } else {
                System.out.println("Invalid credentials");
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void validation(String email, String password) {
        if (isValidEmail(email)) {
            if (isValidPassword(password)) {
                loginAuth(email, password);
            } else {
                System.err.println("Invalid password. Password must be at least 8 characters long.");
            }
        } else {
            System.err.println("provide valid email id");
        }
    }

    public boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean isValidPassword(String password) {
        return password.length() >= 8;
    }

    public void getUserDetails() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your email id: ");
        String email = scan.nextLine();
        System.out.print("Enter your password: ");
        String password = scan.nextLine();
        validation(email, password);
    }

    public static void main(String args[]) {
        System.out.println("Login");
    }
}
