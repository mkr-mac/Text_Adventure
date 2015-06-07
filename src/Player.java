
public class Player {
	//TODO create a held item field
	//TODO spawn with a random item
	static Item i = new Food();
	//The player's name
	static String name;
	//And it's class
	static String plclass;
	//For story stuff, insanity will affect what dialogue is displayed
	static int insanity = 0;
	//player is not an hero
	static boolean life = true;
	
	//The name of the player in the opening scene is set here
	public static void nameSet(){
		System.out.println("Feeling a bit dazed, You have a hard time recalling your name. What is it?");
		name = Scans.readLine();
		System.out.println("Yeah, your name is " + name + ". How could you forget?");
	}
	//The incredibly relevant class of the player is set here
	public static void classSet(){
		System.out.println("But what were you? After a quick look over yourself you confirm you are human. But what did you do?");
		System.out.println("After you inspect your possesions, you believe you were a:");
		plclass = Scans.readLine().toLowerCase();
		System.out.println("You do some reflecting, and coming up blank, consider " + plclass + " to be close enough.");
	}
}
