public class MultipleThreads {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        System.out.println("Initial Balance: " + account.getBalance());

        Runnable depositRunnable = () -> {
            for(int i=0; i<5; i++) {
                account.deposit(100);
            }
        };

        Runnable withdrawRunnable = () -> {
            for(int i=0; i<5; i++) {
                account.withdraw(200);
            }
        };

        Thread depositThread1 = new Thread(depositRunnable);
        Thread depositThread2 = new Thread(depositRunnable);
        Thread withdrawThread1 = new Thread(withdrawRunnable);
        Thread withdrawThread2 = new Thread(withdrawRunnable);

        depositThread1.start();
        depositThread2.start();
        withdrawThread1.start();
        withdrawThread2.start();
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("🟢 Deposited: $" + amount + ", Current Balance: $" + balance);
    }

    public synchronized void withdraw(double amount) {
        balance -= amount;
        System.out.println("🔴 Withdrawn: $" + amount + ", Current Balance: $" + balance);
    }
}
