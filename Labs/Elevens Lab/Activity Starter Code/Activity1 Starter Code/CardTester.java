/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
      Card card1=new Card();
      Card card2=new Card("9","Clubs",9);
      Card card3=new Card("Joker","Diamonds",11);
      
      System.out.println(card1);
      System.out.println(card2);
      System.out.println(card3);
      System.out.println(card1.pointValue()+card2.pointValue()+card3.pointValue());
      System.out.println(card1.matches(card1));
	}
}
