import java.sql.*;
import java.util.*;
class a7q3{
	public static void main(String args[]) throws ClassNotFoundException,SQLException
	{			
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ORACLE","12345");
		System.out.println("Database Connected");
		
		Statement st = con.createStatement();
		PreparedStatement ps = con.prepareStatement("INSERT INTO ACCOUNT VALUES(?,?,?)");
		ps.setInt(1,1009);
		ps.setString(2,"Hamesh");
		ps.setInt(3,12000);
		int x = ps.executeUpdate();
		
		ps.setInt(1,1010);
		ps.setString(2,"RAKESH");
		ps.setInt(3,9800);
		x = ps.executeUpdate();
		
		System.out.println("Inserted Values Successfully");
		ps.close();
		st.close();
		con.close();
	}
}