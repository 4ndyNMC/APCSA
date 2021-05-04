import java.util.ArrayList;
public class Party2 {
   
   private String string;
   private int balance=0;
   private int balance_temp=0;
   private int maxGuests;
   private boolean able;
   private String name;
   private ArrayList<Guest> list;
   
   public Party2(int max) {
      if (max%2==0){
         list = new ArrayList<Guest>(max);
         maxGuests = max;
      }
   }

   public void invite(Guest guest) {
      able=true;
      if((list.size()<maxGuests)&&(guest.getAge()>=15)&&(guest.getAge()<=30)){
         list.add(guest);
         balance=balance+guest.getGender();
      }else able=false;
   }
   
   public void invite(ArrayList<Guest> group) {
      balance_temp=balance;
      able=true;
      if((group.size()+list.size())>maxGuests)able=false;
      for(int i=0;i<group.size();i++){
         if(!(((group.get(i)).getAge()>=15)&&(group.get(i)).getAge()<=30)) able=false;
            balance_temp+=(group.get(i)).getGender();
         }
      if((balance_temp>3)||(balance_temp<-3)) able=false;
      
      
      if(able){
         for(int i=0;i<group.size();i++){
            list.add(group.get(i));
         }
         balance=balance_temp;
      }
      able=true;
      balance_temp=0;
   }
   
   public void kick(Guest guest) {
      balance-=guest.getGender();
      list.remove(guest);
   }
   
   public void kick(ArrayList<Guest> group) {
      /*balance_temp=balance;
      for(int i=0;i<group.size();i++){
         balance_temp+=(group.get(i)).getGender();
      }
      if(!((balance_temp>3)&&(balance_temp<-3))){  //if the exit upsets the gender balance, then the group won't be allowed to leave and they'll have to stay (not illegal)
         /*for(int i=0;i<list.size();i++){
            for(int a=0;a<group.size();a++){
               if(((list.get(i)).toString()).equals((group.get(a)).toString()))list.remove(group.get(a));
            }
         }*/
         for(int i=0;i<group.size();i++){
            list.remove(group.get(i));
            balance-=(group.get(i)).getGender();
         }
      /*}
      balance_temp=0;*/
   }

   public int returnGuestNumber() {
      return list.size();
   }
   
   public String toString() {
      string = "";
      balance_temp=0;
      for(int i=0;i<list.size();i++){
         string+=(list.get(i)).toString();
         if(((list.get(i)).getGender())==1)balance_temp++;
      }
      string+="|| Fellas: "+balance_temp+" | Ladies: "+(list.size()-balance_temp);
      return string;
   }
   
   public boolean findGuest(Guest guest) {
      if (list.contains(guest)) 
         return true;
      else 
         return false;
   }
}

/*atharva sontakke 747-252-3809
atharva.c.s19@gmail.com
Tired of staying behind in chemistry class?
Want one-on-one tutoring to understand the basics of molecular structure?
Well, you're just in luck! Follow the contact information above and get
the best Chem tutor in town -- whether you're a kid in AP Chem or a teacher in AP Computer Science*/