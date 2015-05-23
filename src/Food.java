
public class Food extends Item{

	public void hit(){
		System.out.println("You hit with your " + name + ".");
		System.out.println("It wasn't very effective...");
	}
	public void eat(){

		System.out.println("You eat your " + name + ".");
		System.out.println("Om nom nom, om nom.");
	}
}
