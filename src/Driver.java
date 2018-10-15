import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {

	
	public static void main(String args[]){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:sqlserver://113300974.database.windows.net:1433;database=Project2;user=Eric71@113300974;password=Soundwave24;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;",
					"Eric71","Soundwave24");
			Statement stmt = con.createStatement();
			Scanner reader = new Scanner(System.in);

			System.out.println("Please insert pid, pname, max_score and aid of Problem, separated by commas: ");
			String input = reader.next();
			ArrayList<String> inputs = new ArrayList<String>(Arrays.asList(input.split(",")));
			
			//TODO: find the problem and estimate max score
			
			
			
			//TODO:Increase Author compensation
			
			
			
			
			//Display information
			
			ResultSet rs= stmt.executeQuery("SELECT * FROM dbo.Problem");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " 
						+ rs.getInt(3) + " "+ rs.getInt(4));
				
			}
			
			rs= stmt.executeQuery("SELECT * FROM dbo.Author");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " 
						+ rs.getInt(3));
				
			}
			
			
			con.close();

		}
		catch(Exception e)
		{
			//do something or nothing
			System.out.println("Exception caught: " + e);
		}
		
		
	}
}
