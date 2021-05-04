import java.lang.Math;
public class RightTriangle extends Triangle{
   
   private double b;
   
   public RightTriangle(double a,double b){
      super(a);
      this.b=b;
   }
   
   public double getPerimeter(){
      return getSide()+b+(Math.sqrt((getSide()*getSide())+(b*b)));
   }
   
   public double getArea(){
      return .5*getSide()*b;
   }
   
}