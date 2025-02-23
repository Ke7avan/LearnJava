import java.io.*;

public class DeserializationExample {
    public static void main(String[] args) {
        try {
            // Creating file input stream
            FileInputStream fileIn = new FileInputStream("student.ser");

            // Creating object input stream
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // Reading object from file
            Student student = (Student) in.readObject();

            // Closing resources
            in.close();
            fileIn.close();

            // Displaying the object data
            System.out.println("Deserialized Object:");
            System.out.println("Name: " + student.name);
            System.out.println("Age: " + student.age);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
