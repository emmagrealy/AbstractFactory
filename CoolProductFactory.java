public class CoolProductFactory implements ProductFactory {

	public Product createProduct(String context) {
		return createCoolProduct(context);
	}
	
	private Product createCoolProduct(String context) {
		switch(context) {
		case "A":
			return new CoolProductA();
		case "B":
			return new CoolProductB();
		case "C":
			return new CoolProductC();
		}
		return null;
	};

}
