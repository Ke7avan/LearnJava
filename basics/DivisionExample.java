import java.util.*;

public class DivisionExample {
    public static float Division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot be divided by zero");
        }
        float res = (float) a / b;
        return res;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        try {
            float res = Division(num1, num2);
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
