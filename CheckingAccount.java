/**
** File Name: CheckingAccount.java
* Written by: Andrew Nguyen
* Description: The subclass for CheckingAccount with its constructor concatenating with -10 which identifies
* this is a checking account at this certain bank, getStatus and withdraw method, and  the constant FEE of 15 cents.
*
* Challenges: Implementing getStatus.
//              
// Time Spent: 2 Hours
//
//                   Revision History
* Date:                   By:               Action:
* -------------------------------------------------------
 02/16/2023             an     Created the CheckingAccount java class.
*/
public class CheckingAccount extends BankAccount {
// Constant FEE of 0.15
private static double FEE = 0.15;
// Constructor
public CheckingAccount(String name, double amount) {
// Calling constructor for superclass
    super(name, amount);
// Concatenated with –10
    super.setAccountNumber(getAccountNumber() + "-10");
}
// Overriding withdraw method
@Override
public boolean withdraw(double amount) {
    return (super.withdraw(amount + FEE));
}
// Implementing getStatus method and returning checking account as string
@Override
public String getStatus() {
    return "Checking Account";
}
}
