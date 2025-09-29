/*

Q1. Student Management System
Create a POJO class Student with fields: id, name, email, contact, course, marks.
Create a College class, pass multiple Student objects using var-args.
Implement operations in the main class:

Add Student Details.
Show All Student Details.
Search Student Using:
id
name
Delete Student Using:


email
marks < 40 (failed students).


Update Student Using:
id → update course.
name → update contact.


Sort Students:
By id ascending.
By marks descending.
Display the topper (highest marks).
Display students with marks between 50–80.
Exit.


*/






import java.util.*;


class Student
{
  private int id;
  private String name;
  private String email;
  private int contact;
  private String course;
  private int marks;


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
 
  public void setcontact(int contact)
  {  
    this.contact = contact;
  }

  public int getcontact()
   { 
     return contact;
   }


  public void setemail(String email)
  { 
    this.email = email;
  }

 public String getemail()
  { 
    return email;
  } 

 public void setcourse(String course)
  { 
    this.course = course;
  }

 public String getcourse()
  { 
     return course;
  } 

 public void setmarks(int marks)
  {
    this.marks = marks;
  }

 public int getmarks()
 { 
    return marks;   
 }
 

}




class College
{
   private Student students[];

   public void addstudent(Student ...s)
    {
      students = s;
    }

 
  public Student[] getstudent()
   {  
      return students;
   }

}







