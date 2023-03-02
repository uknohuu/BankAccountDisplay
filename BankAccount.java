/**
** File Name: BankAccount.java
* Written by: Andrew Nguyen
* Description: The abstract superclass for BankAccount with constructors, methods, and 
* deposit/withdraw.
*
* Challenges:  Understanding abstract and making the constructors.
//              
// Time Spent: 4 Hours
//
//                   Revision History
* Date:                   By:               Action:
* -------------------------------------------------------
 02/16/2023             an     Created the BankAccount java class.
*/
public abstract class BankAccount {
// The data field
private double balance;
private String owner, accountNumber;
private static int numberOfAccounts = 100001;
// Default constructor set up the balance to zero
public BankAccount() {
    this.balance = 0;
    this.owner = "";
    accountNumber = "" + numberOfAccounts;
    numberOfAccounts++;
}
// Parameters for balance, owner, accountNumber, and numberOfAccounts
public BankAccount(String name, double amount) {
    this.balance = amount;
    this.owner = name;
    accountNumber = "" + numberOfAccounts;
// Increasing number of accounts by incrementing
    numberOfAccounts++;
}
// Copy constructor with copy amount
public BankAccount(BankAccount oldAccount, double amount) {
    this.owner = oldAccount.owner;
    this.accountNumber = oldAccount.accountNumber;
    this.balance = amount;
}
// Deposit method
public void deposit(double amount) {
    balance += amount;
}
// Withdraw method
public boolean withdraw(double amount) {
// Checking if sufficient funds are available
    if (amount <= balance) {
// Subtracting argument from balance
	balance -= amount;
	return true;
}
return false;
}
// Mutator method for setBalance
public void setBalance(double balance) {
    this.balance = balance;
}
// Mutator method for setAccountNumber
public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
}
// Accessor method for balance
public double getBalance() {
    return balance;
}

// Accessor method for owner
public String getOwner() {
    return owner;
}
// Accessor method for accountNumber
public String getAccountNumber() {
    return accountNumber;
}
// Overriding toString method
@Override
public String toString() {
    return "Account Number " + accountNumber + " belonging to " + owner;
}
// Abstract method status
public abstract String getStatus();
}
