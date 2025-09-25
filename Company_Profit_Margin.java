/*

5. Company Profit Margin
Task:
 Create a Company class with fields: companyName, revenue, and expenses.
 In the main method:
Create a Company object.
Calculate the profit margin (profit/revenue) and display the result.

*/






import java.util.*;

class Company
{
  private String companyname;
  private int revenue;
  private int expenses;

  //setters anf getters

  public void setcompanyname(String companyname)
   { 
     this.companyname = companyname; 
   }

  public String getcompanyname()
   {
     return companyname;
   }

  public void setrevenue(int revenue)
   { 
      this.revenue = revenue;
   }

  public int getrevenue()
   { 
     return revenue;
   }

   public void setexpnses(int expenses)
    {
      this.expenses = expenses;
    }
  
   public int getexpnses()
    { 
      return expenses;
    }
 

}





public class Company_Profit_Margin
{
  public static void main(String ss[])
   {  
      Company com[] = new Company[1];

      for(int i=0;i<com.length;i++)
       {   
         com[i] = new Company();
        
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the information for " + (i+1) + " object ");
         String companyname = sc.nextLine(); 
         int revenue = sc.nextInt();
         int expenses = sc.nextInt();

         
         com[i].setcompanyname(companyname);
         com[i].setrevenue(revenue);
         com[i].setexpnses(expenses);

       } 


       //Calculate the profit margin (profit/revenue) and display the result.

       int profit  = com[0].getrevenue() - com[0].getexpnses();

       int profit_margin =  profit * 100 / com[0].getrevenue() ;

       System.out.println("Profit margin for the company is "  + profit_margin);

 
      
 

 
 
   }
 
 
 

 
}
