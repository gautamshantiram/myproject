package MyBest;

public class Main extends Rectangle{

	

	public Main(int length, int breadth) {
		super(length, breadth);
		
	}

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(10, 20);
		Square sq 	= new Square(30, 30);

		rec.getArea();
		sq.getArea();

}
}