public class Worker implements Employee
{ 
		private String name;
		private int age;
		private int yearsOnJob;
		private double salary;
		private int id;
		
		public Worker(String n,int a,int y,double s,int i)
		{
			name=n;
			age=a;
			yearsOnJob=y;
			salary=s;
			id=i;
		}
		
		public int getAge()
		{return age;}        // returns age of employee
      public int getYearsOnJob()
		{return yearsOnJob;} // returns number of years on job
      public double getSalary()
		{return salary;}  // returns salary in dollars
      public int getID()
		{return id;}         // returns unique employee ID number
		public String toString()
		{
		 return "name: " + name + " age:" + age + " years: " + yearsOnJob + " salary: " + salary + " ID: " + id;
		} 

  }
