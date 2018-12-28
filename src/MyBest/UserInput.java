package MyBest;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//===================================
		System.out.println("Enter your name : ");

		String name = sc.nextLine();
		
		System.out.println("Enter your age : ");

		Integer age = sc.nextInt();
		
		System.out.println("=============================================");


		System.out.println("Your name : " + name);
		System.out.println("Your  Age : " + age);

		sc.close();

	}

}
