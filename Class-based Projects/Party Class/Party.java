public class Party {
   
   private String string;
   private String lastAdded;
   private int number;
   private int maxGuests;
   private String name;
   private String[] list;
   
   public Party(int max) {
      list = new String[max];
      maxGuests = max;
   }

   public void addGuest(String name) {
      lastAdded = name;
      for (int i = 0;i<maxGuests;i++) {
         if (list[i] == null) {
            list[i] = name;
            i = maxGuests;
         }
      }
   }
   
   public void removeGuest(String name) {
      number = 0;
      for (int i = 0;i<maxGuests;i++) {
         if (list[i] == name) {
            list[i] = null;
            number = i;
            i = maxGuests;
         }
      }
      for (int i = number;i<maxGuests-1;i++) {
         list[i] = list[i+1];
      }
      number = 0;
      for (int i = 0; i < maxGuests; i++) {
         if (list[i] == lastAdded) {
            for (int x = i;i<maxGuests;i++) {
               list[i+1] = null;
            }
      }

   }

   public int returnGuestNumber() {
      number = 0;
      for (int i = 0; i < maxGuests; i++) {
         if (list[i] != null) number++;
      }
      return number;
   }
   
   public String returnGuests() {
      string = list[0];
      for (int i = 1; i < maxGuests; i++) {
         if (list[i] != null) string = string + ", " + list[i];
      }
      return string;
   }
   
   public boolean findGuest(String name) {
      number = 0;
      for (int i = 0; i < maxGuests; i++) {
         if (list[i] == "name") number++; 
      }
      if (number>0) 
         return true;
      else 
         return false;
   }
}
}

//atharva sontakke 747-252-3809
//atharva.c.s19@gmail.com