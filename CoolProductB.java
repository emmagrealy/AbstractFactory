import javax.swing.JOptionPane;

public class CoolProductB implements ProductB {

	@Override
	public void speak() { doIt(); }
	
	public void doIt() {
		JOptionPane.showMessageDialog(null, "I'm a cool ProductB, doing it coolly");
	}

}
