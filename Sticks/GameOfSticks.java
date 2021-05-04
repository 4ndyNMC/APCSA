import java.util.Scanner;

public class GameOfSticks{

   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int numSticks=0;
      int currentPlayer=1;
      int takeSticks=0;
      boolean player2AI = true;
      SticksAI ai;// = new SticksAI();
      
      System.out.println("Welcome to the Game of Sticks");
      System.out.print("How many sticks are there on the table originally (10-100)?");
      numSticks=scan.nextInt();
      ai = new SticksAI(numSticks);
      while(numSticks<10 || numSticks>100){
         System.out.println("Please enter a number between 10 and 100");
         System.out.print("How many sticks are there on the table originally (10-100)?");
         numSticks=scan.nextInt();
      }
      
      while(numSticks>0){
         System.out.println("There are " + numSticks+ " sticks on the table");
         for (int i=0;i<numSticks;i++){
            System.out.print("| ");
         }   System.out.println();
         
         
         if(!player2AI || currentPlayer ==1){
            System.out.print("Player " + currentPlayer + ": How many sticks do you take (1-3)?");
            takeSticks=scan.nextInt();
            while(takeSticks<1 || takeSticks>3){
               System.out.println("Please enter a number between 1 and 3");
               System.out.print("Player " + currentPlayer + ": How many sticks do you take (1-3)?");
               takeSticks=scan.nextInt();
            }
         }
         else{
            takeSticks=ai.getTurn();
         }
         
         numSticks-=takeSticks;
         if(numSticks <=0){
            System.out.println("Player " + currentPlayer + ", you lose.");
         }
         else{
            currentPlayer++;
            if(currentPlayer==3) currentPlayer=1;
         }
      }
      
   }

}