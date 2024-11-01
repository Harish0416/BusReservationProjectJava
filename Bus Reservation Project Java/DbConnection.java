import java.sql.*;

public class DbConnection {
    private static final String url ="jdbc:mysql://127.0.0.1:3306/busresr";
    private static final String userName = "root";
    private static final String passWord = "Mysqljdbc123";

	public static Connection getConnection() throws SQLException{
		return  DriverManager.getConnection(url,userName,passWord);        
    }
}
