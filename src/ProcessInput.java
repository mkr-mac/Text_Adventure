
public class ProcessInput {
	public static void input() {
		
		//Get the user input
		//Make it lower case
		//then break it up for processing
		String[] userinput = Scans.readLine().toLowerCase().split(" ", 0);
		
		for(int i=0; i < userinput.length; i++){

			switch(userinput[i]){
			
			case "help":
				System.out.println("Look - Observe the room around you.");
				System.out.println("Move/Go - Move in a direction.");
				System.out.println("Kill Self/Suicide - End it all");			
				break;
				
			case "move":
				System.out.println("You move, but not in any paticular direction.");			
				break;
				
			case "go":
				System.out.println("Go where?");			
				break;
				
			case "move north": case"move forward":case "go north":case "go forward":
				Room.enter();			
				break;
				
			case "item":
				System.out.println(Player.i.name);			
				break;
				
			case "eat":
				Player.i.eat();			
				break;
				
			case "rename":
				Player.i.rename();			
				break;
				
			case "look":
				Room.description();			
				break;
				
			case "suicide": case "kill self":
				//Kills self, ends game loop
				Player.life = false;			
				break;
				
			default:
				System.out.println("You are unsure of what you mean by that.");			
				break;
				
			}
		}
	}
}
