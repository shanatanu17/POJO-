/*
Q2. Product Inventory Management
Create a POJO class Product with fields: id, name, category, price, quantity.
Create a Store class that holds multiple Product objects (var-args).
Implement operations:


Add Product Details.
Show All Product Details.
Search Product Using:
id
name
Delete Product Using:
category
price < 100.
Update Product Using:
id → update quantity.
name → update price.
Sort Products:
By id ascending.
By price descending.
Display most expensive product.
Display products with price range 1000–5000.
Exit.
*/


import java.util.*;


class Product
{
  private int id;
  private String name;
  private String category;
  private int price;
  private int quantity;


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

  public void setcategory(String category)
   { 
     this.category = category;
   }

  public String getcategory()
   { 
     return category;
   }

  public void setprice(int price)
   {
     this.price = price;
   }

  public int getprice()
   { 
     return price;
   } 

  public void setquantity(int quantity)
   { 
     this.quantity = quantity;
   }
 
  public int getquantity()
   { 
     return quantity;
   }

}



public class Product_Inventory_Management
{
  public static void main(String ss[])
   { 
      Scanner sc = new Scanner(System.in);
 
      Product p[] = new Product[3];


   int choice;


   do
    {
 
     System.out.println("1 . Add Product Details.");
     System.out.println("2 . Show All Product Details ");
     System.out.println("3.  Search Product Using: id");
     System.out.println("4 . Search Product Using : name ");
     System.out.println("5 . Delete Product Using: category ");
     System.out.println("6. Delete Product Using : price < 100.  ");
     System.out.println("7 .Update Product Using: id → update quantity.  "); 
     System.out.println("8 . Update Product Using: name → update price. ");
     System.out.println("9 . Sort Products: By id ascending. ");
     System.out.println("10. Sort Products: By price descending. ");
     System.out.println("11 . Display most expensive product");
     System.out.println("12 . Display products with price range 1000–5000.");
     System.out.println("13 . Exit");


    System.out.println("Enter the choice");
    choice = sc.nextInt();
    sc.nextLine();

 
      
  switch(choice)
   { 

    
      case 1:

      // 1  .Add Product Details.

      for(int i=0;i<p.length;i++)
       { 
         p[i] = new Product();

         System.out.println("Enter the product "+ (i+1)  + " information ");
         p[i].setid(sc.nextInt());
         sc.nextLine();
         p[i].setname(sc.nextLine());
         p[i].setcategory(sc.nextLine()); 
         p[i].setprice(sc.nextInt());
         p[i].setquantity(sc.nextInt());
       } 


       break;


      case 2:


      // 2 . Show All Product Details.


       for(int i=0;i<p.length;i++)
        {
         if(p[i] != null)
          {
        
            System.out.print(" id = " + p[i].getid() + " name = " + p[i].getname() + " category = " + p[i].getcategory()  + " price = " + p[i].getprice() + " quantity = " + p[i].getquantity() );
            System.out.println();

         }
        }


       break;


      case 3:


      // 3 . Search Product Using: --------- >    id 


      System.out.println("Enter product id to search ");
      int iddd = sc.nextInt();

      int flag = 0;

  
       for(int i =0;i<p.length;i++)
        { 
          if(p[i] != null && p[i].getid() == iddd)
           { 
              System.out.println("Found the product ");
              System.out.print(" name = " + p[i].getname() + " category = " + p[i].getcategory() + " price = " + p[i].getprice() + " quantity = "  + p[i].getquantity() );
              flag = 1;
              System.out.println();
              break;
           }
        } 

 
        if(flag == 0)
          {
             System.out.println("Product with the given id in not present in records ");
          }


        break;


        case 4:


   
        // 4 . Search Product Using:  name


       System.out.println("Enter the product name to search ");
       String n = sc.nextLine();
       int fla = 0;
     
       for(int i=0;i<p.length;i++)
        { 
          if( p[i] != null  &&  p[i].getname().equals(n))     
           { 
              System.out.println("Found the product ");
              System.out.print(" name = " + p[i].getname() + " category = " + p[i].getcategory() + " price = " + p[i].getprice() + " quantity = "  + p[i].getquantity() );
              fla = 1;
              System.out.println();
              break;
              
           }    
        }

  
        if(fla == 0)
          {
             System.out.println("Product with the given id in not present in records ");
          }


        break;


       case 5:

         
        // 5  . Delete Product Using:  category

  
  
        System.out.println(" Enter the category of the product for deletion  ");
        String cat = sc.nextLine();
        int fl = 0;

 
        for(int i=0;i<p.length;i++)
         { 
           if(p[i] != null && p[i].getcategory().equals(cat))
            { 
              for(int j = i; j < p.length-1 ;j++ )
               { 
                 p[j] = p[j+1];
               }
           
              fl = 1;
              p[p.length-1] = null;

            }
         }
 
       if(fl == 0)
        { 
          System.out.println(" These category product is not present in records  ");
        }
  
      else
       {
         System.out.println("Product successfully deleted ");
       }


       break;


       case 6:


        
       // 6 . Delete Product Using: price < 100.

          int f = 0;

          for(int i=0;i<p.length;i++)
           {  
             if(p[i] != null  &&  p[i].getprice() < 100)
              { 
                for(int j = i; j < p.length-1 ; j++)
                 { 
                    p[j] = p[j+1];
                 }
 
                f = 1;
                p[p.length-1] = null;
              }

           } 

       if(f == 0)
       { 
         System.out.println(" product  with price less than 100 not present in records ");
       }
       else
        {
          System.out.println("Product successfully deleted ");
        }

 
        break;


       case 7:


 
       // 7  .Update Product Using: id → update quantity.
 
 
      System.out.println("Enter the id to update its details "); 
      int idd = sc.nextInt();
      sc.nextLine();
      int ff = 0;

 
      for(int i=0;i<p.length;i++)
       {  
         if(p[i] != null  &&  p[i].getid() == idd )
          { 
             System.out.println("Enter a new quantity value to enter ");
             p[i].setquantity(sc.nextInt());
             ff = 1;
          }
         System.out.println(" Successfully updated ");
       }

     if(ff == 0)
      { 
         System.out.println(" THis id product is not present in records ");
      }


      break;


       case 8:


 
     // 8 . Update Product Using: name → update price.



      System.out.println("Enter the name to update its details "); 
      
      String na = sc.nextLine();
      int ffl = 0;

 
      for(int i=0;i<p.length;i++)
       {  
         if(p[i] != null  &&   p[i].getname().equals(na) )
          { 
             System.out.println("Enter a new price value to enter ");
             p[i].setprice(sc.nextInt());
             ffl = 1;
          }
         System.out.println(" Successfully updated ");
       }

     if(ffl == 0)
      { 
         System.out.println(" THis id product is not present in records ");
      }


      break;


      case 9:



     // 9 . Sort Products:  By id ascending.

     Product copy[] = new Product[p.length];

     
     for(int i=0;i<p.length;i++)
      { 
         copy[i] = p[i];
      }

 
     for(int i=0;i<copy.length;i++)
      {  
        for(int j = i; j < copy.length-1; j++)
         { 
           if(p[j] != null && p[j].getid() > p[j+1].getid())
             { 
               Product temp  = copy[j];
               copy[j] = copy[j+1];
               copy[j+1] = temp;
             }
         }
      }


    System.out.println("Records after sorting by id ");
    for(int i=0;i<copy.length;i++)
     { 
        System.out.print(" id = " + copy[i].getid()  + " name = " + copy[i].getname() + " category =  "   + " category = "   + copy[i].getcategory()  + " price =  " + copy[i].getprice()  + " quantity = "  +  copy[i].getquantity() );
        System.out.println();
     }
 

     break;


     case 10:



    // 10 . Sort Products : By price descending.


   
    Product copyy[] = new Product[p.length];

     
     for(int i=0;i<p.length;i++)
      { 
         copyy[i] = p[i];
      }

 
     for(int i=0;i<copyy.length;i++)
      {  
        for(int j = i; j < copyy.length-1; j++)
         { 
           if(copyy[j].getprice() <  copyy[j+1].getprice())
             { 
               Product temp  = copyy[j];
               copyy[j] = copyy[j+1];
               copyy[j+1] = temp;
             }
         }
      }


    System.out.println("Records after sorting by price ");
    for(int i=0;i<copyy.length;i++)
     { 
        System.out.print(" id = " + copyy[i].getid()  + " name = " + copyy[i].getname()  + " category = "   + copyy[i].getcategory()  + " price =  " + copyy[i].getprice()  + " quantity = "  +  copyy[i].getquantity() );
        System.out.println();
     }


      break;


     case 11:

 

     // 11 . Display most expensive product.

      int maxprice = 0; 
      int ii = 0;
      String nn = " "; 
      String ca = " ";
      int pri = 0;
      int qua = 0;



      for(int i= 0; i < p.length;i++)
       {
         if(p[i] != null  &&  p[i].getprice() > maxprice )
           { 
              maxprice = p[i].getprice();
              ii = p[i].getid();
              nn = p[i].getname();
              ca = p[i].getcategory(); 
              pri = p[i].getprice(); 
              qua = p[i].getquantity();
           }
       }

 
     System.out.println("Details of most expensive product "); 
         System.out.print(" id = "+  ii  + " name = " + nn + " category =  "  + ca  + " price =  " + pri  + " quantity = "  +  qua );
         System.out.println();



      break;


    case 12:


     // 12 . Display products with price range 1000–5000.

     int fll = 0;

 
     for(int i=0;i<p.length;i++)
      { 
         if(p[i] != null   &&   p[i].getprice() > 1000  && p[i].getprice() < 5000)
          { 
             fll = 1;
             System.out.print(" id = " + p[i].getid()  + " name = " + p[i].getname()  + " category = " + p[i].getcategory()  + " price = " + p[i].getprice()  + " quantity = " + p[i].getquantity() );
             System.out.println();
          }
      }


     if(fll == 0)
      { 
         System.out.println(" NO products with price range 1000–5000  ");
      }


    break;


      

    // 13 . Exit.




   } 




 }while(choice < 13); 

 


 
 
   }

}





















































