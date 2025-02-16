import java.util.*;


class Calculator{

    private int number = 33;
    
    public int add(int num1, int num2){
        return num1 + num2;
    }
    public int sub(int num1, int num2){
        return num1 - num2;
    }
    public int mul(int num1, int num2){
        return num1 * num2;
    }
    public int div(int num1, int num2){
        return num1 / num2;
    }
}

class main {

    static int num = 20;

    public static String hello(){
        return "Hello";
    }

    public static void main(String[] args) {

        System.out.println(num);

        Calculator cal = new Calculator();
        System.out.println(cal.add(1,10));

        System.out.println(hello());

    }

}