//Connection in Java

import java.sql.*;
class connect{
	public static void main(String args[])throws SQLException,ClassNotFoundException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ORACLE","12345");
		System.out.println("Database Connected");
	}
}

