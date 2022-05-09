//Create Table and Insert Values into it
//Develop a JDBC Application to store two accounts’ information (acc no, account holder name and balance) into the database.

import java.sql.*;
class a6q2{
	public static void main(String args[]) throws ClassNotFoundException,SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ORACLE","12345");
		System.out.println("Database Connected");
		
		// Create a Table in Database
		Statement st = c.createStatement();
		
		String query = "CREATE TABLE ACCOUNT("
		+"Acc_no number(20) not null,"
		+"Acc_name varchar2(255) not null,"
		+"balance number(15) not null)";
		
		st.execute(query);
		System.out.println("Table Created....");
		
		//Insert
		
		int a = st.executeUpdate("INSERT INTO ACCOUNT VALUES(6,'KRISHNA',50000)");
		a = st.executeUpdate("INSERT INTO ACCOUNT VALUES(7,'AMRINDER',1500)");
		System.out.println("Inserted Values Successfully");
		
		st.close();
		c.close();
	}
}