public class CompanyTester{

public static void main(String args[])
{
	Company myCompany=new Company();
	myCompany.add(new Worker("Abe",37,8,12500.20,1));
	myCompany.add(new Worker("Fred",71,36,85400.12,6));//should be retired
	myCompany.add(new Worker("Charles",67,24,8745.20,3));
	myCompany.add(new Worker("Ben",56,30,32600.20,2));//should be retired
	myCompany.add(new Worker("Ellen",41,3,19530.65,5));
	myCompany.add(new Worker("Jim",67,30,84600.99,10));//should be retired
	myCompany.add(new Worker("Greg",25,2,22530.87,7));
	myCompany.add(new Worker("Doug",68,48,112500.63,4));//should be retired
	myCompany.add(new Worker("Ike",51,32,43700.40,9));//should be retired
	myCompany.add(new Worker("Helen",66,26,92500.10,8));//should be retired

	myCompany.printEmployees();
	
	
	myCompany.processRetirements();
	
	System.out.println();
	
	myCompany.printEmployees();
}
	/*
	Abe
   Chalres
   Ellen
   Greg
	*/
}