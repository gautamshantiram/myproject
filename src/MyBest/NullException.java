package MyBest;

public class NullException {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
			String s = null;  
			System.out.println(s.length());//NullPointerException  
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Rest of the code");
	}

}
