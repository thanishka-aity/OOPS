import java.util.*;

class propagation{
     void method3(){
       throw new IOException("internal error");//checked exception can't be propagated
     }
     void method2(){
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

//o/p : compile time error
