import java.util.*;

class string_vowels{
  public static void main(String arg[]){
     String s1="thanishka ";
     int vowels=0,consonants=0;
     for(int i=0;i<s1.length();i++){
        if(s1.charAt(i)=='a' ||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'){ 
          vowels++;
          System.out.println(s1.charAt(i));
     }
     else consonants++;
     }
     System.out.println("vowels:"+vowels+" consonants:"+consonants);
  }
  
}
