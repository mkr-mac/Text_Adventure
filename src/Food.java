
public class Food extends Item{
	enum foodType{
		Ham,
		Cheese,
		Burger,
		Apricot
	}
	foodType type;
	public Food(foodType type){
		name = type.toString();
		damage = 3;
		curePower = 50;
	}
	public void hit(){
		
		//food is a bad weapon
		System.out.println("You hit with your " + name + ".");
		System.out.println("It wasn't very effective...");
		Player.equipped = null;
	}
	public void eat(){
		if(Player.equipped != null){
			
			//Food is good to eat
			System.out.println("You eat your " + name + ".");
			System.out.println("Om nom nom, om nom.");
			
			//Get the eaten food out of the player's possession
			Player.equipped = null;
		}
	}
}
