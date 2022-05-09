//Develop a JDBC application that delete all the account whose balance is less than 10,000.(delete)

import java.sql.*;
class a6q4{
	public static void main(String args[]) throws ClassNotFoundException,SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ORACLE","12345");
		System.out.println("Database Connected");
		
		
		Statement st = c.createStatement();
		
		int a = st.executeUpdate("DELETE FROM ACCOUNT WHERE BALANCE<10000");
		System.out.println("Values Deleted Successfully");
		
		st.close();
		c.close();
	}
}