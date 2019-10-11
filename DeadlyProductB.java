import javax.swing.JOptionPane;

public class DeadlyProductB implements ProductB {

	@Override
	public void speak() { doIt(); }
	
	public void doIt() {
		JOptionPane.showMessageDialog(null, "I'm a deadly ProductB, doing it in a deadly fashion");
	}

}
