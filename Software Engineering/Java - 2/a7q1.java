import java.sql.*;
import java.util.*;
class a7q1{
	public static void main(String args[]) throws ClassNotFoundException,SQLException
	{
		//Input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Acc No");
		int a = sc.nextInt();	
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ORACLE","12345");
		System.out.println("Database Connected");
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("Select * from account where acc_no="+a);
		if(rs.next()){
			String name = rs.getString(2);
			int bal = rs.getInt(3);
			System.out.println ("Account holder's name : " + name);
			System.out.println ("Account Balance : Rs. " + bal);
		}
		else{
			System.out.println("Account Not Exists");
		}
		st.close();
		con.close();
	}
}
		