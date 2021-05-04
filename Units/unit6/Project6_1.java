import java.util.Scanner;

public class Project6_1 {

   public static void main(String[] args) {
   
      Scanner scan = new Scanner(System.in);
      
      int input;
      int[] inputted = new int[51];
      int[] count = new int[51];
      boolean isinputting = true;
      
      for (int i = 0; i <= 50; i++) {
         inputted[i] = i;
         count[i] = 0;
      } 
      
      System.out.println("Give me a set of numbers, preferably from 0 - 50, and type -1 when you're done"); 
      
      while (isinputting) {
      
         input = scan.nextInt();
         if (input == -1) isinputting = false;
         else if ((input >= 0) && (input <=50)) count[input]++;
      }
      
      for (int i = 0; i <=50; i++) {
         if (count[i] != 0)   System.out.println("You said "+inputted[i]+" this many times: "+count[i]);
      }
   
   }

}