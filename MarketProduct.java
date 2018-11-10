package Assignment_1;

public abstract class MarketProduct {
	private String product_name;
	public MarketProduct(String name) {
		this.product_name = name;
	}
	public final String getName() {
		return this.product_name;
	}
	public abstract int getCost();
	public abstract boolean equals(Object obj);
}
