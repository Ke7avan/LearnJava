import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

class Register{
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                                              "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    public void RegisterAuth(String email, String password){
        File myFile = new File("userCredentials.txt");
        try{
            if(!myFile.exists()){
                if(myFile.createNewFile()){
                    FileWriter myWriter = new FileWriter("userCredentials.txt");
                    myWriter.write(email + "-" + password);
                    myWriter.close();
                }
            } else {
                FileWriter myWriter = new FileWriter("userCredentials.txt", true);
                myWriter.write("\n"+email + "-" + password);
                myWriter.close();
            }
            System.out.println("Registered successfully!!!");
        } catch(Exception e){
            System.err.println(e);
        }
    }

    public void validation(String email, String password, String confirmPassword) {
        if (isValidEmail(email)) {
            if (isValidPassword(password)) {
                if(!password.equals(confirmPassword)){
                    System.err.println("Both passwords are not the same");
                } else {
                    RegisterAuth(email, password);
                }
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
        System.out.print("Re-Enter your password: ");
        String confirmPassword = scan.nextLine();
        validation(email, password, confirmPassword);
    }

    public static void main(String args[]){
        
    }
}