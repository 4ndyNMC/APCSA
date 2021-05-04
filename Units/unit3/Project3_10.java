//*******************************************************************
//  Project: Project 3.10
//  Author: Andres Chaidez
//  Period: 5
//  Date: 10/17/18
//  Description: Design and implement an application that plays the Hi-Lo guessing game with numbers. 
//  .    The program should pick a random number between 1 and 100 (inclusive), then keep asking the user to guess the number.
//  .    On each guess, report to the user that he or she is correct or that the guess is high or low.
//  .    Keep accepting guesses until the user guesses correctly or quits. 
//  .    Use a sentinel value to determine whether the user wants to quit. 
//  .    Count the number of guesses and report that value when the user guesses correctly. 
//  .    At the end of each game (by quitting or a correct guess), ask whether the user wants to play again. Keep playing games until the user chooses to stop.
//*******************************************************************

import java.util.Random;
import java.util.Scanner;

public class Project3_10{

   public static void main(String[] args){
      
      Scanner scan = new Scanner(System.in);
      
      double x = Math.random()*100;
      int number = (int)x;
      int guess = -1;
      int tries = 0;
      String input;
      String keepplaying;
      System.out.println("Try and guess the number with feedback telling you if it's too high or low.");
      System.out.println("If you guess correctly, the program will end, if you give up like a total lameoid, just type \"0\"");
      
      while(guess!=number){
         //System.out.println(number);
         input = scan.nextLine();
         guess = Integer.valueOf(input);
         tries++;
         
         if (guess==0){ //0 is the sentinal value
         guess=number;
         System.out.println("The number was "+number+", I'm sure you would've gotten there if you tried a little more than "+(tries-1)+" guesses");
         System.out.println("Wanna try again? (Y/N)");
         input = scan.nextLine();
         keepplaying = input.toLowerCase();
            if(keepplaying.equals("y")){
               x = Math.random()*100;
               number = (int)x;
               guess = -1;
               input = "";
               tries = 0;
               System.out.println("let's play again");
            } 
            else if (!(keepplaying.equals("n"))) System.out.println(/*"I'll..um...take that as a no"*/ keepplaying);
            else System.out.println("Thanks for playing!");
         }
         else if (guess==number){
            System.out.println("Nice job, you guessed the correct number, "+guess+" and it took you "+tries+" tries.");
            System.out.println("Would you like to play again? (Y/N)");
            input = scan.nextLine();
            keepplaying = input.toLowerCase();
            if(keepplaying.equals("y")){
               x = Math.random()*100;
               number = (int)x;
               guess = -1;
               input = "";
               tries = 0;
               System.out.println("let's play again");
            } 
            else if (!(keepplaying.equals("n"))) System.out.println("I'll..um...take that as a no");
            else System.out.println("Thanks for playing!");
         }
         else if (guess>number){
            System.out.println("Your guess is too high");
         }
         else System.out.println("Your guess is too low");
      }
   }

}