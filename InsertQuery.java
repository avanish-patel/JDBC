import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertQuery {

	public static void main(String[] args) throws Exception {
		
		int id = 105;
		String name = "kevin";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","avanish");
		
		Statement statement = connection.createStatement();
		
		int count = statement.executeUpdate("insert into student values ("+id+",'"+name+"')");
		
		System.out.println(count+ " numbers of row/s affected.");
		
		
		statement.close();
		connection.close();
	}
}
