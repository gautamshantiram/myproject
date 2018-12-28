package MyBest;

public class ProtectedDemo {
	
	
	
	
	protected int id = 22;

	protected void read() {
		System.out.println( "Reading the value of id ="+id);
	}	
	
	
//==================================================
	public static void main(String[] args) {
		ProtectedDemo pd=new ProtectedDemo();
		pd.read();
		
	}


}
