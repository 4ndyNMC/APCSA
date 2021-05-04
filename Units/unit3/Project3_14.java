//*******************************************************************
//  Project: Project 3.14
//  Author: Andres Chaidez
//  Period: 5
//  Date: 10/17/18
//  Description: Design and implement an application that plays the rock-paper-scissors game against the computer. 
//  .    When played between two people, each person picks one of three options (usually shown by a hand gesture) at the same time, and a winner is determined. 
//  .    In the game, rock beats scissors, scissors beats paper, and paper beats rock. The program should randomly choose one of the three options (without revealing it), 
//  .    then ask for the user’s selection. At that point, the program reveals both choices and prints a statement indicating that the user won, that the computer won, 
//  .    or that it was a tie. Keep playing until the user chooses to stop, then print the number of user wins, losses, and ties.
//*******************************************************************

import java.util.Random;
import java.util.Scanner;

public class Project3_14{

   public static void main(String[] args){
   
      Scanner scan = new Scanner(System.in);
      
      String r = "rock";
      String p = "paper";
      String s = "scissors";
      String choice;
      String inpoot;
      String input;
      String keepplaying;
      double number = Math.random()*3;
      int selection = (int)number;
      int wins = 0;
      int losses = 0;
      int ties = 0;
      boolean playing = true;
      
      System.out.println("Let's play rock paper scissors!");
      
      while (playing){
         if(selection==0) choice = r;
         else if (selection==1) choice = p;
         else choice = s;
         
         inpoot = scan.nextLine();
         input = inpoot.toLowerCase();
         
         //System.out.println(choice + "" + input);
         
         if (choice.equals(input)){
            System.out.println("Tie! You picked " + input + " and I picked " + choice);
            ties++;
         }
         else if (input.equals(r)) {
            if (choice.equals(s)) {
            System.out.println("You won! You picked rock and I picked " + choice);
            wins++;
            }
            else {
            System.out.println("You lost! You picked rock and I picked " + choice);
            losses++; 
            }
         }
         else if (input.equals(s)) {
            if (choice.equals(p)) {
               System.out.println("You won! You picked scissors and I picked " + choice);
               wins++;
            } 
            else {
               System.out.println("You lost! You picked scissors and I picked " + choice);
               losses++;
            }
         } 
         else if (input.equals(p)) {
            if(choice.equals(r)) {
               System.out.println("You won! You picked paper and I picked " + choice);
               wins++;
            } 
            else {
               System.out.println("You lost! You picked paper and I picked " + choice);
               losses++;
            }
         }
         else System.out.println("If you wanna play, you gotta pick rock, paper, or scissors.");
         
         System.out.println("Wanna keep playing? (Y/N)");
         input = scan.nextLine();
         keepplaying = input.toLowerCase();
         if(keepplaying.equals("y")) {
            System.out.println("okay");
            number = Math.random()*3;
            selection = (int)number;
         } 
         else if (!keepplaying.equals("n")) {
            playing = false;
            System.out.println("I'll take that as a no");
         } 
         else {
           playing = false;
           System.out.println("Wins : " + wins + ", Losses : " + losses + ", Ties : " + ties);
           System.out.println("Thanks for playing");
         }
      }
   }
}