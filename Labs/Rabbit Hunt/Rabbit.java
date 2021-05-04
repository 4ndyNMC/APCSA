public class Rabbit extends Animal {
   
   private int followp3=0;
   private int followm3=0;
   private int followp2=0;
   private int followm2=0;
   private int edgeDis=25;
   private int edgeDir=0;
   private boolean atEdge;
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
         if(look(i)==Model.EDGE){
            if(distance(i)<edgeDis){
               edgeDis=distance(i);
               edgeDir=i;
            }
         }
         if(x>=1){
            seeFox=true;
            x=0;
         }
      }
      
      //if(edgeDis<=1){
        // System.out.println("didit");
         //return (edgeDir+4)%8;
      //}
      if(seeFox){
         //if(foxDis<=1)return (foxDir+4)%8;
         if(canMove((foxDir+3)%8)){
            seeFox=false;
            thisWay(3);
            if(followp3>=7){
               followp3=0;
               return (((foxDir+3)%8)+4)%8;
            }
            return (foxDir+3)%8;
         }else if (canMove( (foxDir-2)%8)){
            seeFox=false;
            thisWay(-2);
            if(followm2>=7){
               followm2=0;
               return (((foxDir-2)%8)+4)%8;
            }
            return (foxDir-2)%8;
         }else if(canMove((foxDir+2)%8)){
            seeFox=false;
            thisWay(2);
            if(followp2>=7){
               followp2=0;
               return (((foxDir+2)%8)+4)%8;
            }
            return (foxDir+2)%8;
         }else if(canMove((foxDir-3)%8)){
            seeFox=false;
            thisWay(-3);
            if(followm3>=7){
               followm3=0;
               return (((foxDir-3)%8)+4)%8;
            }
            return (foxDir-3)%8;
         }else if (canMove((foxDir+4)%8)){
            return (foxDir+4)%8;
         }
      }
      seeFox=false;
      //System.out.println("no visual");
      return Model.STAY;
      
   }
   
   void thisWay(int dir){
      if(dir==3){
         followp3++;
         followm3=0;
         followp2=0;
         followm2=0;
      
      }
      if(dir==2){
         followp3=0;
         followm3=0;
         followp2++;
         followm2=0;
      
      }
      if(dir==-2){
         followp3=0;
         followm3=0;
         followp2=0;
         followm2++;
      
      }
      if(dir==-3){
         followp3=0;
         followm3++;
         followp2=0;
         followm2=0;
      
      }
   }
}//http://freegifmaker.me/images/2f585/
    
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





/*public class Rabbit extends Animal {
      
      private boolean atBush=false;
      private int bushDis=20;
      private int bushDir=0;
      private boolean seeBush;
      private int x=0;
      private int foxDir;
      private int foxDis=20;
      private boolean seeRabbit;
      private boolean turnedCW=true;
        
        int decideMove(){
        //looks around and collects data
      for(int i=Model.MIN_DIRECTION;i<=Model.MAX_DIRECTION;i++){
         if(look(i)==Model.FOX){
            foxDir=i;
            foxDis=distance(i);
            //seeRabbit=true;
            x++;
            System.out.println("hostile spotted");
         }
         if(x>=1)seeRabbit=true;
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
      
      if((seeRabbit)&&(foxDis<=1)&&(!atBush)){
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
      if((atBush)&&(foxDis<=1)&&seeRabbit){
         //System.out.println("HE'S HERE");
         //if(bushDir==0)return 7;
         return (bushDir-1)%8;
      }
            
      //System.out.println("end");
      return Model.STAY;
}
   
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
      

/*
   private int x=0;
   private int foxDir;
   private int foxDis=20;
   private boolean seeRabbit;
   private boolean turnedCW=true;
    
   public Rabbit(Model model, int row, int column) {
      super(model, row, column);
   }
    
   int decideMove() {
      for(int i=Model.MIN_DIRECTION;i<=Model.MAX_DIRECTION;i++){
         if(look(i)==Model.FOX){
            foxDir=i;
            foxDis=distance(i);
            //seeRabbit=true;
            x++;
            //System.out.println("hostile spotted");
         }
      }
      if(x>=1)seeRabbit=true;
      
      if(seeRabbit){
         if(turnedCW){
            turnedCW=!turnedCW;
            return (foxDir+2)%8;
         }else {
            turnedCW=!turnedCW;
            return (foxDir-4)%8;
         }
      }
      return Model.STAY;
   }
}
    
    ///////////////////////////////////
   ///////////////////////////////////
   /*
        
      private boolean atBush=false;
      private int bushDis=20;
      private int bushDir=0;
      private boolean seeBush;
      private int x=0;
      private int foxDir;
      private int foxDis=20;
      private boolean seeRabbit;
      private boolean turnedCW=true;
        
        //looks around and collects data
      for(int i=Model.MIN_DIRECTION;i<=Model.MAX_DIRECTION;i++){
         if(look(i)==Model.FOX){
            foxDir=i;
            foxDis=distance(i);
            //seeRabbit=true;
            x++;
            System.out.println("hostile spotted");
         }
         if(x>=1)seeRabbit=true;
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
      
      if((seeRabbit)&&(foxDis<=1)&&(!atBush)){
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
      if((atBush)&&(foxDis<=1)&&seeRabbit){
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
}*/