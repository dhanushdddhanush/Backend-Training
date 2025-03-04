package jdbc;
import java.sql.*;
 
public class DataBaseConnection {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String password = "postgres";
		
		String sql = "insert into emp (id,name,role) values(?,?,?)";
		
		
		try(Connection conn = DriverManager.getConnection(url, user, password);
	             PreparedStatement pstmt = conn.prepareStatement(sql))
		{
			
			pstmt.setInt(1, 106);
			pstmt.setString(2,"Panda");
			pstmt.setString(3,"Internship");
			int rowInserted = pstmt.executeUpdate();
			if(rowInserted>0) {
				System.out.println("Inserted Row");
			}
		}catch(SQLException e) {
			System.out.println(e);
		}
		
	}
 
}
 
 