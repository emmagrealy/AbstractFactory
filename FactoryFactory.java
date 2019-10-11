
public class FactoryFactory {
	
	/* We're implementing this as a singleton */
	private static FactoryFactory instance;
	
	private FactoryFactory() {
		
	}
	
	public static FactoryFactory getInstance() {
		if (instance != null)
			return instance;
		else 
			instance = new FactoryFactory();
		return instance;
	}
	
	/* Product Factory is the abstract product - 
	 * the various concrete factories are FactoryFactory's
	 * concrete products.
	 * 
	 */
	public ProductFactory returnFactory(int context) {
		switch (context) {
		case 0: {
			return new UncoolProductFactory();
		}
		case 1: {
			return new CoolProductFactory();
		}
		case 2: {
			return new DeadlyProductFactory();
		}
		default:
			return new UncoolProductFactory();
		}

	}

}
