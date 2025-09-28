/*
Q1. Create a class called Library to hold accession number,title of the book,author name,price of the book and write a menu driven program in java that implements the working of a library :
		The menu options should be: 
		1. Add Book Details.
		2. Display All Book Details.
		3. Display List of all book of given author.
		4. Display list the title of specified book.
		5. Display list count of the book in the library.
		6. Display list the books in the ascending order of accession number.
		7. Update book details by title of book.
		8. Delete book details by price.
		9. Display the price range between 100 to 500.
		10. Exit The Code.
*/


import java.util.*;


class Library
{
  private int accno;
  private String title;
  private String author;
  private int price;

 
  //setters and getters

  public void setaccno(int accno)
   { 
     this.accno = accno;
   }

  public int getaccno()
   {
      return accno;
   }

  public void settitle(String title)
   {
      this.title = title;
   }

  public String gettitle()
   {
     return title;
   }

  public void setauthor(String author)
   { 
     this.author = author;
   } 

  public String getauthor()
   { 
      return author;
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



public class Library_Management
{
  public static void main(String ss[])
   { 

       Scanner sc = new Scanner(System.in);


       Library li[] = new Library[2];

 
      int choice;

do {


   System.out.println("1. Add Book Details ");
   System.out.println("2. Display All Book Details.");
   System.out.println("3. Display List of all book of given author.");
   System.out.println("4. Display list the title of specified book.");
   System.out.println("5. Display list count of the book in the library.");
   System.out.println("6. Display list the books in the ascending order of accession number.");
   System.out.println("7. Update book details by title of book.");
   System.out.println("8. 8. Delete book details by price.");
   System.out.println("9. Display the price range between 100 to 500.");
   System.out.println("10. Exit The Code.");


  System.out.println("Enter a choice");
   choice = sc.nextInt();

  switch(choice)
   {
   


     case 1:

     //  1. Add Book Details.


       for(int i=0;i<li.length;i++)
         { 
            li[i] = new Library();
 
            System.out.println(" Enter the book information ");
 
            li[i].setaccno(sc.nextInt());
            sc.nextLine();
            li[i].settitle(sc.nextLine());
            li[i].setauthor(sc.nextLine());
            li[i].setprice(sc.nextInt());
         }
       break;

    
     case 2:


  
         //2 . Display All Book Details.


        for(int i=0;i<li.length;i++)
         { 
          if(li[i] != null)
           {  
            System.out.print(" Accno = " + li[i].getaccno()  + " title =  "+ li[i].gettitle() + " author = " + li[i].getauthor() + " price = " + li[i].getprice()  );
            System.out.println();
            }
         }
      break;


    
     case 3:
      

   //  3. Display List of all book of given author.


           System.out.println("Enter the name of author");
           sc.nextLine();
           String author = sc.nextLine();

           for(int i=0;i<li.length;i++)
         { 
            if(li[i].getauthor().equals(author) )
             { 
                System.out.print( " Accno =  "  +  li[i].getaccno()  +  " title =  " + li[i].gettitle()   + " author = " + li[i].getauthor() + " price = " + li[i].getprice() );
                System.out.println();
             } 
         } 


     break;



   case 4:
  

        // 4 . Display list the title of specified book.

 
        System.out.println(" Enter the title of the book ");

        sc.nextLine();
        String title = sc.nextLine();
 
 
        for(int i=0;i<li.length;i++)
         { 
            if(li[i].gettitle().equals(title))
              { 
                System.out.print( " Accno =  "  +  li[i].getaccno()  +  " title =  " + li[i].gettitle()   + " author = " + li[i].getauthor() + " price = " + li[i].getprice() );
                System.out.println();
              }
         }

  
        break;


     case 5:


    
     // 5 .  Display list count of the book in the library.

    
  
       int count = 0;

       for(int i=0;i<li.length;i++)
        { 
           count++; 
        }
 
       System.out.println("Total no of books in library are " + count );


    break;



    case 6:


     // 6 . Display list the books in the ascending order of accession number.



      Library copy[] = new Library[li.length];

      for(int i=0;i<li.length;i++)
       {   
          copy[i] = li[i];
       }     




      // sort in ascending order............
      for(int i=0;i<copy.length;i++)
        { 
           for(int j=i;j<copy.length-1;j++)
            { 
               if(copy[j].getaccno() > copy[j+1].getaccno() )
                 { 
                    Library temp = copy[j];
                    copy[j] = copy[j+1];
                    copy[j+1] = temp;
                 }
            }
        }


      // print it

       for(int i=0;i<copy.length;i++)
        { 
          System.out.print( " Accno =  "  +  copy[i].getaccno()  +  " title =  " + copy[i].gettitle()   + " author = " + copy[i].getauthor() + " price = " + copy[i].getprice() );
                System.out.println();

        }
      

      break;


       
      case 7:

 

      // 7 . Update book details by title of book.


 
       System.out.println(" Update the book details  ");
       System.out.println("Enter the title of the book you want to Update ");
       sc.nextLine();
       String title1 = sc.nextLine();


       for(int i=0;i<li.length;i++)
        { 
           if(li[i].gettitle().equals(title1) )
            { 
               System.out.println("Enter the updated information for book"); 
               li[i].setaccno(sc.nextInt());
               sc.nextLine(); 
               li[i].settitle(sc.nextLine());
               li[i].setauthor(sc.nextLine());
               li[i].setprice(sc.nextInt());
            }

           System.out.println("Book details successfully updated ");
        }


      break;


      case 8:


  
      //8. Delete book details by price.


       System.out.println("Enter the price of the book you want to delete ");

       int price = sc.nextInt();

       for(int i=0;i<li.length ;i++)
        { 
           if( li[i] != null   &&   li[i].getprice() == price)
            {
                for(int j = i;j<li.length - 1;j++)
                 { 
                   li[j] = li[j+1];
                 }
                li[li.length-1] = null;
                System.out.println(" Book deleted successfully ");
                break;
            } 
        }

       
       break;


       case 9:


        // 9. Display the price range between 100 to 500.


  
       for(int i=0;i<li.length;i++)
        {  
           if(li[i].getprice() > 100 && li[i].getprice() < 500 ) 
            {  
               System.out.print( " Accno =  "  +  li[i].getaccno()  +  " title =  " + li[i].gettitle()   + " author = " + li[i].getauthor() + " price = " + li[i].getprice() );
               System.out.println();
            }
        }


        break;


 
        // 10. Exit The Code.





  }

 

 }while(choice < 10);
      



   }
}