import java.util.*;

class FoodItem
{

  private String name;
  private int price; 
 
  //setters and getters

  public void setname(String name)
  { 
    this.name = name;
  }

  public String getname()
   {
     return name;
   }

  public void setprice(int price)
   { 
      this.price = price;
   }

  public int getprice()
   { 
      return price;
   }

}



public class Food_Item_Price_Comparison
{
  public static void main(String ss[])
  { 
    FoodItem fi[] = new FoodItem[2];
    
    for(int i=0;i<fi.length;i++)
     { 
       fi[i] = new FoodItem();

       Scanner sc = new Scanner(System.in);

       String name = sc.nextLine();
       int price = sc.nextInt(); 
 
       //set the values in object

       fi[i].setname(name);
       fi[i].setprice(price);
     } 

     
     // Compare their prices and print the name of the cheaper food item.

      if(fi[0] .getprice() > fi[1].getprice() )
       { 
         String name = fi[0].getname();
         System.out.println( "Name of the food item who has cheaper price ----- >" + name);
       }
 
      else if(fi[0] .getprice() < fi[1].getprice())
       { 
          String name = fi[1].getname();
          System.out.println(" Name of the food item who has cheaper price ----- >  " + name);
       }   

      else 
        { 
           System.out.println(" Both have same prices ");
        }
     
  } 
}