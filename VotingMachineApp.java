class Voter
{
  // POJO class
  private int id;
  private String name;
  private int age;

  
  //getters and setters
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

  public void setage(int age)
   {
      this.age = age;
   }

  public int getage()
   { 
      return age;
   }

}


class VotingMachine
{
   
   private Voter vot[];

   void addVoter(Voter ...vo)
    {
      vot = vo;
    }

 
    void showdata()
     {  
        for(int i=0;i<vot.length;i++)
         { 
            if(vot[i].getage() > 18)
             { 
                int id = vot[i].getid();
                String name = vot[i].getname();
                int age = vot[i].getage();

                System.out.println(" id = " + id + " name = " + name + " age = " + age );
             }
 
         }
     }

   
   



}



public class VotingMachineApp
{
   public static void main(String ss[])
   { 
     VotingMachine vm = new VotingMachine();

     Voter v1 = new Voter();
     v1.setid(11);
     v1.setname("Shantanu");
     v1.setage(21);

     Voter v2 = new Voter();
     v2.setid(12);
     v2.setname("Siddhant");
     v2.setage(21);

     Voter v3 = new Voter();
     v3.setid(13);
     v3.setname("kunal");
     v3.setage(23);

     Voter v4 = new Voter();
     v4.setid(14);
     v4.setname("sham");
     v4.setage(16);

     
     vm.addVoter(v1,v2,v3,v4);

     vm.showdata();
 
 
 
   }
}