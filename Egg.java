package Assignment_1;

public class Egg extends MarketProduct{
	private int Num_Eggs;
	private int Price_DozenEggs;
	
	public Egg(String name, int number, int price){
		super(name);
		this.Price_DozenEggs = price;
		this.Num_Eggs = number;
		
	}
	public int getCost(){
		double result = this.Price_DozenEggs/12.0*Num_Eggs;
		return (int)result;
	}
	public boolean equals(Object e) {
		if (e instanceof Egg) {
			Egg temp = (Egg) e;
			return(this.getName() == temp.getName() && this.Num_Eggs == temp.Num_Eggs && this.Price_DozenEggs == temp.Price_DozenEggs
					&& this.getCost() == temp.getCost());
		}
		else {
			return false;
		}
	}
}
