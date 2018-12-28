package MyBest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput1 {
	public static void main(String[] args) {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		  
		try {
			do{  
				System.out.println("enter id:");  
				int id=Integer.parseInt(br.readLine()); 
				
				System.out.println("enter name:");  
				String name=br.readLine(); 
				
				System.out.println("enter gender:");  
				String gender=br.readLine();
				
				System.out.println("enter age:");  
				float age=Float.parseFloat(br.readLine());  
				
				 System.out.println("ID	:       "+id); 
				System.out.println("Name	:       "+name);
				System.out.println("Gender	:       "+gender);
				System.out.println("Age		:       "+age);
				
				
				System.out.println("Do you want to continue: y/n");  
				String s=br.readLine();  
				if(s.startsWith("n")){  
				break;  
				}  
				}while(true);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
			   
			}}  
