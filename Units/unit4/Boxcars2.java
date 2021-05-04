//*******************************************************************
//  Project: Boxcars2
//  Author: Andres Chaidez
//  Period: 5
//  Date: 11/7
//  Description: Create a new application called Boxcars2 that is a modification of Boxcars from exercise 4.4. The new application will:
//  .Create a PairOfDice object that includes a 6 sided Die and a 10 sided Die
//  .After each initial roll of the PairOfDice, re-roll either Die if it not a 6.
//  Count a boxcar for any roll of 2 sixes after the re-rolls
//  Report the number of boxcars after 1000 initial rolls
//*******************************************************************

public class Boxcars2 {
   
   public static void main (String[] args) {
   
      PairOfDice dice = new PairOfDice(6,10);
      int cars = 0;
      int rolls = 0;
      boolean rolling = true;
      
      while (rolling==true) {
         dice.roll();
         System.out.println(dice.return1() + " " + dice.return2());
         if ((dice.return1() == 6)&&(dice.return2()==6)) cars++;
         if (dice.return1() != 6) dice.roll1();
         if (dice.return2() !=6) dice.roll2();
         rolls++;
         if (rolls>=1000) rolling = false;
      }
      System.out.println("You got "+cars+" boxcars");
   }
}