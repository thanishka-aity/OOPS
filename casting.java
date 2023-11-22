import java.util.*;
import java.lang.*;

class monster{
   String name;
   public monster(String name){
      this.name=name;
     // System.out.println(name);
   }
   
   void attack(){
      System.out.println(name+"--I don't know who to attack!");
   }
}

class watermonster extends monster{
   public watermonster(String name){
     super(name);
     //System.out.println(name);
   }
   public void attack(){
      System.out.println(name+"-->Attack with water!");
   }
}

class firemonster extends monster{
    public firemonster(String name){
     super(name);
    // System.out.println(name);
   }
    void attack(){
      System.out.println(name+"-->Attack with fire!");
   }
}

class stonemonster extends monster{
   public stonemonster(String name){
     super(name);
     //System.out.println(name);
   }
  void attack(){
      System.out.println(name+"-->Attack with stones!");
   }
}

class casting{
   public static void main(String arg[]){
       monster m1=new monster("Luni");
       m1.attack();
       monster m2=new watermonster("Dany");
       m2.attack();
       monster m3=new firemonster("Juli");
       m3.attack();
       monster m4=new stonemonster("Harry");
       m4.attack();
   }
}
