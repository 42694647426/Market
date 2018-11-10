package Assignment_1;

public class Customer {
	private String cust_name;
	private int cust_balance;
	private Basket cust_basket;
	
	public Customer(String name, int balance) {
		cust_name = name;
		cust_balance = balance;
		cust_basket = new Basket();
	}
	public String getName() {
		return this.cust_name;
	}
	public int getBalance() {
		return this.cust_balance;
	}
	public Basket getBasket() {
		return this.cust_basket;
	}
	public int addFunds(int f) {
		if (f>=0) {
			this.cust_balance += f;
			return f;
		}
		else {
			throw new IllegalArgumentException("Illegal amount added to balance");
		}
	}
	
	public void addToBasket(MarketProduct x) {
		this.cust_basket.add(x);
	}
	
	public boolean removeFromBasket(MarketProduct x) {
		return this.cust_basket.remove(x);
	}
	
	public String checkOut() {
		if (this.cust_balance>=this.cust_basket.getTotalCost()) {
			this.cust_balance -= this.cust_basket.getTotalCost();
			String temp = this.cust_basket.toString();
			this.cust_basket.clear();
			return temp;
		}
		else {
			throw new IllegalStateException("Sorry, you don't have enough balance!");
		}
	}

}