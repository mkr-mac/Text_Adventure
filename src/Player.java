import java.util.Scanner;


public class Player {
	public static void nameSet(){
		Scanner inputer = new Scanner(System.in);
		String plname;
		System.out.println("Feeling a bit dazed, You have a hard time recalling your name. What is it?");
		plname = inputer.nextLine();
		System.out.println("Yeah, your name is " + plname + ". How could you forget?");
	}
	public static void classSet(){
		Scanner inputer = new Scanner(System.in);
		String plclass;
		System.out.println("But what were you? After a quick look over yourself you confirm you are human. But what did you do?");
		System.out.println("After you inspect your possesions, you believe you were a:");
		plclass = inputer.nextLine().toLowerCase();
		System.out.println("You do some reflecting, and coming up blank, consider " + plclass + " to be close enough.");
	}
}
