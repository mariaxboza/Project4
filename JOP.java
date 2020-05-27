package sweeper;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JOP { // Class to use JOption pane

	public JOP() {} // Constuctor for the class
	
	public void msg(String msg, String title) { // Method to print out a message with a specific title on the window
		JOptionPane.showMessageDialog(null, msg, title, JOptionPane.PLAIN_MESSAGE);
	}
	
	public void msg(String msg, String title, ImageIcon icon) { 
		// Method to print out a message with a specific title on the window and show an icon
		JOptionPane.showMessageDialog(null, msg, title, JOptionPane.PLAIN_MESSAGE, icon);
	}
	
	public String in(String msg) { // Method to print out a message and get an input
		return JOptionPane.showInputDialog(null, msg, null, JOptionPane.PLAIN_MESSAGE);
	}
	
	public int option(ImageIcon[] options, String msg, String title, ImageIcon icon) {
		// Method to print out options for the user to choose and a title as well as an icon
		return JOptionPane.showOptionDialog(null, msg, title, 
				JOptionPane.PLAIN_MESSAGE, 
				JOptionPane.PLAIN_MESSAGE, icon, 
				options, options[0]);
	}
	
	public int option(String[] options, String msg) { // Method to print out options for the user to choose
		return JOptionPane.showOptionDialog(
				null, 
				msg, // my message
                "Click a button", // dialog box title
                JOptionPane.PLAIN_MESSAGE, 
                JOptionPane.PLAIN_MESSAGE, 
                null, 
                options, // possible options
                options[0]); // default option
	}
	
	public int option(String[] options, String msg, ImageIcon icon) {
		// Method to print out options for the user to choose with an icon
		return JOptionPane.showOptionDialog(
				null, 
				msg, // my message
                "Click a button", // dialog box title
                JOptionPane.PLAIN_MESSAGE, 
                JOptionPane.PLAIN_MESSAGE, 
                icon, 
                options, // possible options
                options[0]); // default option
	}
	public int option(String[] options, String msg, String title) { 
		// Method to print out options for the user to choose with a title
		return JOptionPane.showOptionDialog(
				null, 
				msg, // my message
                title, // dialog box title
                JOptionPane.PLAIN_MESSAGE, 
                JOptionPane.PLAIN_MESSAGE, 
                null, 
                options, // possible options
                options[0]); // default option
	}
	
	public int option(String[] options, String msg, String title, ImageIcon icon) {
		// Method to print out options for the user to choose and a title as well as an icon
		return JOptionPane.showOptionDialog(
				null, 
				msg, // my message
                title, // dialog box title
                JOptionPane.PLAIN_MESSAGE, 
                JOptionPane.PLAIN_MESSAGE, 
                icon, 
                options, // possible options
                options[0]); // default option
	}
	
	public void println(String msg) { // Method to print out a message
		System.out.println(msg);
	}
	
	public void print(String msg) { // Method to pring out a message with out a line
		System.out.print(msg);
	}
	
	public void msg(Object msg) { // Method to print out an Object
		JOptionPane.showMessageDialog(null, msg, null, JOptionPane.PLAIN_MESSAGE);
	}
	
	public String in(Object msg) { // Method to print out an Objext and get an input
		return JOptionPane.showInputDialog(msg, JOptionPane.PLAIN_MESSAGE);
	}
	
	public int option(Object[] options, Object msg) { // Method to have objects as options 
		return JOptionPane.showOptionDialog(
				null, 
				msg, // my message
                "Click a button", // dialog box title
                JOptionPane.PLAIN_MESSAGE, 
                JOptionPane.PLAIN_MESSAGE, 
                null, 
                options, // possible options
                options[0]); // default option
	}
	
	public String in(String msg, String title, ImageIcon icon) { // Method to get an input with a message title and icon
		return JOptionPane.showInputDialog(null, msg, title, JOptionPane.PLAIN_MESSAGE);
	}
}
