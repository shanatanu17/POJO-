/*

9. Product Discount Calculation
Task:
 Create a Product class with fields: name, price, and discountPercentage.
 In the main method:
Create a Product object.
Calculate the discounted price and print the result.
Explanation:
 This teaches applying percentages and using object fields.

*/

import java.util.*;

class Product
{
   private String name;
   private int price;
   private int discountPercentage;

   //getters and setters

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

  public void setdiscountPercentage(int discountPercentage)
   { 
     this.discountPercentage = discountPercentage;
   }

  public int getdiscountPercentage()
   { 
     return discountPercentage;
   }
 
  


}


public class Product_Discount_Calculation
{
 public static void main(String ss[])
  { 
     Product pd[] = new Product[3];

     for(int i=0;i<pd.length;i++)
      { 
         pd[i] = new Product();

         Scanner sc = new Scanner(System.in);

         String name = sc.nextLine();
         int price = sc.nextInt();
         int discountPercentage = sc.nextInt();

         
         pd[i].setname(name);
         pd[i].setprice(price);
         pd[i].setdiscountPercentage(discountPercentage);

      }


      //display now

       for(int i=0;i<pd.length;i++)
        { 
          int price = pd[i].getprice(); 
          int discountpercent = pd[i].getdiscountPercentage();

          int discount = (price * discountpercent ) / 100;

          int finalvalue = price - discount;

          System.out.println("Final op " + finalvalue);
 
  
  
        }
  
 
 
  } 




}