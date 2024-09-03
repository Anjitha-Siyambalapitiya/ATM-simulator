public class account {
    private String accNumber;

    private String currency;

    private String branch;

    private double balance;

    account(String accNumber, String currency, String branch, double balance) {
        this.accNumber = accNumber;
        this.currency = currency;
        this.branch = branch;
        this.balance = balance;
    }
    public String getNumber(){
        return accNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void withdraw(double amount){     //withdraw method, check account balance and issue money from the account and change the balance after withdraw
        if(balance<amount){
            System.out.println("NO enough balance");
        }
        else{
            balance = balance - amount;
            System.out.println("Withdraw amount: "+ amount);
            new transactions(this, "Successful");
        }
    }

    public void deposit(double amount){   //deposit method, add the deposit money to the balance
        balance =+ amount;
        System.out.println("Successfully deposit"+ amount);
        new transactions(this, "Successful");
    }
}
