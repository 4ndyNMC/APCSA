import java.util.ArrayList;

public class Company
{
    // minimum age, years on job, and salary needed to retire
    
   private final static int RETIRE_AGE   = 65;
   private final static int RETIRE_YEARS = 30;
   private final static double RETIRE_SALARY = 10000.0;
    
   private ArrayList myEmployees;  // list of employees
   private double myTotalSalary;   // total salary of all employees
   private int count;
   private int x;

   public Company()
   {
      myTotalSalary=0.0;
      myEmployees=new ArrayList();
   }
	
   public void add(Employee emp)
   {
      boolean added=false;
      int s=myEmployees.size();
      for(int i=0;i<s;i++)
      {Worker w=(Worker)myEmployees.get(i);
         if(w.getID()>=emp.getID())
         {myEmployees.add(i,emp);
            i=s;
            added=true;}
      }
      if(added==false){myEmployees.add(emp);}
      myTotalSalary += emp.getSalary();
   }
	
   public void printEmployees()
   {
      for(int i=0;i<myEmployees.size();i++)
      {
         System.out.println(myEmployees.get(i));
         System.out.println(myEmployees.size() + " employees have a total salary of " + myTotalSalary);
      }
   }
	
	
    // postcondition: returns true if emp is eligible to retire;
    //                otherwise, returns false

   private boolean employeeIsEligible(Employee emp)
   {
      count=0;
      if(emp.getAge()>=65)count++;
      if(emp.getYearsOnJob()>=30)count++;
      if(emp.getSalary()>=10000.0)count++;
      if(count>=2)return true;
      else return false;
   }

    // postcondition: all retirement-eligible employees have been
    //                removed from myEmployees; myEmployees remains
    //                sorted by employee ID; myTotalSalary has been
    //                updated to maintain invariant that it represents
    //                total of all employee salaries

   public void processRetirements()
   {
       for(int i=0;i<myEmployees.size();i++)
       {
         if(employeeIsEligible((Employee)myEmployees.get(i)))
         {
            x=i;
            myTotalSalary-=((Employee)myEmployees.get(i)).getSalary();
            myEmployees.remove(i);
            i=x-1;
         }
       }
   }
    
}
