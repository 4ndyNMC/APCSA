//*******************************************************************
//  Project: Project 4.5
//  Author: Andres Chaidez
//  Period: 5
//  Date: 11/7
//  Description: Using the PairOfDice class from Programming Project 4.4, design and implement a class to play a game called Pig. 
//  In this game, the user competes against the computer. On each turn, the player rolls a pair of dice and adds up his or her points. 
//  Whoever reaches 100 points first, wins. If a player rolls a 1, he or she loses all points for that round and the dice go to the other player. 
//  If a player rolls two 1s in one turn, the player loses all points earned so far in the game and loses control of the dice. 
//  The player may voluntarily turn over the dice after each roll. So the player must decide to either roll again (be a pig) and risk losing points,
//  or give up the dice, possibly letting the other player win. Set up the computer player so that it always give up the dice after getting 20 or more points in a round.
//*******************************************************************

import java.util.Scanner;

public class Project4_5 {

   public static void main(String[] args) {
      
      int pPtsGained = 0;
      int cPtsGained = 0;
      int pPtsTotal = 0;
      int cPtsTotal = 0;
      boolean gameOn = true;
      boolean cTurn = false;
      String input;
      String pResponse;
      Scanner scan = new Scanner(System.in);
      PairOfDice pDie = new PairOfDice();
      PairOfDice cDie = new PairOfDice();
      
      while (gameOn) {
      
         while (cTurn==false) {
            pDie.roll();
            System.out.println("You rolled a "+pDie.return1()+" and a "+pDie.return2());
            if ((pDie.return1()==1)&&(pDie.return2()==1)) {
               System.out.println("Double 1s! Now you have no points and it's computer's turn.");
               pPtsTotal = 0;
               cTurn = true;
            }
            else if ((pDie.return1()==1)||(pDie.return2()==1)) {
               System.out.println("Rolled a 1! You've lost the points you earned this turn and it's computer's turn.");
               pPtsGained = 0;
               cTurn = true;
            }
            else {
               pPtsGained = pPtsGained + (pDie.return1()+pDie.return2());
               System.out.println("You have "+pPtsGained+" points ready to cash in");
               System.out.println("Y for roll again, N for pass dice");
               input = scan.nextLine();
               pResponse = input.toLowerCase();
               if (pResponse.equals("y")) cTurn = false;
               else {
                  pPtsTotal = pPtsTotal + pPtsGained;
                  cTurn = true;
               }
            }
         }
         
         /*else*/ if (pPtsTotal>=100) {
            System.out.println("You won! You got more than 100 points before the computer did. Good game!");
            gameOn = false;
         }
         else gameOn = true;

         while (cTurn==true) {
            cDie.roll();
            System.out.println(cDie.return1() + " " + cDie.return2());
            if ((cDie.return1()==1)&&(cDie.return2()==1)) {
               System.out.println("Computer rolled double 1s! Now it has no points and it's your turn");
               cPtsTotal = 0;
               cTurn = false;
            }
            else if ((cDie.return1()==1)||(cDie.return2()==1)) {
               System.out.println("Computer rolled a 1, it gets no points this turn and it's your turn now");
               cPtsGained = 0;
               cTurn = false;
            }
            else {
               cPtsGained = cPtsGained + (cDie.return1()+cDie.return2());
            }
            if (cPtsGained>=20) {
            cTurn = false;
            }
         }
         cPtsTotal = cPtsTotal + cPtsGained;
         System.out.println("Computer gained a total of "+cPtsGained+" points and now has a total of "+cPtsTotal);
         cPtsGained = 0;
         pPtsGained = 0;
         if (cPtsTotal>=100) {
            System.out.println("Computer won! It got more than 100 points before you. Good game!");
            gameOn = false;
         }
         else if (pPtsTotal>=100) {
            System.out.println("You won! You got more than 100 points before the computer did. Good game!");
            gameOn = false;
         }
         else gameOn = true;
         System.out.println("\n" + pPtsTotal + " " + cPtsTotal + "\n");
         
      }
   }
}