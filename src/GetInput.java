public class GetInput {
	public static void input() {
		String userinput = Scans.readLine().toLowerCase();
		switch(userinput){
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
			
		case "look":
			
			Room.description();			
			break;
			
		case "suicide": case "kill self":
			
			Player.kill = true;			
			break;
			
		default:
			
			System.out.println("");			
			break;
			
		}
		
	}

}
