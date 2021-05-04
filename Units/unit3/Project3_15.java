//*******************************************************************
//  Project: Project 3.15
//  Author: Andres Chaidez
//  Period: 5
//  Date: 10/17/18
//  Description: Design and implement an application that simulates a simple slot machine in which three numbers between 0 and 9 are randomly selected and printed side by side. 
//  .    Print a statement saying all three of the numbers are the same, or any two of the numbers are the same, when this happens. 
//  .    Keep playing until the user chooses to stop.
//*******************************************************************

import java.util.Random;
import java.util.Scanner;

public class Project3_15{

   
   public static void main(String[] args){
   
   Scanner scan = new Scanner(System.in);
   
   int n1;
   int n2;
   int n3;
   boolean isplaying = true;
   String input;
   String choice;
   
   while (isplaying) {
   
      n1 = (int)(Math.random()*10);
      n2 = (int)(Math.random()*10);
      n3 = (int)(Math.random()*10);
      System.out.println(n1 +" "+ n2 +" "+ n3);
      
      if((n1==n2)&&(n2==n3)) System.out.println("All the are the same! Nice!");
      else if ((n1==n2)||(n1==n3)||(n2==n3)) System.out.println("Two of em are the same");
      else System.out.println("None of em are the same, tough luck");
      
      System.out.println("Care ta try yer luck again, bucko?(Y/N)");
      input = scan.nextLine();
      choice = input.toLowerCase();
      if (choice.equals("y")) isplaying = true;
      else if (choice.equals("n")) {
         System.out.println("Have a mighty nice day and thank you for playing!");
         isplaying = false;
      }
      else System.out.println("I'll, um, take that as a no");
   }
      
   }
}