//Develop a JDBC application that increases the balance of all account by rupees 500.(Update)

import java.sql.*;
class a6q3{
	public static void main(String args[]) throws ClassNotFoundException,SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ORACLE","12345");
		System.out.println("Database Connected");
		
		
		Statement st = c.createStatement();
		int a = st.executeUpdate("UPDATE ACCOUNT SET BALANCE = BALANCE+500");
		System.out.println("updated Values Successfully");
		
		st.close();
		c.close();
	}
}