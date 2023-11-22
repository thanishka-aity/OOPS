import java.util.*;

class occurence_char{
  public static void main(String arg[]){
  Scanner sc = new Scanner(System.in);
     String s1 = "mom is murmuring";
     System.out.println("length of string is: "+s1.length());
     System.out.println("enter the character to search");
     char x=sc.next().charAt(0);
     int index= s1.indexOf(x);
     int count=0;
     while(index!=-1){
      System.out.println(index);
      count++;
     index = s1.indexOf(x,index+1);
  }
  System.out.println("the no of occurences of m is "+count);
}
}
