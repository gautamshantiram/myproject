package MyBest;

public class ContinueDemo {

	public static void main(String[] args) {
		System.out.println("Prints the even number from 1 to 20 skipping all odd numbers :");
		
		
		for (int i =1;i<=20;i++)
		{
			if (i%2!=0) 		// it means remainder is not equal to 0 when dividing by 2.
				continue;		//continue helps to skip the number 5. if we use 'Break' in the 
								//...place of continue it terminates the.
			System.out.print(i+",  ");
		
		}
		 
	}

}
