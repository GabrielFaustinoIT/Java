//Gabriel Faustino - 3005399

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaConnect {
	public static Connection fazConexao() throws SQLException {
		
		String url = "jdbc:sqlserver://DESKTOP-F4TDNDA:1433;databaseName=TPFINAL";
		String user = "gabrielads";
		String password = "123456";
		
		try {
			
			return DriverManager.getConnection(url, user, password);
		
		} catch (SQLException e) {
			
			throw new RuntimeException(e);
		}
		
	}
}