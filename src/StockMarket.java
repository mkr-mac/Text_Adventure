
public class StockMarket {
	Stock c1;
	Stock c2;
	Stock c3;
	public StockMarket(){
		c1 = new Stock("JOE");
		c2 = new Stock("Jimmy");
		c3 = new Stock("Jim");
		
	}
	public void setPrice(){
		Stock.price =  Math.random() * 100;
		
	}
	
	public static void main(String args[]){
		StockMarket NYSE = new StockMarket();
		NYSE.setPrice();
	}
}
