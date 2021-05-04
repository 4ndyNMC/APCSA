public class TriangleTester
{
  public static void main(String[] args)
  {
  //Declaration Statements
  //Use a side length of 2 for the EquilateralTriangle
  //Use a leg length of 2 for the RightTriangle
    EquilateralTriangle equilateralTr = new EquilateralTriangle(2.0);
    RightTriangle rightTr = new RightTriangle(2.0,2.0);
    
  //Output Statements
    System.out.println("Equilateral " + equilateralTr.getRatio());
    System.out.println("Right isosceles " + rightTr.getRatio());
  }
}