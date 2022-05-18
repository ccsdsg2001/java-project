package java1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author cc
 * @date 2022年05月18日 20:46
 */


class Account{
    private  double balance;
    public Account(double balance){
        this.balance=balance;
    }

    public  void deposit(double amt){

        ReentrantLock lock =new ReentrantLock();

        balance+=amt;
        lock.lock();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(balance);
        lock.unlock();
    }
}

class Customer extends Thread{
    private Account act;

    @Override
    public void run() {
        for(int i=0;i<3;i++){
           act.deposit(3000);
        }
    }

    public Customer(Account act) {
        this.act = act;
    }
}

public class bankThreadtest {
    public static void main(String[] args) {


        Account account = new Account(0);
        Customer c1 = new Customer(account);
        Customer c2 = new Customer(account);
        c1.setName("jia");
        c2.setName("yi");

        c1.start();
        c2.start();

    }
}