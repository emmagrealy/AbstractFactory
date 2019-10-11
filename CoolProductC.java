import javax.swing.JOptionPane;

public class CoolProductC implements ProductC {
	
	public void speak() { perform(); }
	
	public void perform() {
		JOptionPane.showMessageDialog(null, "I'm a cool ProductC, performing coolly");
	}
}
