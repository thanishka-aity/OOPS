import java.util.*;

class trycatch_2{

   public static void canivote(int age) throws ArithmeticException{
       if(age<18){
          throw new ArithmeticException("You are not eligible to vote!");
       }
       else{
          System.out.println("you can vote!");
       }
   }
   
   public static void main(String arg[]){
        try{
        canivote(18);
        }
        catch(ArithmeticException e){
          System.out.println("the exception is now in main method");
        }
        System.out.println("you are in main block");
   }
}
