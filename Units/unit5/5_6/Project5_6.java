import java.util.Scanner;

public class Project5_6 {

   public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      Scanner scann = new Scanner(System.in);/////////
      Coin coin = new Coin();
      
      boolean isRunning = true;
      int key;
      int guess;
      String input;
      String answer;
      
      System.out.println("What's gonna be the key?");
      key = scan.nextInt();
      coin.setKey(key);
      
      while (isRunning) {
         
         System.out.println("");
         System.out.println("What would you like to do? (\"flip\", \"look\", \"lock\", \"unlock\", \"end\")");
         
         //input = scan.nextLine();
         input = scann.nextLine();////////////
         answer = input.toLowerCase();
         
         if (answer.equals("flip")) {
            if (coin.locked(coin)) System.out.println("Sorry, you have to unlock it first");
            else  {
            coin.flip();
            System.out.println("Okay, it's flipped");
            }
         }  
         else if (answer.equals("look")){
            if (coin.isHeads()) System.out.println("It's heads");
            else System.out.println("It's tails");
         }
         else if (answer.equals("lock")) {
            System.out.println("What's the key?");
            guess = scan.nextInt();
            if (guess ==  key)   {
               coin.lock(key);
               System.out.println("Okay, it's locked");
            }
            else System.out.println("Sorry, that ain't it");
         }
         else if (answer.equals("unlock")) {
            System.out.println("What's the key?");
            guess = scan.nextInt();
            if (guess ==  key)   {
               coin.unlock(key);
               System.out.println("Okay, it's unlocked");
            }
            else System.out.println("Sorry, that ain't it");
         }
         else if (answer.equals("end")) isRunning = false;
   }
   
   System.out.println("Bye");
}

}