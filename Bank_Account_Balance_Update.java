/*
10. Bank Account Balance Update
Task:
 Create a BankAccount class with fields: accountHolderName and balance.
 In the main method:
Create a BankAccount object.
Deposit an amount into the account and print the updated balance.
Explanation:
 This introduces updating object fields and performing logical operations.
*/





import java.util.*;

class BankAccount 
{
  private String accountHolderName;
  private int balance;

  
  //setters and getters

  public void setaccountHolderName(String accountHolderName)
   { 
      this.accountHolderName = accountHolderName;
   }


  public String getaccountHolderName()
   { 
     return accountHolderName;
   } 

  public void setbalance(int balance)
   { 
     this.balance = balance;
   }

  public int getbalance()
   { 
     return balance;
   }

}



public class Bank_Account_Balance_Update
{
  public static void main(String ss[])
   {
      Scanner sc = new Scanner(System.in);
  
      BankAccount ba[] = new BankAccount[1];

      for(int i=0;i<ba.length;i++)
       { 
          ba[i] = new BankAccount();

          String accountHolderName = sc.nextLine();
          int balance = sc.nextInt();

          ba[i].setaccountHolderName(accountHolderName);
          ba[i].setbalance(balance);

       }
      
       
      
     System.out.println(" Enter a amount to deposit ");
     int deposit = sc.nextInt();

     int newbalance = ba[0].getbalance() +  deposit;  

     ba[0].setbalance(newbalance);

     System.out.println(" Updated account balance " + ba[0].getbalance());
 
 

 
 
   }



}