import java.sql.*;

public class Database
{
	public static void main(String[] args)

	{
		try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/HW6", "root", "root");
		    Statement myStmt = myConn.createStatement();
		    ResultSet myRs = myStmt.executeQuery("select * from person");
		    System.out.println("Total Population");
		    while (myRs.next())
		    {
		    	System.out.println(myRs.getString("lastname") + ", " + myRs.getString("id"));
		    }
		
		}
		catch (Exception exc) 
		{
		    exc.printStackTrace();	
		}			
		}
	}
//	public static void main(String[] args)
//	{
//
//	}
//	public static void AllPerson() throws SQLException
//	{
//		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/HW6", "root", "root");
//	    Statement myStmt = myConn.createStatement();
//	    ResultSet myRs = myStmt.executeQuery("select * from street");
//	    System.out.println(myRs.getString("Name") + ", " + myRs.getString("id"));
//		
//	}
	
