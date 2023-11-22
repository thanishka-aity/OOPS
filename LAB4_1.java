import java.util.*;
import java.lang.*;

class shape{
  Scanner sc=new Scanner(System.in);
  shape(){
     System.out.println("we are in shape cls");
  }
  void getarea(){
    /* System.out.println("select the shape 1.square 2.circle 3.rectangle");
     int n=sc.nextInt();
     switch(n){
       case 1:
              int s=sc.nextInt();
              System.out.println("area of square="+s*s);
              break;
       case 2:
              int r=sc.nextInt();
              System.out.println("area of circle="+3.14*r*r);
              break;
       case 3:
              int l=sc.nextInt();
              int b=sc.nextInt();
              System.out.println("area of rectangle="+l*b);
              break;
     }*/
      System.out.println("we are in method area of shape");
  }
  void getperimeter(){
    System.out.println("we are in method perimeter of shape");
  }
}

class square extends shape{
     square(){
       System.out.println("we are in square cls");
     }
     void getarea(){
       super.getarea();
       System.out.print("s=");
       int s=sc.nextInt();
       System.out.println("area of square="+s*s);
     }
      void getperimeter(){
       super.getperimeter();
       System.out.print("s=");
       int s=sc.nextInt();
       System.out.println("perimeter of square="+4*s);
     }
}

class circle extends shape{
      circle(){
       System.out.println("we are in square cls");
     }
      void getarea(){
       super.getarea();
       System.out.print("r=");
        int r=sc.nextInt();
        System.out.println("area of circle="+3.14*r*r);
     }
     void getperimeter(){
       super.getperimeter();
       System.out.print("r=");
       int r=sc.nextInt();
       System.out.println("perimeter of circle="+2*3.14*r);
     }
}

class rectangle extends shape{
      rectangle(){
       System.out.println("we are in square cls");
     }
      void getarea(){
       super.getarea();
       System.out.print("l,b=");
        int l=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("area of rectangle="+l*b);
     }
      void getperimeter(){
       super.getperimeter();
        System.out.print("l,b=");
        int l=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("perimeter of rectangle="+2*(l+b));
     }
}

class LAB4_1{
      public static void main(String a[]){
         shape s= new shape();
         square sq = new square();
         sq.getarea();
         sq.getperimeter();
         circle c = new circle();
         c.getarea();
         c.getperimeter();
         rectangle r= new rectangle();
         r.getarea();
         r.getperimeter();
      }
      
}
