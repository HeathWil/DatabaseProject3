import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {

	
	public static void main(String args[]){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:sqlserver://113300974.database.windows.net:1433;database=Project2;user=Eric71@113300974;password=Soundwave24;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;",
								     "Eric71","Soundwave24");
			Statement stmt = con.createStatement();
			ResultSet rs= stmt.executeQuery("SELECT * FROM dbo.Student");
			
			while(rs.next())
			{
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " 
						+ rs.getString(3) + " "+ rs.getInt(4));
				
			}
			
			con.close();

		}
		catch(Exception e)
		{
			//do something or nothing
			System.out.println("Exception caught: " + e);
		}
		
		//example from https://www.javatpoint.com/example-to-connect-to-the-mysql-database
	}
}
