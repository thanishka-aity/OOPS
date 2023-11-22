import java.util.*;
import java.lang.*;

class vehicle{
  private String company,model,engine_type;
  private double fuel_capacity,mileage;
  public  vehicle(String company,String model,String engine_type,double fuel_capacity,double mileage){
      this.company=company;
      this.model=model;
      this.engine_type=engine_type;
      this.fuel_capacity=fuel_capacity;
      this.mileage=mileage;
    }
    String getcompany(){
      return company;
    }
    
    String getmodel(){
      return model;
    }
    
    String getengine_type(){
      return engine_type;
    }
    
    double  getfuel_capacity(){
      return fuel_capacity;
    }
    double getmileage(){
      return mileage;
    }
}

class two_wheeler extends vehicle{
   String company,model,user_review,displacement,engine_type;
   double mileage,fuel_capacity,price;
  // bool head_lamp;
  two_wheeler(String company,String model,String engine_type,double fuel_capacity,double mileage){
  
  super(company,model,engine_type,fuel_capacity,mileage);
  }
   
}

class four_wheeler extends vehicle{
   String company,model,engine_type;
   float mileage,fuel_capacity,displacement;
   //bool ac,air_bags;
   four_wheeler(String company,String model,String engine_type,double fuel_capacity,double mileage){
     super(company,model,engine_type,fuel_capacity,mileage);
   }
}

class vdistribution{
   public static void main(String arg[]){
    System.out.printf("BIKES AVAILABLE");
    System.out.println("\n");
    two_wheeler bike=new two_wheeler("Bajaj","Bajaj CT 100","Single cylinder",102,75);
    System.out.println("Two wheeler company: "+bike.getcompany());
     System.out.println("Two wheeler model: "+bike.getmodel());
      System.out.println("Two wheeler enginetype: "+bike.getengine_type());
       System.out.println("Two wheeler fuel_capacity: "+bike.getfuel_capacity());
       System.out.println("Two wheeler mileage: "+bike.getmileage());
       
       System.out.printf("\n");
       
     two_wheeler bike1=new two_wheeler("TVS","TVS star city plus","single cylinde air cooled",10,70);
    System.out.println("Two wheeler company: "+bike1.getcompany());
     System.out.println("Two wheeler model: "+bike1.getmodel());
      System.out.println("Two wheeler enginetype: "+bike1.getengine_type());
       System.out.println("Two wheeler fuel_capacity: "+bike1.getfuel_capacity());
       System.out.println("Two wheeler mileage: "+bike1.getmileage());
       
        System.out.printf("\n");
       
     two_wheeler bike2=new two_wheeler("Hero","Hero HF Deluxe","single cylinder, air-cooled, 4-stroke OHC",9.6,65);
    System.out.println("Two wheeler company: "+bike2.getcompany());
     System.out.println("Two wheeler model: "+bike2.getmodel());
      System.out.println("Two wheeler enginetype: "+bike2.getengine_type());
       System.out.println("Two wheeler fuel_capacity: "+bike2.getfuel_capacity());
       System.out.println("Two wheeler mileage: "+bike2.getmileage());
       
       System.out.printf("\n");
       System.out.println("CARS AVAILABLE");
       System.out.printf("\n");
       
       four_wheeler car= new four_wheeler("Maruthi","Maruthi fronx","hybrid engine",44,22.89);
        System.out.println("four wheeler company: "+car.getcompany());
     System.out.println("four wheeler model: "+car.getmodel());
      System.out.println("four wheeler enginetype: "+car.getengine_type());
       System.out.println("four wheeler fuel_capacity: "+car.getfuel_capacity());
       System.out.println("four wheeler mileage: "+car.getmileage());
       
        System.out.printf("\n");
       
       four_wheeler car1= new four_wheeler("Mahindra","Mahindra Thar","hybrid engine",30,15.2);
        System.out.println("four wheeler company: "+car1.getcompany());
     System.out.println("four wheeler model: "+car1.getmodel());
      System.out.println("four wheeler enginetype: "+car1.getengine_type());
       System.out.println("four wheeler fuel_capacity: "+car1.getfuel_capacity());
       System.out.println("four wheeler mileage: "+car1.getmileage());
       
        System.out.printf("\n");
       
       four_wheeler car2= new four_wheeler("Force motors","Force Gurkha","electrical engine",40,16);
        System.out.println("four wheeler company: "+car2.getcompany());
     System.out.println("four wheeler model: "+car2.getmodel());
      System.out.println("four wheeler enginetype: "+car2.getengine_type());
       System.out.println("four wheeler fuel_capacity: "+car2.getfuel_capacity());
       System.out.println("four wheeler mileage: "+car2.getmileage());
   }

}
