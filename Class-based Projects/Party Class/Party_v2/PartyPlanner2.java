import java.util.ArrayList;
public class PartyPlanner2 {
   
   public static void main(String[] args) {
   
      //if max capacity not even, then you get error take that
      //Party2 thisisjustheretoshowthatitwillnotworkifisodd = new Party2(5);
      Party2 myParty = new Party2(6);
      /*
      ArrayList<Guest> group1 = new ArrayList<Guest>(4);
      
      Guest y = new Guest("y",21,true);
      myParty.invite(y);

      
      Guest a = new Guest("a",17,true);
      group1.add(a);
      Guest b = new Guest("b",18,false);
      group1.add(b);
      Guest c = new Guest("c",24,false);
      group1.add(c);
      Guest d = new Guest("d",16,false);
      group1.add(d);
      
      myParty.invite(group1);
      
      System.out.println(myParty.toString());
      System.out.println(myParty.returnGuestNumber());
      
      myParty.kick(group1);
      
      System.out.println(myParty.toString());
      System.out.println(myParty.returnGuestNumber());
      */
      /*
      Guest a = new Guest("a",21,true);
      myParty.invite(a);
      Guest b = new Guest("b",18,false);
      myParty.invite(b);
      Guest c = new Guest("c",24,false);
      myParty.invite(c);
      Guest d = new Guest("d",16,true);
      myParty.invite(d);
      Guest e = new Guest("e",18,true);
      myParty.invite(e);
      Guest f = new Guest("f",18,true);
      myParty.invite(f);
      Guest g = new Guest("g",42,true);
      myParty.invite(g);
      
      System.out.println(myParty.toString());
      System.out.println(myParty.returnGuestNumber());
      
      myParty.kick(a);
      myParty.kick(e);
      
      System.out.println(myParty.toString());
      System.out.println(myParty.returnGuestNumber());
      
      System.out.println(myParty.findGuest(a));
      System.out.println(myParty.findGuest(b));
      */
      
   }
}