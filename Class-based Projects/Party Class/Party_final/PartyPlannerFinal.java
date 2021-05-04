public class PartyPlannerFinal {
   
   public static void main(String[] args) {
   
      //if max capacity not even, then you get error take that
      //Party2 thisisjustheretoshowthatitwillnotworkifisodd = new Party2(5);
      PartyFinal myParty = new PartyFinal(16);
      
      Guest a = new Guest("a",21,false);
      myParty.invite(a);
      Guest b = new Guest("b",21,true);
      myParty.invite(b);
      Guest c = new Guest("c",21,true);
      myParty.invite(c);
      Guest d = new Guest("d",21,true);
      myParty.invite(d);
      Guest e = new Guest("e",21,true);
      myParty.invite(e); //after 3 too many males, no more can join
      Guest f = new Guest("f",31,false);
      myParty.invite(f); //cannot join bc too old (must be 15-30 inclusive)
      
      System.out.println(myParty.toString()); //printing party works fine
      System.out.println(myParty.returnGuestNumber()); //return guest number works fine
      
      myParty.kick(a); //kick works fine
      myParty.kick(e);
      
      System.out.println(myParty.toString());
      System.out.println(myParty.returnGuestNumber());
      
      System.out.println(myParty.findGuest(a)); //search guest works fine
      System.out.println(myParty.findGuest(b));
      
      
   }
}