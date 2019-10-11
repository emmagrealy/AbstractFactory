import javax.swing.JOptionPane;

public class OrdinaryProductC implements ProductC {
	
	public void speak() { perform(); }

	public void perform(){
		JOptionPane.showMessageDialog(null, "I'm a ProductC, performing");
	}
}