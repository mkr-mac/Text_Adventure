public class Player {
	//TODO create a held item field
	//TODO spawn with a random item
	//Item i = new food();
	//add commands to eat/rename
	static String name;
	static String plclass;
	static boolean kill = false;
	public static void nameSet(){
		System.out.println("Feeling a bit dazed, You have a hard time recalling your name. What is it?");
		name = Scans.readLine();
		System.out.println("Yeah, your name is " + name + ". How could you forget?");
	}
	public static void classSet(){
		System.out.println("But what were you? After a quick look over yourself you confirm you are human. But what did you do?");
		System.out.println("After you inspect your possesions, you believe you were a:");
		plclass = Scans.readLine().toLowerCase();
		System.out.println("You do some reflecting, and coming up blank, consider " + plclass + " to be close enough.");
	}
}
