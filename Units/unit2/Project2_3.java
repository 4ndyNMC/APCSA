//*******************************************************************
//  Project: The assignment name
//  Author: Andres Chaidez
//  Period: 5
//  Date: Latest 8/31/ 2018
//  Description: Write an application that reads 2 floating point numbers and prints their sum, difference, and product.
//*******************************************************************

import java.util.Scanner;

public class Project2_3{
   
   public void main(String[] args){
      
      System.out.print(fact(5));
      
   }

   public int fact(int n){
      if(n==1){
         return 1;
      }else{
         n--;
         return fact(n);
      }
   }
}