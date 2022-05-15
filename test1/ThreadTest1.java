/**
 * @author cc
 * @date 2022年05月15日 13:24
 */
class ThreadTest implements Runnable {
    @Override
    public void run() {
        for(int i =0;i<100;i++){
            if(i%2==0){
                System.out.println("1");
            }
        }
    }
}

public class ThreadTest1 {
    public static void main(String[] args) {
        ThreadTest threadTest=new ThreadTest();
        Thread thread = new Thread(threadTest);
        Thread thread1 = new Thread(threadTest);

        thread.start();
        thread1.start();

    }
}

