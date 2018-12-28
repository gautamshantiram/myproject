package MyBest;
//class can be only public or (default). public class can be accessed
//....within or outside of package but the default class is only accessed
//...within the same package.
public class AccessModifier {
	
	public void publicMethod() {}//everywhere inside/outside packages
	void defaultMethod() {}		// within the same class and same package. 
	//private void privateMethod() {}//within the same class.
	protected void protectedMethod() {}//within the class and its sub-class.
	// same rule of access modifier is used in variables like described in method.
//===========================================================================
	public static void main(String[] args) {
	
	
		
	}

}
