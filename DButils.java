package DatabaseUtils;

import java.sql.*;

public class DButils {
	public static Connection connection;

	public static Connection openConnection() throws SQLException {
		if (connection == null) {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/dac22", "root", "Shreeyash@123");
		}
		return connection;
	}
}
