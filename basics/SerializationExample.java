import java.io.*;

// Class must implement Serializable interface
class Student implements Serializable {
    private static final long serialVersionUID = 1L; // Ensures class version compatibility
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        try {
            // Creating an object
            Student student = new Student("John", 22);

            // Creating file output stream
            FileOutputStream fileOut = new FileOutputStream("student.ser");

            // Creating object output stream
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            // Writing object to file
            out.writeObject(student);

            // Closing resources
            out.close();
            fileOut.close();

            System.out.println("Object has been serialized!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
