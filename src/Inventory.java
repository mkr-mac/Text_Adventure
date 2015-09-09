import java.util.LinkedList;


public class Inventory {
	static LinkedList<Item> itemList;
	public Inventory(){
		itemList = new LinkedList<Item>();
	}
	public static void view(){
		for(Item i : itemList){
			System.out.println(i.name);
		}
	}
	public static void add(Item item){
		itemList.addLast(item);
	}
	public static Item equip(String item){
		Item temp = null;
		for(Item i : itemList){
			if(i.name.equals(item)){
				System.out.println("You have equipped your " + i.name + ".");
				temp = i;
				break;
			}
		}
		if(temp == null){
			System.out.println("You don't have a " + item + ".");
			return null;
		}
		itemList.remove(temp);
		return temp;
	}
}
