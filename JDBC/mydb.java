import java.sql.*;
import java.util.Scanner;

public class mydb {
    static final String URL = "jdbc:mysql://localhost:3306/mydb";
    static final String USER = "root";
    static final String PASSWORD = "root";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Choose an option: 1. Insert 2. Read 3. Update 4. Delete 5. Exit");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1: insertStudent(scanner); break;
                    case 2: readStudents(); break;
                    case 3: updateStudent(scanner); break;
                    case 4: deleteStudent(scanner); break;
                    case 5: System.exit(0);
                    default: System.out.println("Invalid choice!");
                }
            }
        }
    }

    public static void insertStudent(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        String query = "INSERT INTO students (name) VALUES (?)";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setString(1, name);
            pstmt.executeUpdate();
            System.out.println("Student added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void readStudents() {
        String query = "SELECT * FROM students";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateStudent(Scanner scanner) {
        System.out.print("Enter student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        String query = "UPDATE students SET name = ? WHERE id = ?";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setString(1, newName);
            pstmt.setInt(2, id);
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Student updated successfully!");
            } else {
                System.out.println("Student not found!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteStudent(Scanner scanner) {
        System.out.print("Enter student ID to delete: ");
        int id = scanner.nextInt();
        String query = "DELETE FROM students WHERE id = ?";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setInt(1, id);
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Student deleted successfully!");
            } else {
                System.out.println("Student not found!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
