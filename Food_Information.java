/*
Q5. Problem  
Write a java to Create class name as Food with using data member   fid,fname,fprice, fcategory using do while and switch case.
create array of object of size 5 ,store the food details in it and perform following operations.
	
	1 : Add All Food details.
	2 : Display All Food details.
	3 : Display Bill Details :
		1 :  Bill Without Gst.
		2 : Bill With 18% Gst.

*/

import java.util.*;


class Food
{
  private int fid;
  private String fname;
  private int fprice;
  private String fcategory;

 
  //setters and getters

  public void setfid(int fid)
   {
      this.fid = fid;
   }

  public int getfid()
   {
      return fid;
   }

  public void setfname(String fname)
  { 
    this.fname = fname;
  }

  public String getfname()
  { 
    return fname;
  }

  public void setfprice(int fprice)
   { 
     this.fprice = fprice;
   }

  public int getfprice()
   {
     return fprice;
   }

  public void setfcategory(String fcategory)
   { 
     this.fcategory = fcategory;
   }

  public String getfcategory()
   { 
      return fcategory;
   }

}






public class Food_Information
{
   public static void main(String ss[])
   { 

      Scanner sc = new Scanner(System.in);

      System.out.println(" ----------------------------------------------------------------------------------  ");

      // 1 : Add All Food details.

      Food fo[] = new Food[2];

      for(int i=0;i<fo.length;i++)
       { 
 
          fo[i] = new Food();
 
          System.out.println("Enter the food " + (i+1)  + " Information ");

          fo[i].setfid(sc.nextInt());
          sc.nextLine();
          fo[i].setfname(sc.nextLine());
          fo[i].setfprice(sc.nextInt());
          sc.nextLine();
          fo[i].setfcategory(sc.nextLine());
       
       }


      System.out.println(" ----------------------------------------------------------------------------------  ");



 
     // 2 : Display All Food details.
 
 
       for(int i=0;i<fo.length;i++)
        { 
           System.out.print("fid = "+ fo[i].getfid() +  "name = " + fo[i].getfname() + " fprice = " + fo[i].getfprice()  + " fcategory = " + fo[i].getfcategory() );
           System.out.println();  
         }

 
     System.out.println(" ----------------------------------------------------------------------------------  ");
 
 
    //3 : Display Bill Details :
		//1 :  Bill Without Gst.
		 //  2 : Bill With 18% Gst.


         
         //3.1    Bill without gst
 

         int totalbill = 0;

         for(int i=0;i<fo.length;i++)
          {  
             totalbill = totalbill + fo[i].getfprice();
          } 

         System.out.println("Total bill made without GST is " + totalbill );


      System.out.println(" ----------------------------------------------------------------------------------  ");


       
         //3.2   Bill with 18 %  GST


         int totalbillwithgst = totalbill + totalbill * 18/100;

         System.out.println(" Total bill made with GST is " + totalbillwithgst );

 
     System.out.println(" ----------------------------------------------------------------------------------  ");
 
          

 
 
 
 

 
 
 
   }

}