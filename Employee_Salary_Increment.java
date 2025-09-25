/*

2. Employee Salary Increment
Task:
 Create an Employee class with fields: name, salary, and department.
 In the main method:
Create an Employee object.
Increase the employee's salary by 10% and print the updated salary.
Explanation:
 This introduces instance variable manipulation and basic arithmetic operations.


*/


import java.util.*;

class Employee
{
  private String name;
  private int salary;
  private String department;


  //setters and getters
  
  public void setname(String name)
   {  
      this.name = name;
   }

  public String getname()
   { 
      return name;
   }

  public void setsalary(int salary)
   {  
      this.salary = salary;
   }

  public int getsalary()
   {
      return salary;
   } 

  public void setdepartment(String department)
   { 
      this.department = department;
   }

  public String getdepartment()
   { 
      return department;
   }

}



public class Employee_Salary_Increment
{
   public static void main(String ss[])
   { 
      Employee em[] = new Employee[1];

      Scanner sc = new Scanner(System.in);
 
      for(int i=0;i<em.length;i++)
       { 
         em[i] = new Employee();

         String name = sc.nextLine();
         int salary = sc.nextInt();
         sc.nextLine();
        
         String department = sc.nextLine();

         //set values to respective object now.

         em[i].setname(name);
         em[i].setsalary(salary);
         em[i].setdepartment(department);
       }


       // find out the salary and increment it by 10%

       int salary1  = em[0].getsalary();

       int incrementedsalary = salary1 + (salary1 * 10)/100;

       System.out.println("incemental salary of the employee is "+ incrementedsalary);

      
     
 
  
 
 
   }  
}
