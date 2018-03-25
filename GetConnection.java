/*
 * 1. import the package
 * 2. load and register the driver
 * 3. establish connection
 * 4. create statement 
 * 5. execute query
 * 6. process the result
 * 7. close 
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetConnection {
	
	public static void main(String[] args) throws Exception {
		
		// load class
		Class.forName("com.mysql.jdbc.Driver");
		// create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","avanish");
		// create statement
		Statement st = con.createStatement();
		// execute the query and store into resultset
		ResultSet rs = st.executeQuery("select name from student where id=102");
		// move the pointer
		rs.next();
		
		// store the column value into string name
		String name = rs.getString("name");
		// print the value
		System.out.println(name);
		// close the connection
		st.close();
		con.close();
		
		
	}

}
