//Develop a JDBC application that prompt the end – user to enter account detail and stores the same into the data-base.(User Input)

import java.sql.*;
import java.util.*;
class a6q4{
	public static void main(String args[]) throws ClassNotFoundException,SQLException
	{
		//Input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Acc No");
		int a = sc.nextInt();
		System.out.println("Enter Acc Name");
		String b = sc.next();
		System.out.println("Enter balance");
		double c = sc.nextDouble();
		
		
		//Database Connect
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ORACLE","12345");
		System.out.println("Database Connected");
		
		Statement st = con.createStatement();
		
		int  d = st.executeUpdate("INSERT INTO ACCOUNT VALUES("+a+",'"+b+"',"+c+")");
		System.out.println("Inserted Values Successfully");
		
		st.close();
		con.close();
	}
}