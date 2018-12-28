package MyBest;

public class NestedLoop {

public void getTriangle(int n) {
	
	for ( int i = 1; i <=n; i++) {
		System.out.println("A");
		for (int j = 1; j <=i; j++) {
			System.out.print("B"+" ");
		}
	}
}
	
	public static void main(String[] args) {
		NestedLoop nl = new NestedLoop();
		nl.getTriangle(5);
		
		}
	}
