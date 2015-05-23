public class TextAdventure {

	public static void main(String args[]){
		Room.enter();
		while(!Player.kill){
			GetInput.input();
		}
		Scans.inputer.close();
	}

}
