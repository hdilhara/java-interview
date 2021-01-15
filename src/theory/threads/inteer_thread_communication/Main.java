package theory.threads.inteer_thread_communication;


class Bank{

    double currentAmount = 5000;

    synchronized void withdraw(double withdrawAmount){
        if(withdrawAmount<currentAmount){
            currentAmount -= withdrawAmount;
        }else {
            try {
                System.out.println("Withdrawal is waiting!");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            currentAmount -= withdrawAmount;
        }
        System.out.println("Withdrwal successfull! \n withdraw amount: "+withdrawAmount);
        printCurrentAmmount();
    }

    synchronized void deposite(double dipositeAmount){
        currentAmount += dipositeAmount;
        System.out.println("Deposite successfull! \n deposite amount: "+dipositeAmount);
        printCurrentAmmount();
        notify();
    }

    private void printCurrentAmmount() {
        System.out.println("Current amount: "+currentAmount);
    }
}

class Withdraw extends Thread{
    Bank bank;
    int amount;

    Withdraw(Bank bank, int amount){
        this.bank = bank;
        this.amount = amount;
    }

    @Override
    public void run() {
        System.out.println("Withdrawal Service is running...");
        super.run();
        bank.withdraw(amount);
    }
}

class Deposite extends Thread{

    Bank bank;
    int amount;

    Deposite(Bank bank, int amount){
        this.bank = bank;
        this.amount = amount;
    }

    @Override
    public void run() {
        System.out.println("Deposit Service is running...");
        super.run();
        bank.deposite(amount);
    }
}

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();

        Thread deposite = new Deposite(bank,100000);
        Thread withdraw = new Withdraw(bank, 55000 );

        withdraw.start();
        deposite.start();



    }

}
