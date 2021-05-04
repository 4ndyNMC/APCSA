import java.util.ArrayList;

public class SticksAI{

   private ArrayList<Integer>[] choice;

   public SticksAI(int size){
      choice = new ArrayList[size];
      for(int i=0;i<size;
   }

   public int getTurn(){
      int turn = (int)(Math.random()*3)+1;
      System.out.println("AI selects " + turn);
      return turn;
   }


}