package jdbcConnectSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class WriteSQLQueries1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String dburl = "jdbc:mysql://localhost:4567/emp";
		String username = "test";
		String password = "test";
		String query = "Select * from employee";

		Class.forName("com.mysql.jdbc.driver");

		ResultSet con = (DriverManager.getConnection(dburl, username, password)).createStatement().executeQuery(query);

		while (con.next()) {
			String s = con.getString(1);
			String d1 = con.getString(2);
		}
		con.close();
	}

}
