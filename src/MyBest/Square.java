package MyBest;

public class Square extends Rectangle{

	public Square(int length, int breadth) {
		super(length, breadth);
		
	}
	public void getArea() {
		int area = (length*length);
		System.out.println("The area of Square = "+area);
		
	}
	

}
