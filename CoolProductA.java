import javax.swing.JOptionPane;

public class CoolProductA implements ProductA {

	@Override
	
	public void speak() { doYourStuff(); }
	
	public void doYourStuff() {
		JOptionPane.showMessageDialog(null, "I'm a cool ProductA, doing my stuff coolly");
	}

}
