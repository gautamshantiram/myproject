package MyBest;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Swing extends JOptionPane{
	
	
	public static void main (String [] args) {
	
		String emp = JOptionPane.showInputDialog("Enter Employee Name : ");
		String id = JOptionPane.showInputDialog("Enter Employee ID : ");
		String age = JOptionPane.showInputDialog("Enter Employee Age: ");
		//............................................................
		JOptionPane.showMessageDialog(null, "Employee : "+emp+"|| Age : "+age+" ||ID : "+id);
		System.out.println(emp+"//" +id+"//"+age);
	}

}
