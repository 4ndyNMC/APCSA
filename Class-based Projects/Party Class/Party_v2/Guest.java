public class Guest {
   
   private String name;
   private int age;
   private boolean gender;
   
   public Guest(String name,int age,boolean gender) {
      this.name=name;
      this.age=age;
      this.gender=gender;
   }
   
   public int getAge(){
      return age;
   }
   
   public int getGender(){
      if(gender)return 1;
      else return -1;
   }
   
   public String toString() {
      if (gender) return "("+name+", "+age+", male)";
      else return "("+name+", "+age+", female)";
   }
}