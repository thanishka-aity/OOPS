import java.util.*;
import java.io.IOException;  
class propagation{
     void method3()throws IOException{
       throw new IOException("internal error");//checked exception can be propagated using throws keyword
     }
     void method2()throws IOException{
        method3();
     }

     void method1(){
        try{
         method2();
        }
        catch(Exception e){
          System.out.println("caught the error");
        }
     }
     public static void main(String arg[]){
         propagation p = new propagation();
         p.method1();
         System.out.println("normal flow");
     }
}


