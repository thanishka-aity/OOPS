import java.util.*;

class Strings_ex{
   public static void main(String arg[]){
      String s1 = "thanishka is my name";
      String s11= "thanishka";
      String s2 = new String("THANISHKA");
      String s3 = "sweety";
      String s4 = "van";
      String substr = "my";
      System.out.println(s1.compareTo(s11));//0 equal
      System.out.println(s1.compareTo(s3));//positive val 1
      System.out.println(s1.compareTo(s4));//neg -2times bigger
      System.out.println(s1.equals(s2));//f
      System.out.println(s1.equalsIgnoreCase(s2));//true
      System.out.println(s1.indexOf('a'));  
      System.out.println(s1.indexOf('z'));//-1 means no occurence
       System.out.println(s1.indexOf('a',4));//index of char after index 4
        System.out.println(s1.indexOf(substr));
        System.out.println(s1.concat(s3).concat(s11));
   }
}
