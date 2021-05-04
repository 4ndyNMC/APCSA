public class PairOfDice{

   private Die die1;
   private Die die2;

   
   public  PairOfDice(){
      die1 = new Die();
      die2 = new Die();
   }
   public PairOfDice(int numSides1, int numSides2){
      die1 = new Die(numSides1);
      die2 = new Die(numSides2);
   }
   
   public int roll() {
      return (die1.roll() + die2.roll());
   }
   public int roll1() {
      return die1.roll();
   }
   public int roll2() {
      return die2.roll();
   }
   public int return1() {
      return die1.getFaceValue();
   }
   public int return2() {
      return die2.getFaceValue();
   }
}
