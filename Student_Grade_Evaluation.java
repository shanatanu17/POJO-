/*

7. Student Grade Evaluation
Task:
 Create a Student class with fields: name, marks, and subject.
 In the main method:
Create a Student object.
Check if the student has passed or failed the subject (passing marks >= 40) and print the result.
Explanation:
 This task involves condition checking and field manipulation.

*/

import java.util.*;


class Student 
{
  private String name;
  private int marks;
  private String subject;

 
  //setters and getters

  public void setname(String name)
   {
     this.name = name; 
   }

  public String getname()
   { 
     return name;
   } 

 
   public void setmarks(int marks)
   { 
     this.marks = marks;
   }

   public int getmarks()
    {
      return marks;
    }

  public void setsubject(String subject)  
   { 
     this.subject = subject;
   }

  public String getsubject()
   {  
      return subject;
   }
 

}




public class Student_Grade_Evaluation
{
  public static void main(String ss[])
   { 
      Student std[] = new Student[3];

      for(int i=0;i<std.length;i++)
       {  
          std[i] = new Student();
 
          Scanner sc = new Scanner(System.in); 
  
          System.out.println("Enter the information w.r.t object");
          String name = sc.nextLine();
          int marks = sc.nextInt();  
          sc.nextLine();
          String subject = sc.nextLine();


          std[i].setname(name);
          std[i].setmarks(marks);
          std[i].setsubject(subject);

       }


     // display students now

        for(int i=0;i<std.length;i++)
         { 
            if(std[i].getmarks() >= 40)
             { 
                String name = std[i].getname();
                int marks = std[i].getmarks();
                String subject = std[i].getsubject();

                System.out.println(" pass ");
                System.out.println(" name= "+ name + " marks = "+ marks + " subject = " + subject);
             }

            else
             { 
                String name = std[i].getname();
                int marks = std[i].getmarks();
                String subject = std[i].getsubject();

                System.out.println(" fail ");
                System.out.println(" name= "+ name + " marks = "+ marks + " subject = " + subject);
 
             }   

         } 
 
 
 
 
   }


}