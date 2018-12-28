package MyBest;

public class Cat extends Animal{
	public void move() {
		System.out.println("Cats can move...");
		
	}
	

	public static void main(String[] args) {
		Animal d = new Dog();
		Animal c = new Cat();
		Animal a = new Animal();
		
		
		d.move();
		c.move();
		a.move();
		
	}

}
