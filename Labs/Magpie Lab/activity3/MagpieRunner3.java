import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner3
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		MagpieFinal maggie = new MagpieFinal();
      
		System.out.println (maggie.getGreeting());
      Scanner nombre = new Scanner (System.in);
      String name = nombre.nextLine();
      System.out.println("Hello, " + name + ", let's talk");
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
      String bye = "Bye";
      String end = bye.toLowerCase();
      
		while (!statement.equals(end))
		{
			System.out.println (maggie.getResponse(statement,name/*,shant,pope*/));
			statement = in.nextLine();
		}
	}

}