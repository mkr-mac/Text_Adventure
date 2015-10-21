
public class Weapon extends Item
{
	enum weaponType
	{
		Knife,
		Saw,
		Crowbar,
		Gun
	}
	weaponType type;
	
	public Weapon(weaponType type)
	{
		name = type.toString();
		damage = 50;
		curePower = -50;
	}
	
	public void hit()
	{		
		//weapons are good for attacking
		System.out.println("You hit with your " + name + ".");
		//System.out.println("It wasn't very effective...");
	}
	
	public void eat()
	{
		if(Player.equipped != null)
		{
			//Why did we eat a weapon?
			System.out.println("Agaist your better judgement, you eat your " + name + ".");
			System.out.println("Ouch.");
			
			//Get the eaten food out of the player's possession
			Player.equipped = null;
		}
	}
}