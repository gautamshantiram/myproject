package MyBest;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class SwingDemo extends JOptionPane {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your name: ");
		String age = JOptionPane.showInputDialog("Enter age: ");
				
		//===================================
		JOptionPane.showMessageDialog(null, "Your Name is "+name+" and you are "+age+" years old.");
		
		System.out.println("=============================================");


		System.out.println("Your name : " + name);
		System.out.println("Your  Age : " + age);

	
	}

}
