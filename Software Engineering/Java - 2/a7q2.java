import java.sql.*;
import java.util.*;
class a7q2{
	public static void main(String args[]) throws ClassNotFoundException,SQLException
	{
			
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ORACLE","12345");
		System.out.println("Database Connected");
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("Select * from account where balance>3000");
		while(rs.next()){
			int ac = rs.getInt(1);
			String name = rs.getString(2);
			int bal = rs.getInt(3);
			System.out.println ("Account holder's Number : " + ac);
			System.out.println ("Account holder's name : " + name);
			System.out.println ("Account Balance : Rs. " + bal);
			System.out.println("\n");
		}		
		st.close();
		con.close();
	}
}