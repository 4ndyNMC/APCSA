public class MonetaryCoin extends Coin{

   private double value;
   
   public MonetaryCoin(double value){
      this.value=value;
   }
   
   public double getValue(){
      return value;
   }
   
   public String toString(){
      return  "Coin is " + super.toString() + " and is worth $"+value;
   }
}