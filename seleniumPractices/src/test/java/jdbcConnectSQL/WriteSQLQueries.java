package jdbcConnectSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WriteSQLQueries {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Connect SQL syntax "jdbc:mysql://ipaddress:portnumber/db_name"
		String dburl = "jdbc:mysql://localhost:3036/emp";

		String username = "DRDBA";

		String password = "password";

		String query = "Select * from employee";

		// sql jdbc driver
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection(dburl, username, password);

		Statement stmt = con.createStatement();

		ResultSet rq = stmt.executeQuery(query);

		while (rq.next()) {
			String name = rq.getString(1);
			String pass = rq.getString(2);

			System.out.println(name + "  " + pass);
		}

		con.close();

	}

}
