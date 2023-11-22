import java.util.*;
import java.lang.*;

class person{
    Scanner sc=new Scanner(System.in);
    protected String name;
    protected String address;
    protected int nocourses;
   
    person(){
      System.out.println("we are in person method");
    }
    void getname(){
      System.out.print("name:");
      name=sc.next();
    }
     void getaddress(){
      System.out.print("address:");
      address=sc.next();
    }
     void getnocourses(){
      System.out.print("nocourses:");
      nocourses=sc.nextInt();
    }
}

class student extends person{
      int [] grades= new int [nocourses];
      String [] courses= new String [nocourses];
      student(){
       /*ocourses=0;
        courses={};
        grades={};
        */
      }
      void addcoursegrade(){
         System.out.println("enter the courses and grade respectively");
       //System.out.println(nocourses);
         for(int i=0;i<nocourses;i++){
            System.out.println("hello");
            courses[i]=sc.next();
            grades[i]=sc.nextInt();
         }
         for(int i=0;i<nocourses;i++){
            System.out.println(courses[i]+grades[i]);
         }
      }
      
      void ss(){
        for(int i=0;i<nocourses;i++){
            System.out.println("hello");
            courses[i]=sc.next();
            grades[i]=sc.nextInt();
         }
      }
      
      
      
}

class teacher extends person{

     teacher(){
        /*courses=0;
        courses={};*/
     }
    //ocourses=nextInt();
}

class LAB4_2{
  public static void main(String arg[]){
     //person p= new person();
       student s= new student();
       s.getname();
       s.getaddress();
       s.getnocourses();
    // s.addcoursegrade();
    s.ss();
  }
}

