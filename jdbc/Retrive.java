package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Retrive {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "postgres";

        String sql = "SELECT * FROM emp";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql);
        	
             ResultSet rs = pstmt.executeQuery()) {
        	
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String role = rs.getString("role");

                System.out.println("ID: " + id + ", Name: " + name + ", Role: " + role);
            }
        } catch (SQLException e) {
            System.out.println("Error fetching data: " + e.getMessage());
        }
    }
}

