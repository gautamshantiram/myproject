package MyBest;

class A extends Thread{
	synchronized public void run() {
		for (int a = 0; a < 4; a++) {
			System.out.println("Sapana");
			try {Thread.sleep(500);} catch (Exception e) {}
		}
	}
}

class B extends Thread {

	public void run() {
		for (int i = 0; i < 4; i++) {

			System.out.println("Shanti Ram");
			try {Thread.sleep(500);} catch (Exception e) {}

		}
	}
}


public class MultipleThreadDemo {
	
public static void main(String[] args) {
		A obj = new A();
		B obj1 = new B();

		obj.start();
		//try {Thread.sleep(1000);} catch (Exception e) {}
		obj1.start();

	}

}
