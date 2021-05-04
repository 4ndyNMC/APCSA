/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
      String[] ranks={"A","6","Joker"};
      String[] suits={"Diamonds","Clubs","Spades"};
      int[] values={1,6,11};
      Deck deck = new Deck(ranks,suits,values);
      
      //System.out.println(deck.deal());
	}
}
