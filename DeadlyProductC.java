import javax.swing.JOptionPane;

public class DeadlyProductC implements ProductC {
	
	public void speak() { perform(); }
	
	public void perform() {
		JOptionPane.showMessageDialog(null, "I'm a deadly ProductC, performing deadly");
	}
}
