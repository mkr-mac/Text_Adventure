
public class Player {
	//TODO create a held item field
	//TODO spawn with a random item
	//The player's name
	static String name;
	//And it's class
	static String plclass;
	//For story stuff, insanity will affect what dialogue is displayed
	static int insanity = 0;
	//player is alive
	static boolean life = true;
	//the player's inventory
	static Inventory inv = new Inventory();
	//equipped item
	static Item equipped;
	
	//The name of the player in the opening scene is set here
	public static void nameSet()
	{
		System.out.println("Feeling a bit dazed, You have a hard time recalling your name. What is it?");
		name = Scans.readLine();
		System.out.println("Yeah, your name is " + name + ". How could you forget?");
	}
	//The incredibly relevant class of the player is set here
	public static void classSet()
	{
		System.out.println("But what were you? After a quick look over yourself you confirm you are human. But what did you do?");
		System.out.println("After you inspect your possesions, you believe you were a:");
		plclass = Scans.readLine().toLowerCase();
		System.out.println("You do some reflecting, and coming up blank, consider " + plclass + " to be close enough.");
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