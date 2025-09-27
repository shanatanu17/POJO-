/*
Q2. Problem:
Create a POJO class Employee with fields: empId, name, basicSalary, hra, and da. Store details of 5 employees using an array of objects. Perform the following operations:
Calculate the gross salary for each employee (gross = basic + hra + da).
Find and display the employee with the maximum salary.
Print the details of employees whose salary is greater than the average salary of all employees.


Explanation:
This covers aggregation + comparison + filtering. You’ll work with numerical calculations and finding max/average values.


*/


import java.util.*;


class Employee
{
  private int empid;
  private String name;
  private int basicsalary;
  private int hra;
  private int da;

 
  //getters and seters

 public void setempid(int empid)
  {
    this.empid = empid;
  }

 public int getempid()
  { 
    return empid;
  }

 public void setname(String name)
  {
    this.name = name;
  } 

 public String getname()
  { 
    return name;
  }

  public void setbasicsalary(int basicsalary)
   { 
      this.basicsalary = basicsalary;
   } 

  public int getbasicsalary()
   { 
     return basicsalary;
   }

   public void sethra(int hra)
    { 
      this.hra = hra;
    }  
  
   public int gethra()
    {    
      return hra;
    }

   public void setda(int da)
    {
       this.da = da;
    }  

  public int getda()
   { 
      return da; 
   } 

}


 

public class Employee_Information
{
 public static void main(String ss[])
 {

  Employee emp[] = new Employee[5];

  Scanner sc = new Scanner(System.in);


  // Create employees
   
  for(int i=0;i<emp.length;i++)
   { 
      emp[i] = new Employee();

 
      System.out.println("  Enter the information for employee  "+ (i+1));
      int id = sc.nextInt();
      sc.nextLine();
      String n = sc.nextLine();
      int bs = sc.nextInt();
      int h = sc.nextInt();
      int d = sc.nextInt();

      //set

      emp[i].setempid(id);
      emp[i].setname(n);
      emp[i].setbasicsalary(bs);
      emp[i].sethra(h);
      emp[i].setda(d);
   }



   //1 . Calculate the gross salary for each employee (gross = basic + hra + da).

   for(int i=0;i<emp.length;i++)
    { 
       int bs = emp[i].getbasicsalary();
       int h = emp[i].gethra();
       int da = emp[i].getda();

       int gross  = bs + h + da;

       System.out.println("Gross of the " +(i+1) + " employee is  " + gross );
    }


    System.out.println("-------------------------------------------------------------------");


   
  //2 . Find and display the employee with the maximum salary.

   int maxsal = 0;
   int id = 0;
   String na = " ";

   for(int i=0;i<emp.length;i++)
   { 
     int sal = emp[i].getbasicsalary();
 
     if(sal > maxsal)
      { 
         maxsal = sal;
         id = emp[i].getempid();
         na = emp[i].getname();
      }
   }


    System.out.println("Employee with the maximum salary is ");
    System.out.println(" id = " + id);
    System.out.println(" name = " + na);



   System.out.println("-------------------------------------------------------------------");



   //3 . Print the details of employees whose salary is greater than the average salary of all employees.

 

   // find out totalsalary of all employees...
   int totalsal = 0;

   for(int i=0;i<emp.length;i++)
    { 
      totalsal = totalsal  + emp[i].getbasicsalary();
    } 

   int avgsal = totalsal / emp.length;

 
   // now , check which employee has salary greater than average salary of all employees

   for(int i=0;i<emp.length;i++)  
    { 
       if(emp[i].getbasicsalary() > avgsal)
        { 
          System.out.println("This employee has it's Basic salary grater than all employee average salary "  );
          System.out.print(" id = " + emp[i].getempid()  + " name = "+ emp[i].getname() );
          System.out.println();
        }
    }  
   


   
   
    


   
 
}

}



















