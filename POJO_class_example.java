class Employee
{
  
   //here , we consider/make all variables as a private
   private String name;
   private int id;
   private String address;
   private int salary;
   private int age;

 
   //public getters and setters methods to access the object values from pojo object..
   public void setname(String n)
    {
       this.name = n;
    }

   public String getname()
    { 
       return name;
    }

   public void setid(int i)
    { 
       this.id = i;
    }

   public int getid()
     { 
       return id;
     }

   public void setaddress(String add)
    {  
        this.address = add;
    }

  public String getaddress()
   { 
      return address;
   }

  public void setsalary(int sal)
  {
     this.salary = sal;
  }

  public int getsalary()
  { 
     return salary;
  } 

  public void setage(int a)
   {
      this.age = a;
   }  

  public int getage()
   { 
     return age;
   } 
}


class Company
{
   // make here, a object of Employee class 
   private Employee emp;

   // pass here a object of Employee class .
   void addemployee(Employee emp)
    { 
       this.emp = emp;
    }

   
   // this function use for display the data in object..
   void showdata()
    { 
      //using getters we can access the value of pojo class object.
    
      String name = emp.getname();
      int id  = emp.getid();
      String address = emp.getaddress();
      int salary = emp.getsalary();
      int age = emp.getage();


      // print the values now
      System.out.println("name- " + name + "  id- " + id + "   address- " + address + "  salary- "+ salary  + "   age- "+ age);

      
 

    } 
 





}


public class POJO_class_example
{
  public static void main(String ss[])
  { 
     Employee e = new Employee();
     Employee e2 = new Employee();
 
     Company c = new Company();


     e.setname("Shantanu");
     e.setid(1);
     e.setaddress("pune");
     e.setsalary(100);
     e.setage(21);

     c.addemployee(e);
     c.showdata();

  }



}