/*
8. Vehicle Fuel Efficiency
Task:
 Create a Vehicle class with fields: model, mileage, and fuelCapacity.
 In the main method:
Create a Vehicle object.
Calculate how far the vehicle can travel (mileage * fuelCapacity) and print the result.
Explanation:
 This reinforces using object fields for calculations.
*/



import java.util.*;

class Vehicle
{
  private String model;
  private int mileage;
  private int fuelCapacity;
 
  
  //setters and getters

  public void setmodel(String model)
   { 
      this.model = model;
   }

  public String getname()
   { 
     return model;
   }

  public void setmileage(int mileage)
  { 
    this.mileage = mileage;
  }

  public int getmileage()
  {    
    return mileage;
  }

  public void setfuelCapacity(int fuelCapacity)
  {  
    this.fuelCapacity = fuelCapacity;
  }

  public int getfuelCapacity()
   { 
     return fuelCapacity;
   }
  



}




public class Vehicle_Fuel_Efficiency
{
  public static void main(String ss[])
   { 
     Vehicle vh[] = new Vehicle[3];

     for(int i=0;i<vh.length;i++)
      { 
        vh[i] = new Vehicle();

        Scanner sc = new Scanner(System.in); 
 
        String model = sc.nextLine(); 
        int mileage = sc.nextInt();
        int fuelCapacity = sc.nextInt();


        vh[i].setmodel(model);
        vh[i].setmileage(mileage);
        vh[i].setfuelCapacity(fuelCapacity);

      }
 
       
     // display

     for(int i=0;i<vh.length;i++)
      { 
        int mileage = vh[i].getmileage();
        int fuelCapacity = vh[i].getfuelCapacity();

        int travel = mileage * fuelCapacity;

        System.out.println("Bike can travel around "  + travel);
      }
       


   }

}
