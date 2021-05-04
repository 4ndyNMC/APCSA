import java.util.Scanner;

public class Project6_2 {

   public static void main(String[] args) {
   
      Scanner scan = new Scanner(System.in);
      
      int input;
      int range = -25;
      int[] inputted = new int[51];
      int[] count = new int[51];
      boolean isinputting = true;
      
      for (int i = 0; i <= 50; i++) {
         inputted[i] = range;
         count[i] = 0;
         range++;
      } 
      
      System.out.println("Give me a set of numbers, preferably from -25 - 25, and type -26 when you're done"); 
      
      while (isinputting) {
      
         input = scan.nextInt();
         if (input == -26) isinputting = false;
         else if ((input >= -25) && (input <=25)) count[input+25]++;

      }
      
      for (int i = 0; i <=50; i++) {
         if (count[i] != 0)   System.out.println("You said "+inputted[i]+" this many times: "+count[i]);
      }
   
   }

}