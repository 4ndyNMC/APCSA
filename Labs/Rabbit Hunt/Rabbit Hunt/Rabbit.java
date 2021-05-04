public class Rabbit extends Animal {
    
   private boolean atBush=false;
   private int bushDis=20;
   private int bushDir=0;
   private boolean seeBush;
   private int x=0;
   private int foxDir;
   private int foxDis=20;
   private boolean seeFox=false;
   private boolean turnedCW=true;
    
   public Rabbit(Model model, int row, int column) {
      super(model, row, column);
   }
    
   int decideMove() {
      for(int i=Model.MIN_DIRECTION;i<=Model.MAX_DIRECTION;i++){
         if(look(i)==Model.FOX){
            foxDir=i;
            foxDis=distance(i);
            //seeFox=true;
            x++;
         }
         if(x>=1){
            seeFox=true;
            x=0;
            System.out.println("hostile spotted");
         }
      }
      
      if(seeFox){
         if(turnedCW){
            System.out.println("crisis averted::+2");
            seeFox=false;
            turnedCW=!turnedCW;
            return (foxDir+2)%8;
         }else{
            System.out.println("crisis averted::-4");
            seeFox=false;
            turnedCW=!turnedCW;
            return (foxDir-4)%8;
         }
      }
      seeFox=false;
      System.out.println("no visual");
      return Model.STAY;
      
   }
}
    
    ///////////////////////////////////
   ///////////////////////////////////
   /*
    
        //looks around and collects data
      for(int i=Model.MIN_DIRECTION;i<=Model.MAX_DIRECTION;i++){
         if(look(i)==Model.FOX){
            foxDir=i;
            foxDis=distance(i);
            //seeFox=true;
            x++;
            System.out.println("hostile spotted");
         }
         if(x>=1)seeFox=true;
         if(look(i)==Model.BUSH){
            seeBush=true;
            if(i==Model.MIN_DIRECTION){
               bushDis=distance(i);
               bushDir=i;
               //System.out.println("i==0,dis="+bushDis+"dir="+bushDir);
            }
            if(distance(i)<=bushDis){
               bushDis=distance(i);
               bushDir=i;
               //System.out.println("i!=0,dis="+bushDis+"dir="+bushDir);
            }
         }
      }
      
      if(bushDis<=1){
            atBush=true;
            //System.out.println(atBush+" "+bushDis);
      }else atBush=false;
      
      if((seeFox)&&(foxDis<=1)&&(!atBush)){
         return (foxDir+4)%8;
      }
      if(!seeBush)return 4;
      if(!atBush){
         return bushDir;
      }
      if((atBush)&&(bushDir%2==1)){
         //System.out.println("straighten");
         return clockwise(bushDir);
      }
      if((atBush)&&(foxDis<=1)&&seeFox){
         //System.out.println("HE'S HERE");
         //if(bushDir==0)return 7;
         return (bushDir-1)%8;
      }
            
      //System.out.println("end");
      return Model.STAY;

   
   int clockwise(int i){
      if(i<7)
         return i+1;
      else 
         return 0;
   }
   int ctrclockwise(int i){
      if(i>=1)
         return i-1;
      else 
         return 7;
   }
}
*/