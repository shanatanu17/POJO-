import java.util.*;

class Employee
{
  // POJO class 
  private int id;
  private String name;
  private int salary;

  
  // setters and getters
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

  public void setsalary(int salary)
   {  
      this.salary = salary;
   }

  public int getsalary()
   {
      return salary;
   }

}



public class Array_of_object
{
  public static void main(String ss[])
   {  
      Employee emp[] = new Employee[5];

      for(int i=0;i<emp.length;i++)
       { 
         emp[i] = new Employee();

         Scanner sc = new Scanner(System.in);
          
         String name = sc.nextLine(); 
         int id = sc.nextInt();
         int salary = sc.nextInt();

         emp[i].setid(id);
         emp[i].setname(name);
         emp[i].setsalary(salary);
       }


       //display the array values
  
       for(int i=0;i<emp.length;i++)
        { 
          int id = emp[i].getid();
          String name = emp[i].getname();
          int salary = emp[i].getsalary();

          System.out.println(" id = " + id + " name = " + name + " salary = " + salary);
        }
 
 
 
  
 
   }
}