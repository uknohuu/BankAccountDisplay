/**
** File Name: AccountDriver.java
* Written by: Sylvia Yeung
* Description: In this assignment, you will be creating new classes that are derived from an abstract class called BankAccount. 
*              A checking account is a bank account and a savings account is a bank account as well. 
*              This sets up a relationship called inheritance, 
*              where BankAccount is the superclass and CheckingAccount and SavingsAccount are subclasses. 
*
*
* Challenges:  The hardest thing to figure out how to use instanceof operator and ArrayList class 
*              as well as invoke toString() method when create the object
//              
// Time Spent:  About 2 days
//
//                   Revision History
* Date:                   By:               Action:
* -------------------------------------------------------
 09/19/2022             sy     Created the AccountDriver java class.
*/

//package Test.Packages; //Pcannot include any package statement


import java.util.ArrayList;
/**
   This program demonstrates the BankAccount and derived classes.
*/
public class AccountDriver
{
   public static void main(String[] args)
   {
      double put_in = 500;
      double take_out = 1000;
      
      boolean completed;

//create subclass objects
// Test the CheckingAccount class.
      CheckingAccount myCheckingAccount =
         new CheckingAccount("Benjamin Franklin", 1000);
 // Test the SavingsAccount class.
      SavingsAccount yourAccount =
         new SavingsAccount("William Shakespeare", 400);
 // Test the copy constructor of the SavingsAccount class.
      SavingsAccount secondAccount =
         new SavingsAccount(yourAccount, 1005);
// Test to make sure new accounts are
      // numbered correctly.
      CheckingAccount yourCheckingAccount =
         new CheckingAccount("Issac Newton", 5000);
ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
          
       accounts.add(myCheckingAccount);//0
       accounts.add(yourAccount);//1
       accounts.add(secondAccount);//2
       accounts.add(yourCheckingAccount);//3

    for(BankAccount bAccount : accounts)
    {
    System.out.println(bAccount.getStatus()+": "); //invoke getStatus method
    System.out.println(bAccount);//invoke toString method

    // money = String.format("%.2f",bAccount.getBalance());
    System.out.printf("Inital balance = $%.2f\n", bAccount.getBalance());
    bAccount.deposit(put_in);
     System.out.printf("After deposit of $%.2f, balance = $%.2f\n",
                        put_in, bAccount.getBalance());
     
     if(bAccount instanceof CheckingAccount)

       { 
        System.out.printf("Extra Fee charged with $.15\n");
        CheckingAccount checkings = (CheckingAccount) bAccount;
        completed = checkings.withdraw(take_out); 
         if (completed)
        {
             System.out.printf("After withdrawal of $%.2f, balance = $%.2f\n",
                                 take_out, checkings.getBalance());               
          }
     else
          {
             System.out.printf("Insuffient funds to withdraw $ $%.2f\n",
             take_out);
          }
     }//end instanceof 
	 
       if (bAccount instanceof SavingsAccount)
        {
        SavingsAccount savings = (SavingsAccount) bAccount;
       //setBalance
 //savings.setBalance(savings.getBalance()+savings.getInterest());     
      savings.postInterest();

         System.out.printf("After earnd $%.2f interest, balance = $%.2f\n",
                       savings.getInterest(), savings.getBalance());
               
completed = savings.withdraw(take_out); 
        
       if (completed)
        {
             System.out.printf("After withdrawal of $%.2f, balance = $%.2f\n",
                                 take_out, bAccount.getBalance());               
          }
     else
          {
             System.out.printf("Insuffient funds to withdraw $ $%.2f\n",
             take_out);
          }
}
    System.out.println();
    }//end for loop

}//end main method
}//end class
