
public class Player
{	
	//TODO spawn with a random item
	
	//The player's name
	static String name;
	
	//And their class
	static String plclass;
	
	//For story stuff, insanity will affect what dialogue is displayed
	static int insanity = 0;
	
	//player is alive
	static boolean life = true;
	
	//the player's inventory
	static Inventory inv = new Inventory();
	
	//equipped item
	static Item equipped;
	
	
	//The name of the player is set here
	public static void nameSet()
	{
		name = Scans.readLine();
	}
	
	//The incredibly relevant class of the player is set here
	public static void classSet()
	{
		plclass = Scans.readLine().toLowerCase();
	}
	
	public static void equip()
	{
		System.out.println("What item?");
		System.out.println("Currently in inventory:");
		Inventory.view();
		Item temp = Inventory.equip(Scans.readLine());
		
		if(temp != null)
		{	
			if(equipped != null){
				Inventory.itemList.addLast(equipped);
			}
			
			equipped = temp;
		}
	}
}