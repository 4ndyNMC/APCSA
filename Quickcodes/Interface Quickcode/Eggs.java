public class Eggs implements Edible
{

   private int calories;

   public String getFoodGroup() 
   {
      return "carbs";
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