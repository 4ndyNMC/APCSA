import java.util.Scanner;

public class Project5_2 {

   public static void main(String[] args){
      
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Give me a numerator");
      int numer1 = scan.nextInt();
      System.out.println("Give me a denominator");
      int denom1 = scan.nextInt();
      System.out.println("Give me a numerator");
      int numer2 = scan.nextInt();
      System.out.println("Give me a denominator");
      int denom2 = scan.nextInt();
      
      Rational fraction1 = new Rational(numer1,denom1);
      Rational fraction2 = new Rational(numer2,denom2);
      
      if (fraction1.compareTo(fraction2) == 0) {
         System.out.println("Those fractions are equal");
      } else if (fraction1.compareTo(fraction2) == 1) {
         System.out.println("The first fraction is bigger");
      } else {
         System.out.println("The second fraction is bigger");
      }
      
   }
}