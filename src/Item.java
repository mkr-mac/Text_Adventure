
public abstract class Item{
	String name;
	public abstract void hit();
	public abstract void eat();
	public void rename(){
		name = Scans.readLine();
	}
}
