package in.chainsys.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionUtil {

	public ConnectionUtil() {
		// Default constructor
	}

	private static String driverClassName = "oracle.jdbc.driver.OracleDriver";
	
	private static String url = System.getenv("oracle.datasource.url");
	private static String username = System.getenv("oracle.datasource.username");
	private static String password = System.getenv("oracle.datasource.password");

	/**
	 * This method creates a database connection.
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driverClassName);
		return DriverManager.getConnection(url, username, password);
	}

	/**
	 * This method is used to close the connection of Resultset connection and
	 * prepared statement Method overloading
	 * 
	 * @param con
	 */
	public static void close(ResultSet rs, Statement statement, Connection con) {
		try {

			if (rs != null) {
				rs.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method closes the connections for statement and connection.
	 * 
	 * @param statement
	 * @param con
	 */
	public static void close(Statement statement, Connection con) {
		try {
			if (statement != null) {
				statement.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
	