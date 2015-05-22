public class TextAdventure {
	static int roomNumber = 0;
	static boolean kill = false;
	private static void TextAdventure() {
		
		roomNumber = Room.enter(roomNumber);
		while(!kill){
			roomNumber = GetInput.input(roomNumber);
		}
	}
	public static void main(String args[]){
		TextAdventure();
	}

}
