package Assignment_1;

public class Jam extends MarketProduct {
	private int Num_jar;
	private int Price_jar;
	public Jam(String name, int number, int price) {
		super(name);
		this.Num_jar = number;
		this.Price_jar = price;
	}
	public int getCost() {
		return this.Num_jar*this.Price_jar;
	}
	public boolean equals(Object j) {	
		if (j instanceof Jam) {
		Jam temp = (Jam) j;
		return(this.getName() == temp.getName() && this.Num_jar == temp.Num_jar && this.Price_jar == temp.Price_jar);
	}
	else {
		return false;
	}
	}
}
