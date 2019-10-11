import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class Client extends JFrame{

	private String[] productNames = {"A", "B", "C"};
	private String[] productCategories = {"Ordinary", "Cool", "Deadly"};

	private JComboBox<String> nameComboBox = new JComboBox<String>(productNames);
	private JComboBox<String> categoryComboBox = new JComboBox<String>(productCategories);

	private JLabel categoryLabel = new JLabel("Choose a category: ");
	private JLabel productLabel = new JLabel("Choose a product: ");

	private JButton createButton = new JButton("Create!");

	private JPanel comboBoxPanel, buttonPanel;

	Scanner sc;

	public Client(){
		super("Using Abstract Factory");
		initComponents();
	}

	public void initComponents(){

		Container cont = getContentPane();

		cont.setLayout(new BorderLayout());

		comboBoxPanel = new JPanel(new GridLayout(2, 2));

		comboBoxPanel.add(categoryLabel);
		comboBoxPanel.add(categoryComboBox);
		comboBoxPanel.add(productLabel);
		comboBoxPanel.add(nameComboBox);

		cont.add(comboBoxPanel, BorderLayout.NORTH);

		buttonPanel = new JPanel();
		buttonPanel.add(createButton);

		cont.add(buttonPanel, BorderLayout.CENTER);

		createButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				int category = categoryComboBox.getSelectedIndex();
				String productName = (String)nameComboBox.getSelectedItem();

				ProductFactory pf;

				/* Extra level of indirection - a factory which given a 
				 * value decides which ProductFactory to use - type not being
				 * explicitly stated here.
				 * 
				 * Also a singleton.
				 * 
				 * Isn't any inheritance from FactoryFactory but it's playing the
				 * role of both abstract and concrete factory.
				 * 
				 */
				FactoryFactory ff = FactoryFactory.getInstance();
				
				/* Get the appropriate product factory based on category entered */
				pf = ff.returnFactory(category);
				
				Product createdProduct;
				
				switch (productName) {
				case "A": {
					createdProduct = pf.createProduct("A");
					break;
				}
				case "B": {
					createdProduct = pf.createProduct("B");
					break;	
				}
				case "C": {
					createdProduct = pf.createProduct("C");
					break;	
				}
				default:
					createdProduct = pf.createProduct("A");
				}
				
				createdProduct.speak();

			}

		});

	}

	public static void main(String[] args) {
		Client c = new Client();
		c.setSize(400, 150);
		c.setVisible(true);

	}
}