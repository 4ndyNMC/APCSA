//*******************************************************************
//  Project: The assignment name
//  Author: Andres Chaidez
//  Period: 5
//  Date: 8/31/2018
//  Description: Write an application that determines the value of the coins in a jar and prints the total in dollars and cents.
//               Read integer values that represent the number of quarters, dimes, nickles, and pennies. Use currency formatter.
//*******************************************************************

import java.util.Scanner;
public class Project2_12{

   public static void main(String[] args){
      
      Scanner scan = new Scanner(System.in);
      
      float qtrs;
      float dime;
      float nkls;
      float pnys;
      double total;
      
      System.out.println("How many Quarters do you have?");
      qtrs = scan.nextFloat();
      System.out.println("How many Dimes do you have?");
      dime = scan.nextFloat();
      System.out.println("How many Nickles do you have?");
      nkls = scan.nextFloat();
      System.out.println("How many Pennies do you have?");
      pnys = scan.nextFloat();
      
      total = ((qtrs*.25)+(dime*.10)+(nkls*.05)+(pnys*.01));
      
      System.out.println("Your total is: $"+total);

      scan.close();
   }  
   
}