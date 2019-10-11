public class DeadlyProductFactory implements ProductFactory {

	public Product createProduct(String context) {
		return createDeadlyProduct(context);
	}
	
	private Product createDeadlyProduct(String context) {
		switch(context) {
		case "A":
			return new DeadlyProductA();
		case "B":
			return new DeadlyProductB();
		case "C":
			return new DeadlyProductC();
		}
		return null;
	};

}
