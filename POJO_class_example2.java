class Information
{
  private String name;
  private int price;
  private String color;
  private String shape;


  // public getters and setters now

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


  public void setcolor(String color)
  {
    this.color = color;
  }

  public String getcolor()
  { 
    return color;
  }

  
  public void setshape(String shape)
   { 
     this.shape = shape;
   } 

  public String getshape()
   {
    return shape;
   }

} 


class StoreInformation
{
  
  // set values in POJO class object

  private Information in;

  void addElement(Information in)
   { 
     this.in = in;
   }

   
   void showdata()
    {  
       String name = in.getname();      
       int price = in.getprice();
       String color = in.getcolor();
       String shape = in.getshape();

       System.out.println("Name- " + name  + " price " + price + " color " + color + " shape " + shape  );
    }
}





public class POJO_class_example2
{
  public static void main(String ss[])
   {
      Information in = new Information();

      

      StoreInformation si = new StoreInformation();

      in.setname("Mobile");
      in.setprice(10000);
      in.setcolor("Red");
      in.setshape("Rectangle");

      si.addElement(in);
      si.showdata();
      
      



 
 

   }




}