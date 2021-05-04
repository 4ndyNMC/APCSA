public class Bacon implements Edible
{

   private int calories;

   public String getFoodGroup() 
   {
      return "hearty beans";
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