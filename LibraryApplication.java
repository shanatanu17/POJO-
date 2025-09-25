// Example of POJO class.....

class Book
{
  // POJO class
 
  private int id;
  private String name;
  private String author;

 
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

  public void setauthor(String author)
   {
     this.author = author; 
   } 

  public String getauthor()
   {
     return author;
   }

}


class Library
{

  // array of reference
  private Book book[];

  void addbook(Book ...b)
   { 
      book = b;
   }

 
  void showdata()
   { 
      // loop
      for(int i=0;i<book.length;i++)
        { 
           int id = book[i].getid();
           String name = book[i].getname();
           String author = book[i].getauthor();

           System.out.println(" id-" + id + " name -"+ name + " author- " + author);
        } 
   }

  




}


public class LibraryApplication
{
  public static void main(String ss[])
   { 

      Library l = new Library();

      Book b1 = new Book();

      // set values
      b1.setid(1);
      b1.setname("Good Morning");
      b1.setauthor("B.G.Tilak");


      Book b2 = new Book();

      b2.setid(2);
      b2.setname("Great");
      b2.setauthor("V.S.khandekar");

      Book b3 = new Book();

      b3.setid(3);
      b3.setname("My king");
      b3.setauthor("P.L.Deshpande");

      l.addbook(b1,b2,b3);
      l.showdata();

      


      
  
 
 
   }
}