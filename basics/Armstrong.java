import java.util.*;

public class Armstrong {

    public static int isArmstrong(int num) {
        String s = Integer.toString(num);
        int res = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int digit = Character.getNumericValue(s.charAt(i));
            res += Math.pow(digit, len);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int res = isArmstrong(num);
        if (num == res) {
            System.out.println(num + " is an Armstrong Number.");
        } else {
            System.out.println(num + " is not an Armstrong Number.");
        }
    }
}
