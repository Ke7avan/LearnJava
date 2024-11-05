import java.util.*;

public class List{
    public static void main(String args[]){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("One");
        arr.add("Two");
        arr.add("Four");
        arr.remove("Four"); // or index can be passed
        arr.set(1,"Three");
        System.out.println(arr);
    }
}