/*

4. Player High Score
Task:
 Create a Player class with fields: name and score.
 In the main method:
Create two individual Player objects.
Compare their scores and print the name of the player with the higher score.
Explanation:
 This helps to understand comparing fields between objects.

*/



import java.util.*;

class Player
{
  private String name;
  private int score;

  //setters and getters
  public void setname(String name)
   { 
     this.name = name;
   }

  public String getname()
   { 
     return name;
   }

  public void setscore(int score)
   { 
     this.score = score;
   }  

  public int getscore()
   { 
     return score;
   }

}




public class Player_High_Score
{
  public static void main(String ss[])
   {
      Player pl[] = new Player[2];

      for(int i=0;i<pl.length;i++)
       { 
         pl[i] = new Player();

         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter the information of player ");
         String name  = sc.nextLine(); 
         int score  = sc.nextInt();
 
         // now set it in repective object

         pl[i].setname(name);
         pl[i].setscore(score);
       }


 
       //Compare their scores and print the name of the player with the higher score

       
       
       if(pl[0].getscore() > pl[1].getscore() )
        {  
           System.out.println("This player has the highest score ");
           String name = pl[0].getname();
           System.out.println(name);
        } 
       else if(pl[0].getscore() < pl[1].getscore())
        { 
           System.out.println("This player has the highest score ");
           String name = pl[1].getname();
           System.out.println(name);
        }
      else
        { 
           System.out.println("Both players have the same score ");
        }
      
 
 
   }



}