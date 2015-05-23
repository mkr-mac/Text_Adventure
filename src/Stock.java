
public class Stock {
	static double price;
	String owner;
	public Stock(String owner){
		this.owner = owner;
	}
	public void steal(){
		owner = "Mickey";
	}
}
