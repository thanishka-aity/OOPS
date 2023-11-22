import java.util.*;

public class trycatch{
    public static void main(String arg[]){
         try{
             int x = 10/1;
             //int array[] = new int[4];
             //array[5] = 10;
             String x1 = null;
             System.out.println(x1.length());
             
         }
         catch(ArithmeticException e){
             System.out.println("can't divide by zero");
             System.out.println(e);
         }
         catch(ArrayIndexOutOfBoundsException e){
             System.out.println("Array out of bounds");
             System.out.println(e);
         }
        
         catch(Exception e){
             System.out.println("Some Error has occured!");
             System.out.println(e);
         }
         
         finally{
             System.out.println("your out of code!");
         }
    }
}

