import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
   public Picture ()
   {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
      super();  
   }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
   public Picture(String fileName)
   {
    // let the parent class handle this fileName
      super(fileName);
   }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
   public Picture(int height, int width)
   {
    // let the parent class handle this width and height
      super(width,height);
   }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
   public Picture(Picture copyPicture)
   {
    // let the parent class do the copy
      super(copyPicture);
   }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
   public Picture(BufferedImage image)
   {
      super(image);
   }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
   public String toString()
   {
      String output = "Picture, filename " + getFileName() + 
         " height " + getHeight() 
         + " width " + getWidth();
      return output;
    
   }
  
  /** Method to set the blue to 0 */
   public void zeroBlue()
   {
      Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels)
      {
         for (Pixel pixelObj : rowArray)
         {
            pixelObj.setBlue(0);
         }
      }
   }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
   public void mirrorVertical()
   {
      Pixel[][] pixels = this.getPixels2D();
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      int width = pixels[0].length;
      for (int row = 0; row < pixels.length; row++)
      {
         for (int col = 0; col < width / 2; col++)
         {
            leftPixel = pixels[row][col];
            rightPixel = pixels[row][width - 1 - col];
            rightPixel.setColor(leftPixel.getColor());
         }
      } 
   }
  
  /** Mirror just part of a picture of a temple */
   public void mirrorTemple()
   {
      int mirrorPoint = 276;
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      int count = 0;
      Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
      for (int row = 27; row < 97; row++)
      {
      // loop from 13 to just before the mirror point
         for (int col = 13; col < mirrorPoint; col++)
         {
         
            leftPixel = pixels[row][col];      
            rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
            rightPixel.setColor(leftPixel.getColor());
         }
      }
   }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
   public void copy(Picture fromPic, 
                 int startRow, int startCol)
   {
      Pixel fromPixel = null;
      Pixel toPixel = null;
      Pixel[][] toPixels = this.getPixels2D();
      Pixel[][] fromPixels = fromPic.getPixels2D();
      for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
      {
         for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
         {
            fromPixel = fromPixels[fromRow][fromCol];
            toPixel = toPixels[toRow][toCol];
            toPixel.setColor(fromPixel.getColor());
         }
      }   
   }

  /** Method to create a collage of several pictures */
   public void createCollage()
   {
      Picture flower1 = new Picture("flower1.jpg");
      Picture flower2 = new Picture("flower2.jpg");
      this.copy(flower1,0,0);
      this.copy(flower2,100,0);
      this.copy(flower1,200,0);
      Picture flowerNoBlue = new Picture(flower2);
      flowerNoBlue.zeroBlue();
      this.copy(flowerNoBlue,300,0);
      this.copy(flower1,400,0);
      this.copy(flower2,500,0);
      this.mirrorVertical();
      this.write("collage.jpg");
   }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
   public void edgeDetection(int edgeDist)
   {
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      Pixel[][] pixels = this.getPixels2D();
      Color rightColor = null;
      for (int row = 0; row < pixels.length; row++)
      {
         for (int col = 0; 
           col < pixels[0].length-1; col++)
         {
            leftPixel = pixels[row][col];
            rightPixel = pixels[row][col+1];
            rightColor = rightPixel.getColor();
            if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
               leftPixel.setColor(Color.BLACK);
            else
               leftPixel.setColor(Color.WHITE);
         }
      }
   }
  
  ///////////////////////////////////////////////////////////////////////////
  ///:D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D ///
  ///:D :D :D all methods below below are part of the stegonography lab  :D :D :D ///
  ///:D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D ///
  ///////////////////////////////////////////////////////////////////////////

  
   public void turnRedEven(){
      Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels)
      {
         for (Pixel pixelObj : rowArray)
         {
            if( ( ( pixelObj.getRed())%2)==1)pixelObj.setRed(pixelObj.getRed()-1);
            if( ( ( pixelObj.getGreen())%2)==1)pixelObj.setGreen(pixelObj.getGreen()-1);
            if( ( ( pixelObj.getBlue())%2)==1)pixelObj.setBlue(pixelObj.getBlue()-1);
         }
      }
   }
   public void turnGreenEven(){
      Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels)
      {
         for (Pixel pixelObj : rowArray)
         {
            if( ( ( pixelObj.getGreen())%2)==1)pixelObj.setGreen(pixelObj.getGreen()-1);
         }
      }
   }
   public void turnBlueEven(){
      Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels)
      {
         for (Pixel pixelObj : rowArray)
         {
            if( ( ( pixelObj.getBlue())%2)==1)pixelObj.setBlue(pixelObj.getBlue()-1);
         }
      }
   }
   public void encodeRed(Picture hidden){
      this.turnRedEven();
      this.explore();
      for(int row=0;row<this.getWidth();row++)
      {
         for(int col=0;col<this.getHeight();col++)
         {
            if((hidden.getPixel(row,col)).getRed()<=130)
            {
               (getPixel(row,col)).setRed((getPixel(row,col).getRed()+1));
            }
         }
      }
   }
   public void encodeGreen(Picture hidden){
      this.turnGreenEven();
      for(int row=0;row<this.getWidth();row++)
      {
         for(int col=0;col<this.getHeight();col++)
         {
            if((hidden.getPixel(row,col)).getGreen()<=5)
            {
               (getPixel(row,col)).setGreen((getPixel(row,col).getGreen()-1));
            }
         }
      }
   }
   public void encodeBlue(Picture hidden){
      this.turnBlueEven();
      for(int row=0;row<this.getWidth();row++)
      {
         for(int col=0;col<this.getHeight();col++)
         {
            if((hidden.getPixel(row,col)).getBlue()<=5)
            {
               (getPixel(row,col)).setBlue((getPixel(row,col).getBlue()-1));
            }
         }
      }
   }

   public void decodeRed(){
      Pixel[][] pixels=this.getPixels2D();
      for (Pixel[] rowArray : pixels)
      {
         for (Pixel pixelObj : rowArray)
         {
            if(pixelObj.getRed()%2==1)
            {
               pixelObj.setRed(0);
               pixelObj.setBlue(0);
               pixelObj.setGreen(0);

            }
            else 
            {
               pixelObj.setRed(255);
               pixelObj.setBlue(255);
               pixelObj.setGreen(255);
            }
         }
      }
      explore();
   }
   public void decodeGreen(){
      Pixel[][] pixels=this.getPixels2D();
      for (Pixel[] rowArray : pixels)
      {
         for (Pixel pixelObj : rowArray)
         {
            if(pixelObj.getGreen()%2==1)
            {
               pixelObj.setRed(0);
               pixelObj.setBlue(0);
               pixelObj.setGreen(0);

            }
            else 
            {
               pixelObj.setRed(255);
               pixelObj.setBlue(255);
               pixelObj.setGreen(255);
            }
         }
      }
      explore();
   }
   
   public void encodeRGB(Picture hidden){
      this.turnRedEven();
      this.turnGreenEven();
      this.turnBlueEven();
      for(int row=0;row<getWidth();row++){
         for(int col=0;col<getHeight();col++){
            if((hidden.getPixel(row,col)).getRed()<=150)
            {
               (getPixel(row,col)).setRed((getPixel(row,col).getRed()+1));
            }
            if((hidden.getPixel(row,col)).getGreen()<=150)
            {
               (getPixel(row,col)).setGreen((getPixel(row,col).getGreen()-1));
            }
            if((hidden.getPixel(row,col)).getBlue()<=150)
            {
               (getPixel(row,col)).setBlue((getPixel(row,col).getBlue()-1));
            }
         }
      }
   }
   
   public void decodeRGB(){
      Pixel[][] pixels=this.getPixels2D();
      for (Pixel[] rowArray : pixels)
      {
         for (Pixel pixelObj : rowArray)
         {
            if(pixelObj.getRed()%2==1)
            {
               pixelObj.setRed(0);

            }
            else 
            {
               pixelObj.setRed(255);

            }
            if(pixelObj.getGreen()%2==1)
            {
               pixelObj.setGreen(0);

            }
            else 
            {
               pixelObj.setGreen(255);
            }
            if(pixelObj.getBlue()%2==1)
            {
               pixelObj.setBlue(0);

            }
            else 
            {
               pixelObj.setBlue(255);
            }
         }
      }
      explore();
   }
  
  ///////////////////////////////////////////////////////////////////////////
  ///:D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D ///
  ///:D :D :D all methods below below are part of the quickcode  :D :D :D ///
  ///:D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D :D ///
  ///////////////////////////////////////////////////////////////////////////
  
   public int getCountRedOverValue(int value){
      int count=0;
      for(int row=0;row<this.getWidth();row++){
         for(int col=0;col<this.getHeight();col++){
            if((this.getPixel(row,col)).getRed()>value)count++;
         }
      }
      return count;
   }
  
   public void setRedToHalfValueInTopHalf(){
      for(int row=0;row<this.getWidth();row++){
         for(int col=0;col<(this.getHeight()/2);col++){
            (this.getPixel(row,col)).setRed( (this.getPixel(row,col)).getRed()/2 );
         }
      }
   }
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
   public static void main(String[] args) 
   {
      Picture hider = new Picture("hider.jpg");
      
      Picture hidden1 = new Picture("hidden3.jpg");
      Picture hidden2 = new Picture("hidden1.jpg");
      Picture hidden3 = new Picture("hidden3.jpg");
      Picture hidden3bit = new Picture("hidden3bit.jpg");
      /*hidden1.explore();
      hider.encodeRed(hidden1);
      hider.encodeGreen(hidden2);
      hider.encodeBlue(hidden3);
      hider.decodeRed();
      //hider.decodeGreen();
      */
      hider.explore();
      hidden3bit.explore();
      hider.encodeRGB(hidden3bit);
      hider.decodeRGB();
      
    //QuickCode below
    /*Picture qc=new Picture("beach.jpg");
    System.out.println("There are "+qc.getCountRedOverValue(100)+" pixels that have a red valyue of more than 100");
    System.out.println("There are "+qc.getCountRedOverValue(200)+" pixels that have a red valyue of more than 200");
    qc.explore();
    qc.setRedToHalfValueInTopHalf();
    qc.explore();*/
   }
  
} // this } is the end of class Picture, put all new methods before this
