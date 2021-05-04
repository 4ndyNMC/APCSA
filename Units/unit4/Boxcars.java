//*******************************************************************
//  Project: Project 4.4
//  Author: Andres Chaidez
//  Period: 5
//  Date: 11/7
//  Description: Design and implement a class called PairOfDice, with two six-sided Die objects. 
//  Create a driver class called BoxCars with a main method that rolls a PairOfDice object 1000 times,
//  counting the number of box cars (two sixes) that occur.
//*******************************************************************

public class Boxcars{
   
   public static void main(String[] args){
      
      PairOfDice pair = new PairOfDice();
      int cars = 0;
      
      for (int i=0;i<=1000;i++) {
         pair.roll();
         if ((pair.return1() == 6)&&(pair.return2() == 6)) cars++;
      }
      System.out.println("You rolled "+cars+" boxcars (double 6s)!");
      
   }
   
}