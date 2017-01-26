package Conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	public Connection getConnection() throws Exception
	{
		try
		{
			String connectionURL = "jdbc:mysql://alfastudent.hopto.org:3306/alfastudent";
			Connection connection = null;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(connectionURL, "root", "root");
			return connection;
		} catch (Exception e)
		{
			throw e;
		}

	}
}
