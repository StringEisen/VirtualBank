public class CurrentAccount implements BankAccount {
    private double overdraft;
    
    public CurrentAccount(int accNo, String accName) {
        this.accNo = accNo;
        this.accName = accName;
        this.balance = 0.0;
    }
    
    public void setOverdraft(double amount) { this.overdraft = amount; }
    
    public void withdraw(double amount) {
        if (balance-amount >= 0)
            balance -= amount;
        else if (balance - amount < 0) {
            if (amount - balance <= overdraft) {
            overdraft -= amount - balance;
            balance = 0;
            }
            else if (amount - balance > overdraft) {
                System.out.println("the amount of withdraw exceed the ability of the sccount");
                return;
            }
        }
    }
}