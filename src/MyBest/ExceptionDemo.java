package MyBest;

public class ExceptionDemo {

	public static void main(String[] args) {

		int a = 100;
		int b = 0;

		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {

		}
		System.out.println("There is a problem running this program");

	}

}
