import java.util.ArrayList;
public class moneyTest{
   
   public static void main(String[] args){
      
      ArrayList<MonetaryCoin> purse=new ArrayList<MonetaryCoin>(10);
      double total=0;
      int totalHeads=0;
      
      MonetaryCoin coin1=new MonetaryCoin(0.01);
      purse.add(coin1);
      MonetaryCoin coin2=new MonetaryCoin(0.01);
      purse.add(coin2);
      MonetaryCoin coin3=new MonetaryCoin(0.05);
      purse.add(coin3);
      MonetaryCoin coin4=new MonetaryCoin(0.05);
      purse.add(coin4);
      MonetaryCoin coin5=new MonetaryCoin(0.10);
      purse.add(coin5);
      MonetaryCoin coin6=new MonetaryCoin(0.10);
      purse.add(coin6);
      MonetaryCoin coin7=new MonetaryCoin(0.25);
      purse.add(coin7);
      MonetaryCoin coin8=new MonetaryCoin(0.25);
      purse.add(coin8);
      MonetaryCoin coin9=new MonetaryCoin(1.00);
      purse.add(coin9);
      MonetaryCoin coin10=new MonetaryCoin(1.00);
      purse.add(coin10);
      
      for(int i=0;i<10;i++){
         (purse.get(i)).flip();
         if((purse.get(i)).isHeads()) {
            totalHeads++;
            total+=(purse.get(i)).getValue();
         }
         System.out.println(purse.get(i));
                 }
      System.out.println("Your total, sir, comes out to be "+total+" and you have "+totalHeads+" coins that have heads");
      System.out.println("Thank you for coming to Taco Bell, have a great day!");
   }

}