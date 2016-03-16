public class BankAccount {
    // unique account number
    // personal identification number, customer issued
    public int type;
    protected String pin;
    protected double overdraft;
    protected int accNo;
    //private String accName;
    protected double balance;
    
    public BankAccount(int accNo, String accName) {
        this.accNo = accNo;
        this.accName = accName;
        this.balance = 0.0;
    }
    
    // 
    public void payIn(double payment) {
        balance += payment;
    }
    
    public void withdraw(double amount) {
        if (balance-amount >= 0)
            balance -= amount;
        else { System.out.println("cannot withdraw that much money"); return; }
    }
    
    public double check() {
        return balance;
    }
    
    public int getAccNo() { return accNo; }
}