import java.util.*;

class Product
{
  private int id;
  private String name;
  private int rate;
  private int qty;
  private String companyname;

  
 //setters and getters

  public void setid(int id)
   { 
     this.id = id;
   }

  public int getid()
   { 
     return id;
   }

  public void setname(String name)
   {
     this.name = name;
   }

  public String getname()
   {
     return name;
   }

  public void setrate(int rate)
  {  
     this.rate = rate;
  }

  public int getrate()
   {
     return rate;
   }

  public void setqty(int qty)
   { 
      this.qty = qty;
   }

   public int getqty()
    {   
       return qty;
    }

  public void setcompanyname(String companyname) 
   { 
      this.companyname = companyname;
   }

 public String getcompanyname()
  {   
     return companyname; 
  }

}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////


class Customer
{
  private int id;
  private String name;
  private String email;
  private int contact;
  private String address;


  //setters and getters

  public void setid(int id)
  {    
    this.id = id;
  }

  public int getid()
  {  
    return id;
  }

  public void setname(String name)
  { 
    this.name = name;
  }

  public String getname()
  {  
     return name;
  }

  public void setemail(String email)
   { 
     this.email = email;
   }

  public String getemail()
  {  
     return email;
  }

  public void setcontact(int contact)
   { 
     this.contact  = contact;
   }

  public int getcontact()
   { 
     return contact;
   }

  public void setaddress(String address)
   { 
      this.address = address;
   } 

 public String getaddress()
  { 
     return address;
  }



}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



class Shop
{
 Scanner sc = new Scanner(System.in);

  private Product pr[];

  void addProducts(Product ...p)
   { 
     this.pr = p;
   }
 

   void getProducts()
    {  
       for(int i=0;i<pr.length;i++)
        { 
          String name = pr[i].getname();
          int rate = pr[i].getrate();
          int qty = pr[i].getqty();

          System.out.println(" name " + name + " rate "  + rate + " qty "+ qty);
          
        } 
    }

 
   void calBill(Customer cust , Product ...p)
    { 
         int grandtotal = 0;

        
        
         System.out.println(" Enter Customer information ");


         System.out.println("Enter id");
         int id = sc.nextInt();

         sc.nextLine();
         System.out.println(" Enter name ");
         String name = sc.nextLine();
         
         System.out.println("Enter email");
         String email = sc.nextLine();
         System.out.println("Enter contact no");
         int contact = sc.nextInt();
         sc.nextLine();
         System.out.println("Address");
         String address = sc.nextLine();


         cust.setid(id);
         cust.setname(name);
         cust.setemail(email);
         cust.setcontact(contact);
         cust.setaddress(address);


         System.out.println("--------------------------------------------------------------------------");


  


        System.out.println(" customer name : " + cust.getname()  + " customer address : " + cust.getaddress()  + " customer email : " + cust.getemail() );



        // display the product information...................................

 

        System.out.println("product name   " + "  qty   " + "    rate    " + "   Total   ");
        for(int i=0;i<pr.length;i++)
         { 
            String namep = pr[i].getname();
            int qtp = pr[i].getqty();
            int rp = pr[i].getrate();

            int total  = qtp * rp;

            System.out.println( namep+ "             "  +    qtp  + "            " + rp +  "              " + total );
         }

 
         System.out.println("--------------------------------------------------------------------------");



       // calculate the grand total............................................



     for(int i=0;i<pr.length;i++)
      {   
    
       int rate = pr[i].getrate();
       int qty = pr[i].getqty();

       int total = rate * qty;

       grandtotal = grandtotal + total;
      }

     System.out.println("                           grandtotal " + grandtotal);

     }



}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




public class Billing_Application
{
   public static void main(String ss[])
   {
      Scanner sc = new Scanner(System.in);   
 
      Product p[] = new Product[2];

      
      for(int i=0;i<p.length;i++)
       { 
          p[i] = new Product();

          

          System.out.println(" Enter product information ");
          int id = sc.nextInt();
          sc.nextLine();
          String name = sc.nextLine();
          int rate = sc.nextInt();
          int qty = sc.nextInt();
          sc.nextLine();
          String companyname = sc.nextLine();


          p[i].setid(id);
          p[i].setname(name);
          p[i].setrate(rate);
          p[i].setqty(qty);
          p[i].setcompanyname(companyname);

       }

  
    
     Shop sh = new Shop();

     Customer cus = new Customer();


     sh.addProducts(p);

     sh.calBill(cus,p);



   }
}