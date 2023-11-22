import java.util.*;

class trycatch_1{

   public static void canivote(int age){
       if(age<18){
          throw new ArithmeticException("You are not eligible to vote!");
       }
       else{
          System.out.println("you can vote!");
       }
   }
   
   public static void main(String arg[]){
        canivote(16);
        System.out.println("you are in main block");
   }
}
