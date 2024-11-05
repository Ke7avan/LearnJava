import java.util.*;

class MinimumAge extends Exception{
    MinimumAge(String e){
        super(e);
    }
}

public class TryCatch {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        //Ecxeption handling
        try {
            int n = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

        //custom Exception
        try{
            int age = scan.nextInt();
            if(age<18){
                throw new MinimumAge("Must be above 18");
            }
        }
        catch(MinimumAge e){
            System.out.println(e);
        }
        System.out.println("Ended");
    }
}
