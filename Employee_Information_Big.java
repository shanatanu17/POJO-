/*
Q2. Write a menu driven program in java to Create a class name as Employee to hold empid, empname , empemail , empcontact and empsalry.
			
The menu options should be: 
		
	1. Add Employee Details.
	2. Display All Employee Details.
	3. Search Employee By Id then employee is found or not.
	4. Update Employee Details By Name.
	5. Delete Employee Details By Email.
	6. Display list count of the Employee in Company.
	7. Display list the employee in the ascending order of employee salary.
	8. Display the employee details in highest salary.
	9. Display the employee details in minimum salary is 10000 to maximum salary is 60000.
	10. Exit.
*/

import java.util.*;


class Employee
{
  private int empi;
  private String empn;
  private String empe;
  private int empc;
  private int emps;


  public void setempi(int empi)
   { 
     this.empi = empi;
   } 

  public int getempi()
   { 
     return empi;
   }

  public void setempn(String empn)  
   { 
      this.empn = empn;
   }

  public String getempn()
   {  
      return empn;
   }

  public void setempe(String empe)
  {   
     this.empe = empe;
  }

  public String getempe()
  {    
     return empe;
  }

  public void setempc(int empc)
   {
     this.empc = empc;
   }  

  public int getempc()
   {  
      return empc;
   }

  public void setemps(int emps)
   {
      this.emps = emps;
   }

  public int getemps()
  { 
     return emps;
  }
 

}




public class Employee_Information_Big
{
 public static void main(String ss[])
  { 
    Employee emp[] = new Employee[2];

    Scanner sc = new Scanner(System.in);



int choice;

 do{

     System.out.println("1. Add Employee Details. ");
     System.out.println("2. Display All Employee Details ");
     System.out.println("3. Search Employee By Id then employee is found or not.");
     System.out.println("4. Update Employee Details By Name. ");
     System.out.println("5. Delete Employee Details By Email. ");
     System.out.println("6. Display list count of the Employee in Company. ");
     System.out.println("7. Display list the employee in the ascending order of employee salary. ");
     System.out.println("8. Display the employee details in highest salary ");
     System.out.println("9. Display the employee details in minimum salary is 10000 to maximum salary is 60000. ");
     System.out.println("10. Exit.");
     
    
     System.out.println("Enter the choice ");
     choice = sc.nextInt();


  switch(choice) 
   {
 

    // 1. Add Employee Details.

    case 1:


    for(int i=0;i<emp.length;i++)
     {   
       emp[i] = new Employee();

       System.out.println(" Enter the employee " +  (i+1) +     " information " );
       emp[i].setempi(sc.nextInt());
       sc.nextLine();
       emp[i].setempn(sc.nextLine());
       emp[i].setempe(sc.nextLine());
       emp[i].setempc(sc.nextInt());
       emp[i].setemps(sc.nextInt()); 
     }


    break;


 
     case 2:
     
     // 2. Display All Employee Details.

    
      for(int i=0;i<emp.length;i++)
       { 
        if(emp[i] != null)
        {
         System.out.print(" empi = " + emp[i].getempi() + " empn = " + emp[i].getempn() + " empe = " + emp[i].getempe() + " empc = " + emp[i].getempc() + " emps = " + emp[i].getemps());
         System.out.println();
        }
       }

      break;


     case 3:

   
     //3 . Search Employee By Id then employee is found or not.

 
       System.out.println("Enter the emp id to search ");
       int idd = sc.nextInt();
       int flag = 0;

       for(int i=0;i<emp.length;i++)
        { 
           if(emp[i].getempi() == idd)
            {  
               flag = 1; 
               break;
            } 
        }

        if(flag == 1)
          {
             System.out.println("Employee found");
          } 
        else
          {
             System.out.println("Employee Not found");
          }


      break;

   
    case 4: 
   

   //4 . Update Employee Details By Name.    
 
   
     System.out.println("Enter name of employee to update the details ");
     sc.nextLine();
     String n = sc.nextLine();
 
   
     for(int i=0;i<emp.length;i++)
      { 
        if(emp[i].getempn().equals(n))
         {  
            emp[i].setempi(sc.nextInt());
            sc.nextLine();
            emp[i].setempn(sc.nextLine());
            emp[i].setempe(sc.nextLine());
            emp[i].setempc(sc.nextInt());
            emp[i].setemps(sc.nextInt());
            System.out.println(" Employee details successfully updated ");
         }
      }  

    break;

   
    case 5:
      

    // 5 . Delete Employee Details By Email.


       System.out.println( " Enter the employee emial to delete " ); 
       sc.nextLine();
       String e = sc.nextLine();

         


       for(int i=0;i<emp.length;i++)
        { 
           if(emp[i].getempe().equals(e))
            { 
               for(int j=i;j<emp.length-1;j++)
                { 
                  emp[j] = emp[j+1];
                }
 
               emp[emp.length-1] = null;
               System.out.println("Employee successfully deleted ");
               break;
            }
        }

  
     break;


    case 6:


     
     //6 . Display list count of the Employee in Company.
 

      int count = 0;
 
      for(int i=0;i<emp.length;i++)
       { 
          if(emp[i] != null)
           { 
             count++;
           }
       }

 
     System.out.println("Total no of employees are " + count);

 
     break;


    case 7:


    // 7 .Display list the employee in the ascending order of employee salary.


     Employee copy[] = new Employee[emp.length];

     for(int i=0;i<emp.length;i++)
      {
         copy[i] = emp[i];
      }

  
      for(int i=0;i<copy.length;i++)
       { 
          for(int j=i;j<copy.length-1;j++)
            { 
               if(copy[j].getemps() > copy[j+1].getemps())
                { 
                   Employee temp = copy[j];
                   copy[j] = copy[j+1];
                   copy[j+1] = temp;
                }  
            }
       }


       
       System.out.println("Employees information after getting sorted on basis of salary ");
       for(int i=0;i<copy.length;i++)
        {  
          System.out.print(" empi = " + copy[i].getempi() + " empn = " + copy[i].getempn() + " empe = " + copy[i].getempe() + " empc = " + copy[i].getempc() + " emps = " + copy[i].getemps());
          System.out.println();
        }

  
     break;


    case 8:


     // 8 .  Display the employee details in highest salary.


      int maxsal = 0;
      int id = 0;
      String na = " ";
      String ee = " ";
      int c = 0;
      int s = 0;


      for(int i=0;i<emp.length;i++)
       { 
          if(emp[i].getemps() > maxsal)
           { 
              maxsal = emp[i].getemps();
              id = emp[i].getempi();
              na = emp[i].getempn();
              ee = emp[i].getempe();
              c =  emp[i].getempc();
              s =  emp[i].getemps();
           }
       }
       

      System.out.println("Dispaly employee details who has highest salary");

      System.out.print(" empi = " + id + " empn = " + na + " empe = " + ee + " empc = " + c + " emps = " + s);
      System.out.println();


     break;


    case 9:


     // 9 .  Display the employee details in minimum salary is 10000 to maximum salary is 60000.


     
     for(int i=0;i<emp.length;i++)
      { 
        if(emp[i].getemps() > 10000 && emp[i].getemps() < 60000)
          { 
            System.out.print(" empi = " + emp[i].getempi() + " empn = " + emp[i].getempn() + " empe = " + emp[i].getempe() + " empc = " + emp[i].getempc() + " emps = " + emp[i].getemps());
            System.out.println();

          }
      } 


    break;


 

      // 10 .Exit

      
 




  }


 


}while(choice < 10);






  }


}

















