package Assignment_1;

public class Fruit extends MarketProduct {
	private double fruit_weight;
	private int fruit_price;
	
	public Fruit(String name, double weight, int price) {
		super(name);
		this.fruit_price = price;
		this.fruit_weight = weight;
	}
	public int getCost() {
		double result = this.fruit_weight*this.fruit_price;// in cents??
		int result1 = (int) result;
		return result1;
	}
	public boolean equals(Object f) {
		if (f instanceof Fruit) {
			Fruit temp = (Fruit) f;
			return(this.getName() == temp.getName() && this.fruit_weight == temp.fruit_weight && this.fruit_weight == temp.fruit_weight
					&& this.getCost() == temp.getCost());
		}
		else {
			return false;
		}
	}
}

