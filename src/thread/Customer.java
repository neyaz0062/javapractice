package thread;

public class Customer {
    private  double balance;

    public Customer(double balance) {
        this.balance = balance;
    }
    public void getBalance() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("The balance is: "+balance);
    }

  synchronized public void withdraw(double amount) throws InterruptedException {
        Thread.sleep(1000);
        getBalance();
      System.out.println("Going to withdraw "+amount);
      if (amount > balance) {
          System.out.println("Insufficient balance : waiting for deposit");
          wait();

      }
      balance = balance - amount;
      System.out.println("Withdraw completed");
      getBalance();
    }

    synchronized public void deposit(double amount) throws InterruptedException {
        Thread.sleep(1000);
        getBalance();
        System.out.println("Going to deposit "+amount);
       balance = balance + amount;
       System.out.println("Deposit completed");
       getBalance();
       notify();
    }

    public static void main(String[] args) {
        Customer customer = new Customer(1000);

        Thread t1 = new Thread( () -> {
            try {
               customer.deposit(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });
        Thread t2 = new Thread( () -> {
            try {
                customer.withdraw(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
    }

}
