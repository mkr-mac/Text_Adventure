
import java.util.Scanner;


public class Scans
{	
	//We start up a scanner to get inputs
	static Scanner inputer = new Scanner(System.in);
	
	public static String readLine()
	{		
		//Empty string, because we don't want nothing to count as an input
		String input = "";
		
		//Keep trying until something is input
		while(input.equals(""))
		{			
			//get that input!
			input = inputer.nextLine();
		}
		
		//Send the input string back to whoever wanted it
		return input;
	}
}
