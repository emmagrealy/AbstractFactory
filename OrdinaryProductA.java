import javax.swing.JOptionPane;

public class OrdinaryProductA implements ProductA {
	
	public void speak() { doYourStuff(); }

	public void doYourStuff(){
		JOptionPane.showMessageDialog(null, "I'm a ProductA, doing my stuff");
	}
}
