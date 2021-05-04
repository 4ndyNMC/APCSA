//*******************************************************************
//  Project: Project 4.3
//  Author: Andres Chaidez
//  Period: 5
//  Date: 11/7
//  Description: Write an application that rolls a die and displays the result. 
//  Let the user pick the number of sides on the die. Use the Die class to represent the die in your program.
//*******************************************************************

import java.util.Scanner;

public class Project4_3{ //rolls die
   
   public static void main (String[] args){
      Scanner scan = new Scanner(System.in);
      int input;
      
      System.out.println("How many sides on your die?");
      input = scan.nextInt();
      Die die = new Die(input);
      System.out.println("You rolled " + die.roll());
   }
   
}