package jdbcdemo;
import java.sql.*;
public class Driver {

	public static void main(String[] args) {
		
		try{
			Connection myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/saurabh","root","password");
			PreparedStatement myStmt = myconn.prepareStatement("select id from employee where id>=?");
			myStmt.setInt(1, 2);
			ResultSet rs=myStmt.executeQuery();
		    while(rs.next())
		    {
		    	int a= rs.getInt(1);
		    	System.out.println(a);
		    }
			}
		
		catch(SQLException ecp)
		{
			ecp.printStackTrace();
		}

	}


}
