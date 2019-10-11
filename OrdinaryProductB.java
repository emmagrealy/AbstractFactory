import javax.swing.JOptionPane;

public class OrdinaryProductB implements ProductB {

	public void speak() { doIt(); }

	public void doIt(){
		JOptionPane.showMessageDialog(null, "I'm a ProductB, doing it");
	}
}

