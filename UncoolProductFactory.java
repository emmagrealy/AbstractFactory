public class UncoolProductFactory implements ProductFactory {

	public Product createProduct(String context) {
		switch(context) {
		case "A":
			return new OrdinaryProductA();
		case "B":
			return new OrdinaryProductB();
		case "C":
			return new OrdinaryProductC();
		}
		return null;
	};


}
