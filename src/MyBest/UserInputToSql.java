package MyBest;
import java.sql.*;
import java.io.*;
public class UserInputToSql {
  
	public static void main(String args[])throws Exception{  
	Class.forName("com.mysql.cj.jdbc.Driver");  
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test2", "root", "4923578160Sq");  
	  
	PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?,?)");  
	  
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	  
	do{  
	System.out.println("enter id:");  
	int id=Integer.parseInt(br.readLine()); 
	
	System.out.println("enter name:");  
	String name=br.readLine(); 
	
	System.out.println("enter gender:");  
	String gender=br.readLine();
	
	System.out.println("enter age:");  
	float age=Float.parseFloat(br.readLine());  
	  
	ps.setInt(1,id);  
	ps.setString(2,name); 
	ps.setString(3,gender);
	ps.setFloat(4,age);  
	
	int i=ps.executeUpdate();  
	System.out.println(i+" records affected");  
	  
	System.out.println("Do you want to continue: y/n");  
	String s=br.readLine();  
	if(s.startsWith("n")){  
	break;  
	}  
	}while(true);  
	  
	con.close();  
	}}  
	

