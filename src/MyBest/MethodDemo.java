package MyBest;

public class MethodDemo {
	
	
	public  void calculator(int a,int b) { // calculator is method here.
		int sum = (a + b);
		int diff = (a - b);
		int mul = ( a*b);
		System.out.println("The total is : "+sum);
		System.out.println("The diff is : "+diff);
		System.out.println("The product  is : "+mul);
		
	}
	
	
	public static void main(String[] args) {
		
		MethodDemo md = new MethodDemo();
		md.calculator(10, 20);
		
	
	}
}
