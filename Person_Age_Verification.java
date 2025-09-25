/*

3. Person Age Verification
Task:
 Create a Person class with fields: name and age.
 In the main method:
Create a Person object.
Check if the person is eligible to vote (age >= 18) and print the result.
Explanation:
 This demonstrates condition checking using instance variables.
*/





import java.util.*;

class Person
{
  private String name;
  private int age;

  //setters and getters

  public void setname(String name)
   { 
     this.name = name;
   }

  public String getname()
   { 
     return name;
   }

  public void setage(int age)
   { 
     this.age = age;
   }

  public int getage()
   { 
     return age;
   } 
}





public class Person_Age_Verification
{
  public static void main(String ss[])
  { 
   Person per[] = new Person[3];
 
   // set values in object.............. 

  for(int i=0;i<per.length;i++)
    { 
     per[i] = new Person();
     
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the values of "+ (i+1) + " person ");
     String name = sc.nextLine();
     int age = sc.nextInt();

     per[i].setname(name);
     per[i].setage(age);
    }
 
   
   // display now
   System.out.println("Person thos are eligible tp vote are ");

    
   for(int i=0;i<per.length;i++)  
    { 
      if(per[i].getage() >= 18)
       { 
          int age = per[i].getage();
          String name = per[i].getname();
          System.out.print("name = " + name + " , " +  " age " + age);
          System.out.println();
       }
    }
    
}

}