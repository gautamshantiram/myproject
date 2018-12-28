package MyBest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;

public class DatabaseConnection {
    
    public static Connection createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch(ClassNotFoundException ce) {
            System.out.println("Cannot find the driver");
        }
        
        Connection conn = null;

        try {
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2", "root", "4923578160Sq");

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("Couldn't connect to sql servier");
        }
        
        return conn;

        
    }
    
    public static void main(String[] args) {
        Connection connection = DatabaseConnection.createConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        String selectSql = "select * from user";

        ResultSet rs = null;
        try {
            rs = statement.executeQuery(selectSql);
            while(rs.next()) {
            	String id = rs.getString("id");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                String age = rs.getString("age");
                
                System.out.println("ID  ="+id+"		Name   ="+name + "		Gender = " +gender+"		Age  ="+ age);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    
        
        
    }

}
