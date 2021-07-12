class BankAccount {
    private double balance;
    private String name;

  public BankAccount(String n, double initialBalance) {
    balance= initialBalance;
    name=n;
  }

  public void deposit(double amount) {
    balance += amount;  
   }

  public void withdraw(double amount) {   
    if (amount<=balance)
       balance -= amount;
    else 
       System.out.println("You cannot withdraw that amount !");
  }

  public double getBalance() {   
    return balance;
  }    

  public String getName() {   
    return name;
  } 

   public void transfer (double amount, BankAccount other) {  
      balance -= amount;
      other.balance += amount;
   } 
}
