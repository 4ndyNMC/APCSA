public class BreakfastTest
{
	public static void main(String args[])
	{
	
	Breakfast myBreakfast = new Breakfast();
	
	Bacon myBacon = new Bacon();
	myBacon.setCaloriesPerServing(300);
   
	Eggs myEggs = new Eggs();
	myEggs.setCaloriesPerServing(100);
   
	Juice myJuice = new Juice();
	myJuice.setCaloriesPerServing(75);
   
	myBreakfast.eat(myBacon,2);
	
	myBreakfast.eat(myEggs,3);
	
	myBreakfast.eat(myJuice,1);
	
	System.out.println(myBreakfast);
	
	}
}	