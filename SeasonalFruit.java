package Assignment_1;

public class SeasonalFruit extends Fruit {
	public SeasonalFruit(String name, double weight, int price) {
		super(name, weight, price);
	}
	public int getCost() {
		double result = 0.85*super.getCost();
		return (int)result; 
	}
}
