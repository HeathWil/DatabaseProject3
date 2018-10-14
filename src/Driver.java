import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {

	
	public static void main(String args[]){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:sqlserver://113300974.database.windows.net:1433;database=Project2;user=Eric71@113300974;password=Soundwave24;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;",
					"root","root");
			Statement stmt = con.createStatement();
			ResultSet rs= stmt.executeQuery("select * from a;jsdflkj");
			
			while(rs.next())
			{
				System.out.println(rs.getString(1) + " " );
				con.close();
				
			}
		}
		catch(Exception e)
		{
			//do something or nothing
		}
		
		//example from https://www.javatpoint.com/example-to-connect-to-the-mysql-database
	}
}
