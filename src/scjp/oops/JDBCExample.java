package scjp.oops;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;





public class JDBCExample {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub      
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "N1@ayana");
		//Statement ps = con.createStatement();
		String sq = "select * from sakila.actor where actor_id =?";
		PreparedStatement ps = con.prepareStatement(sq);
		ps.setInt(1, 10);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1));
		}
	
}
}
