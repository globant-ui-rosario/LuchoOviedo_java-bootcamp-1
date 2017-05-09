package topic5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectToServer {
	
	private Connection connect;

	public ConnectToServer() throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		
	}

	public Connection connectTo() throws SQLException {
		
		if (this.connect == null || this.connect.isClosed()) {
		
			this.connect = DriverManager.getConnection(
					"jdbc:mysql://localhost:3305/schoolDB","root","root");	
			
		}
		return connect;
	}

	public void disconnect() throws SQLException {
		connect.close();
	}


}
