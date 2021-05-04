public class Juice implements Edible
{

   private int calories;

   public String getFoodGroup() 
   {
      return "meaty meats";
   }
   
   public void setCaloriesPerServing(int calories) 
   {
      this.calories = calories;
   }

   public int getCaloriesPerServing() 
   {
      return calories;
   }

}