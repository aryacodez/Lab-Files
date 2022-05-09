//Develop a JDBC application that implements the use case of depositing some amount into a specified account.

import java.sql.*;
import java.util.*;
class a6q6{
	public static void main(String args[]) throws ClassNotFoundException,SQLException
	{
		//Input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Acc No");
		int a = sc.nextInt();	
		System.out.println("Enter balance");
		double c = sc.nextDouble();
		
		
		//Database Connect
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ORACLE","12345");
		System.out.println("Database Connected");
		
		Statement st = con.createStatement();
		
		int x = st.executeUpdate("UPDATE ACCOUNT SET BALANCE=BALANCE+"+c+"WHERE ACC_NO="+a);
		System.out.println("updated Values Successfully");		
		st.close();
		con.close();
	}
}