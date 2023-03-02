/**
** File Name: SavingsAccount.java
* Written by: Andrew Nguyen
* Description: The constructor method with an annual interest rate of 2.5% also applying "-" to the savingsAccount number to
* to indicate how many savings accounts the holder has indicated by Ex. 100001-0 and 100001-1.
* The postInterest calculates one month's worth of interest on balance, and the getInterest will return a double value, it will
* also calculate one month's worth of interest on balance.
* Challenges:  Setting up the postInterest method
//              
// Time Spent: 3 Hours
//
//                   Revision History
* Date:                   By:               Action:
* -------------------------------------------------------
 02/16/2023             an     Created the SavingsAccount java class.
*/
public class SavingsAccount extends BankAccount {
// The data field
    private double rate;
    private int savingsNumber;
    private String accountNumber;
// Constructor and Calls super class constructor
public SavingsAccount(String name, double amount) {
    super(name, amount);
    this.rate = 2.5;
    this.savingsNumber = 0;
    this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
}
public SavingsAccount(SavingsAccount oldAccount, double amount) {
// Calls the copy constructor of superclass
    super(oldAccount, amount);
    this.rate = oldAccount.rate;
// Assigning the savingsNumber to be one more than the savingsNumber of the original savings account
    this.savingsNumber = oldAccount.savingsNumber + 1;
// Assigns the accountNumber to be the accountNumber of the superclass concatenated with the hyphen
    this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
}
// postInterest method 
public void postInterest() {
    double interest = getInterest();
    super.deposit(interest);
}
// getInterest method
public double getInterest() {
    return super.getBalance() * rate / (12 * 100);
}
// getAccountNUmber override method
@Override
public String getAccountNumber() {
    return accountNumber;
}
// getStatus method
@Override
public String getStatus() {
    return "Savings Account";
}
// Overrding toString 
@Override
public String toString() {
    return "Account Number " + accountNumber + " belonging to " + super.getOwner();
}
}
