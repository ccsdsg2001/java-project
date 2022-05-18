package java1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author cc
 * @date 2022年05月18日 20:35
 */
public class Locktest {
    window window = new window();
    Thread thread2=new Thread(window);
    Thread thread3=new Thread(window);
    Thread thread=new Thread(window);

}


class window implements Runnable{

    private int ticket =100;

    private ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        try {

        }finally {

        }
        lock.lock();

        lock.unlock();
    }
}