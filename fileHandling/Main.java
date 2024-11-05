import java.util.*;

class userLogin extends Login{

}

class userRegister extends Register{
    
}

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Login\n2.Register");
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();
        if(choice == 1) {
            userLogin user = new userLogin();
            user.getUserDetails();
        } else {
            userRegister user = new userRegister();
            user.getUserDetails();
        }
    }
}