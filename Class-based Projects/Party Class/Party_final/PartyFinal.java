import java.util.ArrayList;
public class PartyFinal {
   
   private boolean hasStuff = false;
   private String string;
   private int balance=0;
   private int testbalance=0;
   private int maxGuests;
   private String name;
   private ArrayList<Guest> list;
   
   public PartyFinal(int max) {
      if (max%2==0){
         list = new ArrayList<Guest>(max);
         maxGuests = max;
      }
   }

   public void invite(Guest guest) {
      /*if(!hasStuff) {
         list.add(guest);
         hasStuff=true;
         balance=balance+guest.getGender();
      }*/
      testbalance=balance+guest.getGender();
      if((list.size()<maxGuests)
      &&(guest.getAge()>=15)
      &&(guest.getAge()<30)
      &&(testbalance>-3)
      &&(testbalance<3)){
         list.add(guest);
         balance=balance+guest.getGender();
      }
      testbalance=0;
   }
   
   public void invite(ArrayList<Guest> group) {
   
   
   }
   
   public void kick(Guest guest) {
      list.remove(guest);
   }
   
   public void kick(ArrayList<Guest> group) {
   
   
   }

   public int returnGuestNumber() {
      return list.size();
   }
   
   public String toString() {
      string = "";
      for(int i=0;i<list.size();i++){
         string=string+(list.get(i)).toString();
      }
      return balance+", "+string;
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