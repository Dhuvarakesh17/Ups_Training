package jdbc;
import java.sql.*;

public class jdbc {

	private static final String url="jdbc:mysql://localhost:3306/upstraining";
	private static final String USER="root";
	private static final String PASSWORD="Dhuvarakesh@123";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,USER,PASSWORD);
		
	}

}
