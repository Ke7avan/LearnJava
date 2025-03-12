import java.sql.*;

public class mydb {
    public static void main(String[] args)
    {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "root";

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection con = DriverManager.getConnection(url, username, password);

            // Create Statement
            Statement stmt = con.createStatement();

            // Execute Query
            String query = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(query);

            // Iterate Over ResultSet
            while (rs.next()) { 
                System.out.println("Name: " + rs.getString("name"));
            }

            // Close Resources
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
