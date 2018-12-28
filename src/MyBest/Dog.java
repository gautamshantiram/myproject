package MyBest;

public class Dog extends Animal{
	public void move() {
		System.out.println("Dogs can move...");
		
	}
	
	public static void main(String[] args) {
		Animal d = new Dog(); 		//this is Upcasting
		Animal c = new Cat(); 		//this is Upcasting
		Animal a = new Animal();	//this is general objective.

		d.move();	// this is runtime polimorphism
		c.move();	// this is runtime polimorphism
		a.move();	// this is general method call/invoke
	}

}
