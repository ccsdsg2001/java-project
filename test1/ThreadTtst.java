/**
 * @author cc
 * @date 2022年05月13日 19:42
 */
class  mythread1 extends Thread{
    @Override
    public void run() {
        super.run();
        for(int j=0;j<100;j++){
            System.out.println(Thread.currentThread().getPriority()+"----");
        }
    }
}
class thread1 extends Thread {
        @Override
        public void run() {

            for (int i = 0; i < 100; i++) {
                if (i % 2 == 0) {
                    System.out.println(Thread.currentThread().getPriority()+i);
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }


public class ThreadTtst {
    public static void main(String[] args) {
        mythread1 mythread = new mythread1();
        mythread.start();

        //匿名子类
        new Thread(){
            public void run(){

            }
        }.start();


        thread1 thread1 = new thread1();
        thread1.setName("ada");
//        各主线程命名
        Thread.currentThread().setName("a");
        for (int j = 0; j < 100; j++) {
            System.out.println("-----");
            thread1.yield();
            thread1.setPriority(Thread.MAX_PRIORITY);

            try {
                thread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}