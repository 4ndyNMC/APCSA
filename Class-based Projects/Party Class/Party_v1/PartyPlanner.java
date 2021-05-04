public class PartyPlanner {
   
   public static void main(String[] args) {
   
      Party myParty = new Party(5);
      
      myParty.add("a");
      myParty.add("b");
      myParty.add("c");
      myParty.add("d");
      myParty.add("e");
      
      System.out.println(myParty.returnGuests());
      System.out.println(myParty.returnGuestNumber());
      
      myParty.kick("a");
      myParty.kick("e");
      
      System.out.println(myParty.returnGuests());
      System.out.println(myParty.returnGuestNumber());
      
      System.out.println(myParty.findGuest("a"));
      System.out.println(myParty.findGuest("b"));
      
      
   }
}