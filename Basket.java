package Assignment_1;

public class Basket {
	private MarketProduct[] basket;
	public Basket(){
		this.basket = new MarketProduct[0];
	}
	public MarketProduct[] getProducts() { 
		MarketProduct[] copy = new MarketProduct[this.basket.length];
		for (int i=0; i<copy.length;i++) {
			copy[i]=this.basket[i];
		}
		return copy;
	}
	
	public void add(MarketProduct x) {
		MarketProduct[] temp = new MarketProduct[this.basket.length+1];
		for(int i=0; i<this.basket.length; i++) {
			temp[i] = this.basket[i];
		}
		temp[this.basket.length] = x;
		this.basket = temp;
	}
	
	public boolean remove(MarketProduct x) {
		int len = this.basket.length;
		for (int i=0; i<len; i++) {
			if (x.equals(this.basket[i])) {
				MarketProduct[] temp = new MarketProduct[len - 1];
				for(int j = 0; j<i;j++) {
					temp[j]=this.basket[j];
					}
				for(int k = i; k<len-1; k++) {
						temp[k] = this.basket[k+1];
					}
			this.basket = temp;
			return true; 
					}

		}
	return false;
	}
	
	public void clear() {
		MarketProduct[] empty = new MarketProduct[0];
		this.basket = empty;
	}
	
	public int getNumOfProducts() {
		int count = 0;
		for(int i=0; i<this.basket.length; i++) {
			count ++;
		}
		return count;
	}
	
	public int getSubTotal() {
		int cost = 0;
		for (int i=0; i<this.basket.length; i++) {
			cost += this.basket[i].getCost();
		}
		return cost;
	}
	
	public int getTotalTax() {
		double temp =0;
		for (int i=0; i<this.basket.length; i++) {
			if(this.basket[i] instanceof Jam) {
				double x = this.basket[i].getCost()*0.15;
				temp += x;
			}
		}
		int result = (int) temp;
		return result;
	}
	
	public int getTotalCost() {
		int result = this.getSubTotal() + this.getTotalTax();
		return result;
	}
	
	private String converter(int i) { 
		if (i>=0) {
		double x = (double) i/100;
		return String.format("%.2f", x);
		}
		else {
		return "--";
		}
	}
	
	public String toString() {
		String result = "";
		for(int i=0; i<this.basket.length; i++) {
			String str = this.basket[i].getName() + "\t" + this.converter(this.basket[i].getCost()) + "\n";
			result = result + str;
		}
		String cost = "\n" + "Subtotal" + "\t" + this.converter(this.getSubTotal()) + "\n" + "Total Tax" + "\t" + this.converter(getTotalTax()) + "\n\n" + "Total Cost" + "\t" + this.converter(this.getTotalCost());
		String output  = result +cost;
		return output;
	}
	
}
