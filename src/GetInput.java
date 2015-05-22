import java.util.Scanner;


public class GetInput {
	public static void input() {
		Scanner inputer = new Scanner(System.in);
		String userinput;
		userinput = inputer.nextLine();
		userinput = userinput.toLowerCase();
		
		if(userinput.equals("help")){
			
			System.out.println("Look - Observe the room around you.");
			System.out.println("Move/Go - Move in a direction.");
			System.out.println("Kill Self/Suicide - End it all");
			
		}else if(userinput.equals("move")){
			
			System.out.println("You move, but not in any paticular direction.");
			
		}else if(userinput.equals("go")){
			
			System.out.println("Go where?");
			
		}else if((userinput.equals("move north"))||(userinput.equals("move forward"))||(userinput.equals("go north"))||(userinput.equals("go forward"))){
			
			Room.enter();
			
		}else if(userinput.equals("look")){
			
			Room.description();
			
		}else if((userinput.equals("suicide"))||(userinput.equals("kill self"))){
			TextAdventure.kill = true;
			
		}else{
			
			System.out.println("invalid");
			
		}
		
	}

}