public class  Student_Management_System
{
  public static void main(String ss[])
   {  
     Scanner sc = new Scanner(System.in);

     College c = new College();


int choice;

do
 {

   System.out.println("1. Add Student Details.");
   System.out.println("2 . Show All Student Details .");
   System.out.println("3 . Search Student Using : id ");
   System.out.println("4 . Search Student Using : name ");
   System.out.println("5 . Delete Student Using : email ");
   System.out.println("6 . Delete Student Using : marks < 40 (failed students). ");
   System.out.println("7 . Update Student Using : id → update course.");
   System.out.println("8 . Update Student Using : name → update contact. ");
   System.out.println("9 . Sort Students : By id ascending. ");
   System.out.println("10 . By marks descending  ");
   System.out.println("11 . Display the topper (highest marks)");
   System.out.println("12. Display students with marks between 50–80. ");

  
   System.out.println("Enter the choice ");
   choice = sc.nextInt();
     

  
 switch(choice)
   {

 
 
    case 1:
 
     //1 . Add Student Details.

     System.out.println("Enter the no of students you want to enter");
     int n = sc.nextInt();
     Student s[] = new Student[n];

   for(int i=0;i<s.length;i++)
    {
       s[i] = new Student();

       System.out.println("Enter the syudent " +  (i+1)+  " information ");
       s[i].setid(sc.nextInt());
       sc.nextLine();
       s[i].setname(sc.nextLine());
       s[i].setemail(sc.nextLine());
       s[i].setcontact(sc.nextInt());
       sc.nextLine();
       s[i].setcourse(sc.nextLine());
       s[i].setmarks(sc.nextInt());
    }
     c.addstudent(s);
     System.out.println( " Student added successfully ");

     break;

     
  
    case 2:
    

     //  2 . Show All Student Details .

     Student temp[]  =  c.getstudent(); 
     
     for(int i=0;i<temp.length;i++)
      {   
        if(temp[i] != null)
         {
           System.out.print(" id = " + temp[i].getid()  + " name = " + temp[i].getname() + " email = " + temp[i].getemail() + " contact = " + temp[i].getcontact()  + " course = " + temp[i].getcourse()  +  " marks = "   +  temp[i].getmarks() );
           System.out.println();
          }
      }

     break;


    
    case 3:

  
    // 3 .
    /* 
    Search Student Using:
    3.1  id ..................
    */

   System.out.println("Enter the id to search ");
   int id = sc.nextInt();
   sc.nextLine();

   Student temparr[] = c.getstudent();

   int flag = 0;
   for(int i=0;i<temparr.length;i++)
     {  
        if( temparr[i] != null && temparr[i].getid() == id ) 
         { 
            System.out.println("Sudent found his name is ---- > " + temparr[i].getname() );
            flag  =1;
            break;
         }  
     }

     if(flag == 0)
      { 
         System.out.println("Student with this id is not present in Records ");
      }  


     break;


 
      case 4:

      
       // 3.2  Serach by name.......


       System.out.println("Enter the name of student to search ");
       sc.nextLine();
       String na = sc.nextLine();
       int fl  = 0;

       Student search[] = c.getstudent();

       for(int i=0;i<search.length;i++)
        { 
          if(search[i] != null && search[i].getname().equals(na))
           { 
              System.out.println("Student found and his id is ----- > " + search[i].getid()) ;
              fl = 1;
              break;
           }
        }

       if(fl == 0)
        {
          System.out.println("Student of such name is not in Records");
        }


      break;


 
      case 5:

          // Delete Student Using:


         // 4.1  email.......................

 
         System.out.println(" Enter email to delete ");
         sc.nextLine();
         String em = sc.nextLine();

         Student delep[] = c.getstudent();
 
         for(int i=0;i<delep.length;i++)
          { 
             if( delep[i] != null && delep[i].getemail().equals(em))
              {  
                 for(int j=i;j<delep.length-1;j++)
                   { 
                      delep[j] = delep[j+1];
                   }
                 delep[delep.length-1] = null;
                 System.out.println("Successfully Deleted by email ");
                 break;
              } 
 
          }


        break;



        case 6:

 

        //4.2  marks < 40 (failed students)

         Student delm[] = c.getstudent(); 

         for(int i=0;i<delm.length;i++)
          { 
             if(delm[i] != null && delm[i].getmarks() < 40)
              { 
                 for(int j=i;j<delm.length-1;j++)
                  { 
                    delm[j] = delm[j+1];
                  }
                 delm[delm.length-1] = null;
                 System.out.println("Suessfully deleted by marks"); 
              }
          } 

 

        break;



       case 7:

         
        /* Update Student Using:
                      id → update course......................*/


         
         System.out.println(" Enter the id to update information "); 
         int idd = sc.nextInt();
         sc.nextLine();
         int f = 0;

         Student upi[] = c.getstudent();

         
         for(int i=0;i<upi.length;i++)
          {
            if( upi[i] != null && upi[i].getid() == idd )
             {  
                System.out.println("Enter the new course name to update ");
                upi[i].setcourse(sc.nextLine());
                f = 1;
                System.out.println(" Successfully updated ");
                break;
             }
          }

 
         if(f == 0)
          { 
             System.out.println("Not found this id you enter in records ");
          }


         break;



         case 8:

         /* Update Student Using:
                 name → update contact.  */ 


         System.out.println("Enter the name of student for update its contact");
         sc.nextLine();
         String nm = sc.nextLine();
         int fa = 0;


         Student upc[] = c.getstudent();

   
         for(int i=0;i<upc.length;i++)
          { 
             if(upc[i] != null && upc[i].getname().equals(nm) )
              { 
                 System.out.println("Enter a contact ");
                 upc[i].setcontact(sc.nextInt());
                 sc.nextLine();
                 fa = 1;
                 System.out.println(" Successfully updated ");
                 break;
              }
          }

         if(fa == 0)
          {
              System.out.println("Not present such name student in the array ");
          }
          
         
        break;



        case 9:

           
        /* Sort Students:
             By id ----- >  . */

         Student sorti[] = c.getstudent();

         Student copy[] = new Student[sorti.length];

         //copy sorti elements into copy array

         for(int i=0 ; i<sorti.length;i++)
          { 
            copy[i] = sorti[i];
          }


        // now , sort the elements in ascending order through id

        
        for(int i=0;i<copy.length;i++) 
         { 
           for(int j=i;j<copy.length-1;j++)
            { 
               if( copy[j] != null && copy[j+1] != null &&  copy[j].getid() > copy[j+1].getid()) 
                 {  
                    Student temp1 = copy[j];
                    copy[j] = copy[j+1];
                    copy[j+1] = temp1; 
                 }
            }
         }


         // now print the sorted array 

         System.out.println("Print the array elements in ascending order of id ");
         for(int i=0;i<copy.length;i++)
          { 
             System.out.print(" id = " + copy[i].getid()  + " name = " + copy[i].getname() + " email = " + copy[i].getemail() + " contact = " + copy[i].getcontact()  + " course = " + copy[i].getcourse()  +  " marks = "   +  copy[i].getmarks() );
             System.out.println();
          }


          break;



         case 10:
 
         // sort students - By marks descending.

 
         Student sortm[] = c.getstudent();

         // create copy of cuurent array for sorting it.

         Student copym[] = new Student[sortm.length];


         for(int i=0;i<sortm.length;i++)
          {
            copym[i] = sortm[i];
          } 

         
        // now sort array in descending order w.r.t marks in descending order.........

 
        for(int i=0;i<copym.length;i++)
          {
            for(int j=i;j<copym.length-1;j++)
              {  
                if( copym[j] != null  &&  copym[j+1] != null  &&   copym[j].getmarks() < copym[j+1].getmarks() )
                  { 
                     // here , temp is work as a object 
                     Student t = copym[j];
                     copym[j] = copym[j+1];
                     copym[j+1] = t; 
                  } 
               }
          }


 
         System.out.println("Display the array elements after sorting in desecnding order "); 
         for(int i=0;i<copym.length;i++)
          { 
             System.out.print(" id = " + copym[i].getid()  + " name = " + copym[i].getname() + " email = " + copym[i].getemail() + " contact = " + copym[i].getcontact()  + " course = " + copym[i].getcourse()  +  " marks = "   +  copym[i].getmarks() );
             System.out.println();
          }


 
          break;


 
 
       case 11:

         
        // 7 . Display the topper (highest marks).

        int iddd = 0;
        String nmm = " ";

        Student disp[] = c.getstudent();
 
        int maxmarks = 0;

        for(int i=0;i<disp.length;i++)
         {
           if(disp[i].getmarks() > maxmarks)
            { 
              maxmarks = disp[i].getmarks();
              iddd = disp[i].getid();
              nmm = disp[i].getname();
            }       
         }

       System.out.println("Student details who has the maximum marks ");
       System.out.print(" id = "+ iddd + " n = " + nmm);
       System.out.println();


        
       break;-


 
       case 12:


      // 8. Display students with marks between 50–80

        int idi = 0;
        String naa = " ";

        Student dis[] = c.getstudent();

        for(int i=0;i<dis.length;i++)
         { 
           if(dis[i].getmarks() > 50  &&  dis[i].getmarks() < 80)
            { 
               idi = dis[i].getid();
               naa = dis[i].getname();
               System.out.print(" id = " + idi + " name = " + naa);
               System.out.println();
            }
         }


       break;


 
      //  9 . Exit.



   } 




   }while(choice < 13);

         


 
    }







}