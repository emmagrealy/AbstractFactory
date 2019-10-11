import javax.swing.JOptionPane;

public class DeadlyProductA implements ProductA {

	@Override
	
	public void speak() { doYourStuff(); }
	
	public void doYourStuff() {
		JOptionPane.showMessageDialog(null, "I'm a deadly ProductA, doing my stuff in a deadly fashion");
	}

}
