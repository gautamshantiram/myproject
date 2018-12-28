package MyBest;

//===practicing access modifier: private/public/protected/default============================================
public class PrivateDemo {
	 
	protected int id = 22;

	protected void read() {
		System.out.println( "Reading the value of id ="+id);
	}	
	
	
//==================================================
	public static void main(String[] args) {
		PrivateDemo pd=new PrivateDemo();
		pd.read();
		
	}

}
