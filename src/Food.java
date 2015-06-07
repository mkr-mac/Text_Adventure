
public class Food extends Item{

	public void hit(){
		
		//food is a bad weapon
		System.out.println("You hit with your " + name + ".");
		System.out.println("It wasn't very effective...");
	}
	public void eat(){
		if(Player.i != null){
			
			//Food is good to eat
			System.out.println("You eat your " + name + ".");
			System.out.println("Om nom nom, om nom.");
			
			//Get the eaten food out of the player's possession
			Player.i = null;
		}
	}
}
