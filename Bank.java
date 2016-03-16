import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
    
    // to open an account need name, addr, birth, type provided
    // if under age of 16 may open junior account
    // should evoke outside Credit agency to check customer's credit history
    public void Open(int accNo, String accName) {
        BankAccount account = new BankAccount(accNo, accName);
        accounts.add(account);
    }
    
    public void close(int accNo) {
        for (BankAccount : accounts) {
            if (BankAccount.getAccNo == accNo) {
                account.remove(BankAccount);
            }
    }
    
    public static void main(String[] args) {
        