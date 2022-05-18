package java1;

/**
 * @author cc
 * @date 2022年05月18日 21:21
 */

class Clerk{

    public int productcount=0;

    public synchronized void produceProduct() {

        if(productcount<20){
            productcount++;
            System.out.println("shenggchang");
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void cousumeProduct() {
        if(productcount<10){
            productcount++;
            System.out.println("xiaofei");
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class prooducer extends Thread{
    private Clerk clerk;

    public prooducer(Clerk clerk){
        this.clerk=clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+":"+"开始生成");
        while (true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }
    }
}

class Consumer extends Thread{
    private Clerk clerk;

    public Consumer(Clerk clerk){
        this.clerk=clerk;
    }

    @Override
    public void run() {
        super.run();

        while (true){

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.cousumeProduct();
        }

    }
}

public class producttest {
    public static void main(String[] args) {
        Clerk clerk=new Clerk();

        prooducer p1=new prooducer(clerk);
        p1.setName("shengchangzhe");
        Consumer c1=new Consumer(clerk);
        c1.setName("xiaofengzhe");

        p1.start();
        c1.start();
    }
}
