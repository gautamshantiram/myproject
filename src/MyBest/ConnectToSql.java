package MyBest;

import java.sql.*;

class ConnectToSql {

	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//this is DRIVER
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2", "root", "4923578160Sq");//this is URL 
			//here test2 is database name, root is username and 4923.....Sq is password. 
			
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from cars"); // here user is the table name on database which contains data.
			
			System.out.println("============================");
																			
			while (rs.next())// it reads all the data from user table from database.
				System.out.println(rs.getInt(1) + "		" + rs.getString(2) + "		" + rs.getString(3));
				
			//System.out.println(rs.getInt(1) + "		" + rs.getString(2) + "		" + rs.getString(3) + "		"+ rs.getInt(4));
			//the table in MySQL has 4 fields to print here.
			
			con.close();
			
		} catch (Exception e) {
			System.out.println("There is something wrong in source...check it plz");
		}
	}
}
