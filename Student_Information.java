/*
Q1. Problem:
Create a POJO class Student with fields: rollNo, name, marks[] (array of 3 subjects). Store data for 5 students using an array of objects. Perform the following operations:
Calculate the total marks of each student.
Find the student with the highest average marks.
Display the list of students who have failed in any subject (marks < 35).
Explanation:
This problem tests array of objects, iteration inside objects, and conditional checks. You practice object encapsulation (POJO) and multiple computations.

*/

import java.util.*;

class Student
{
  private int rollno;
  private String name;
  private int marks[];

  
  //setters and getters

  public void setrollno(int rollno)
   { 
     this.rollno = rollno;
   }

  public int getrollno()
   { 
     return rollno;
   }

  public void setname(String name)
   {  
      this.name = name;
   }

  public String getname() 
   {  
      return name;
   } 

  public void setmarks(int marks[])
   {  
     this.marks = marks;
   }

  public int[] getmarks()
   { 
      return marks;
   }

}




public class Student_Information
{
  public static void main(String ss[])
   { 
      Scanner sc = new Scanner(System.in);

      Student st[] = new Student[5];

      for(int i=0;i<st.length;i++)
       { 
          
          st[i] = new Student();

          // take inputs
 
          System.out.println("Enter the student information");
 
          int roll = sc.nextInt();
          sc.nextLine();
          String name = sc.nextLine();
          int marks[] = new int[3];

          for(int m=0;m<marks.length;m++)
           {
             marks[m] = sc.nextInt();
           } 

   
          // set values 

          st[i].setrollno(roll);
          st[i].setname(name);
          st[i].setmarks(marks);

       }


       System.out.println("-----------------------------------------------------------------------");

         

       // Actual Logic

       //1. Find out total marks of each student...............


        for(int i=0;i<st.length;i++)
         {  
 
           int totalmarks = 0;
           int marks[] = st[i].getmarks();
    
           for(int j=0;j<marks.length;j++)
            {
              totalmarks = totalmarks  +  marks[j];
            }

                   
           System.out.println("Total marks for student "  + (i+1) + " is    " + totalmarks);
         } 


        System.out.println("-----------------------------------------------------------------------");
 
 
        
        // 2 . Find the student with the highest average marks

        int roll = 0;
        String name = " ";

 
        int average = 0;
        for(int i=0;i<st.length;i++)
         {  
 
           int totalmarks = 0;
           int marks[] = st[i].getmarks();
    
           for(int j=0;j<marks.length;j++)
            {
              totalmarks = totalmarks  +  marks[j];
            }

           int calaverage = totalmarks / marks.length;

           if(calaverage > average)
            { 
               average = calaverage;
               roll = st[i].getrollno();
               name = st[i].getname();  
            }
          
         }


         System.out.println("Student information who has highest averag score ");

         System.out.println("Roll no " + roll );
         System.out.println(" Name " + name); 

         System.out.println("-----------------------------------------------------------------------");




       // 3 . Display the list of students who have failed in any subject (marks < 35).

        
        System.out.println("The following student has the marks less than 35 in their atleast 1 subject ");
        
        for(int i=0;i<st.length;i++)
         { 
            int marks[] = st[i].getmarks();

            for(int j=0;j<marks.length;j++)
             { 
                if(marks[j] < 35)
                  { 
                     int ro = st[i].getrollno();
                     String n = st[i].getname();
                     
                     System.out.println(" ROLLNO " + ro);
                     System.out.println(" NAME "+ n);
                     System.out.println("----------------------------------");
                     break; 
                  }
  
             }
           
         }
          


       


   }
}



