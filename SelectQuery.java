import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectQuery {
	
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","avanish");
		
		Statement statement = connection.createStatement();
		
		ResultSet resultSet = statement.executeQuery("select * from student");
		
		String user = "";
		
		// iterate over the user data columns 1 and 2 and print them
		while(resultSet.next()) {
			
			user = resultSet.getInt(1)+" "+ resultSet.getString(2);
			
			System.out.println(user);
			
		}
			
		statement.close();
		connection.close();
				
		
		
	}

}
