public class TextAdventure {
	static int roomNumber = 0;
	static boolean kill = false;
	private static void TextAdventure() {
		
		Room.enter();
		while(!kill){
			GetInput.input();
		}
	}
	public static void main(String args[]){
		TextAdventure();
	}

}
