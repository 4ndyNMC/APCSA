public class PartyPlanner {
   
   public static void main(String[] args) {
   
      Party myParty = new Party(10);
      
      myParty.addGuest("Andy Taylor");
      myParty.addGuest("Opie Taylor");
      myParty.addGuest("Barney Fife");
      myParty.addGuest("Aunt Bee");
      myParty.addGuest("Floyd");
      myParty.addGuest("Jimmy");
      myParty.addGuest("The Mayor");
      myParty.addGuest("Gomer Pyle");
      myParty.addGuest("Wallee");
      myParty.addGuest("Otis");
      
      System.out.println(myParty.returnGuestNumber());
      System.out.println(myParty.returnGuests());
      
      myParty.removeGuest("Opie Taylor");
      myParty.removeGuest("Otis");
      myParty.removeGuest("Aunt Bee");
      
      System.out.println(myParty.returnGuestNumber());
      System.out.println(myParty.returnGuests());
   }
}