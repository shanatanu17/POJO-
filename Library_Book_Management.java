/* 
1.  Library Book Management
Task:
 Create a Book class with fields: title, author, and price.
 In the main method:
Create two individual Book objects.
Compare the prices of the two books and print the title of the more expensive book.
Explanation:
 This task teaches object instantiation and accessing instance variables directly to perform comparisons.
*/




import java.util.*;

class Book
{
   private String title;
   private String author;
   private int price;

  
   // setters and getters
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







public class Library_Book_Management
{
  public static void main(String ss[])
   { 
    
     Book bk[] = new Book[2];

     for(int i=0;i<bk.length;i++)
      {  
        bk[i] = new Book();

        Scanner sc = new Scanner(System.in);
   
        System.out.println("Enter the values for the " + (i+1) +" book ");
        String title = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();

        bk[i].settitle(title);
        bk[i].setauthor(author);
        bk[i].setprice(price);
      }

      
  
      //Compare the prices of book and display it

       if(bk[0].getprice() > bk[1].getprice())
        { 
           System.out.println("1 st book has higher price " + bk[0].getprice());
        }
       else if(bk[0].getprice() < bk[1].getprice())
        { 
           System.out.println("2 nd book has higher price " + bk[1].getprice());
        }
       else
        { 
           System.out.println("both books have same price ");
        }
 
        
    
     

    
     
     
     

 
   }




}