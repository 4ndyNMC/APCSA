//import java.lang.Math;
public class EquilateralTriangle extends Triangle{

  public EquilateralTriangle(double a)
  {
    super(a);
  }

  public double getPerimeter(){
   return 3*getSide();
  }
  

  public double getArea(){
   return .5*(getSide()*((.5*getSide())*Math.sqrt(3)));
  }

}