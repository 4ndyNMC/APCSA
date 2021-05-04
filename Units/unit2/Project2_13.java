//*******************************************************************
//  Project: The assignment name
//  Author: Andres Chaidez
//  Period: 5
//  Date: Latest Successful Compile Date
//  Description: Write an application that creates and prints a random phone number (XXX-XXX-XXXX).
//               First 3 digits don't get 8 or 9, second set of digits not greater than 742.
//*******************************************************************

import java.util.Random;

public class Project2_13{

   public static void main(String[] args){
            
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();

      for(int i = 0; i < n; i++){
          System.out.println(scan.nextLine());
      }

  }

}