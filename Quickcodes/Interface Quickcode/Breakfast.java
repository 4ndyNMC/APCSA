public class Breakfast
{
   private int myTotalCalories = 0;
   private String groups = "";
   public Breakfast()
   {}
	
   public void eat(Edible obj, int servings)
   {
      myTotalCalories += obj.getCaloriesPerServing() * servings;
      if (groups.length()==0) groups=obj.getFoodGroup();
      else
         groups = groups + ", " +obj.getFoodGroup();
   }
   public String toString()
   {
      return "Breakfast has " + myTotalCalories + " Total Calories with food from "+ groups;
   }

}