/*
Q3. Problem:
Create a POJO class Car with fields: carId, model, fuelConsumed, and distanceTravelled. Store details of 5 cars using an array of objects. Perform the following operations:
Calculate the mileage of each car (mileage = distanceTravelled / fuelConsumed).
Find the car with the best mileage.
Display cars whose mileage is above the average mileage of all cars.
Why?
 Here you apply formula-based computation + comparison + filtering, just like the employee salary example, but with a different real-world scenario.
*/


import java.util.*;

class Car
{
  private int carid;
  private String model;
  private int fuelconsume;
  private int distancetravelled;

  //setters and getters

  public void setcarid(int carid)
   { 
     this.carid = carid;
   } 

  public int getcarid()
   {
     return carid;
   } 

  public void setmodel(String model)
   {
      this.model = model;
   }

  public String getmodel()
   { 
     return model;
   }

  public void setfuelconsume(int fuelconsume)
   {
     this.fuelconsume = fuelconsume;
   }

  public int getfuelconsume()
   {
     return fuelconsume;
   }

  public void setdistancetravelled(int distancetravelled) 
   {
      this.distancetravelled = distancetravelled;
   } 

  public int getdistancetravelled()
   { 
     return distancetravelled;
   }

 
}








public class Car_Information
{
  public static void main(String ss[])
  {  
    Car c[] = new Car[5];

    Scanner sc = new Scanner(System.in);

    for(int i=0;i<c.length;i++)
     { 
       c[i] = new Car();

       System.out.println(" Enter the car " + (i+1)  + " information ");

       c[i].setcarid(sc.nextInt());
       sc.nextLine();
       c[i].setmodel(sc.nextLine());
       c[i].setfuelconsume(sc.nextInt());
       c[i].setdistancetravelled(sc.nextInt()); 
     }


    //1 . Calculate the mileage of each car (mileage = distanceTravelled / fuelConsumed).

  
     for(int i=0;i<c.length;i++)
      { 
         int dt = c[i].getdistancetravelled();
         int fc = c[i].getfuelconsume();

         int milage = dt / fc;

         System.out.println("Milage of " + (i+1) + " car "  +  milage);
      }

    System.out.println(" ----------------------------------------------------------------------------------- " );

   


     //2. Find the car with the best mileage.

   
     int bestmilege = 0;
     int id = 0;
     String n = " ";

     for(int i=0;i<c.length;i++)
     { 
        int dt = c[i].getdistancetravelled();
        int fc = c[i].getfuelconsume();

        int mil = dt / fc;

        if(mil > bestmilege) 
          { 
            bestmilege = mil;
            id = c[i].getcarid();
            n = c[i].getmodel();
          }
     }

     System.out.println( " Car information who has maximum milege " );
     System.out.println( " id = " + id + " Model  = " + n );


    System.out.println(" -----------------------------------------------------------------------------------  " );



    //3 . Display cars whose mileage is above the average mileage of all cars.


      int avgmilege = 0;
      int totalmilege = 0;

      for(int i=0;i<c.length;i++)
       { 
         int milege = c[i].getdistancetravelled() / c[i].getfuelconsume();
         totalmilege = totalmilege + milege;
       }
s
      avgmilege = totalmilege / c.length;

      
      int carid = 0;
      String model = ""; 
      int milege = 0;   
   
      for(int i=0;i<c.length;i++)
       { 
         milege = c[i].getdistancetravelled() / c[i].getfuelconsume();
          
         if(milege > avgmilege)
          {
             carid = c[i].getcarid();
             model = c[i].getmodel(); 

             System.out.println(" Cars whose mileage is above the average mileage of all cars. ");
             System.out.println( " carid = " +  carid +  " Model  = "  +  model);

          }

         
       } 

 
 
  }

}