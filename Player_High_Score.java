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



public class  Player_High_Score
{
  public static void main(String ss[])
   { 
    
     Player pl[] = new Player[2];


     // 1 . set the values for player in respective objects..

     for(int i=0;i<pl.length;i++)
      { 
         pl[i] = new Player();

         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the player" + (i+1)  + "  information ");

         System.out.println("Enter name and score for player");
         pl[i].setname(sc.nextLine()); 
         pl[i].setscore(sc.nextInt());
      }


  
       //2 . Compare their scores and print the name of the player with the higher score.

      int maxscore = Integer.MIN_VALUE;

      String n = " ";
      int s = 0;


       for(int i=0;i<pl.length;i++)
        { 
           if(pl[i].getscore() > maxscore)
            { 
               maxscore = pl[i].getscore();
               n = pl[i].getname();
               s = pl[i].getscore();
            }
        }

 
       System.out.println("Information of the player who has the maximum score");

       System.out.print(" name = " +  n  + " score = " + s);
       

  

 
 
    
   }

}


















