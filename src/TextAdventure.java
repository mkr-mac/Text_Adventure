
public class TextAdventure {
	
	//It all starts here!
	public static void main(String args[]){
		
		//Enter into the first room
		//also starts the character naming and class selection
		Room.enter();
		
		//keep loading inputs so long as the player is alive
		while(Player.life){
			ProcessInput.input();
		}
		//Only you can prevent memory leakage
		Scans.inputer.close();
	}
}
