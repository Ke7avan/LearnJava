import java.util.*;

interface Sample{
    void display();
}
public class Lambda{
    public static void main(String args[]){
        //without lambda
        Sample s = new Sample(){
            public void display(){
                System.out.println("Here is my display1");
            };
        };
        //using lambda
        Sample s1 = ()->{
            System.out.println("Here is my display2");
        };
        s1.display();

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(8);
        arr.forEach((n)->{
            System.out.println(n);
        });
    };
}