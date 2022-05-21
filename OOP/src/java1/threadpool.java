package java1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author cc
 * @date 2022年05月18日 22:45
 */
class NumberThread implements Runnable{
    @Override
    public void run() {
        for(int i =0;i<100;i++){
            if(i%2==0){
                System.out.println(i);

            }
        }
    }
}
public class threadpool {
    public static void main(String[] args) {
        ExecutorService Service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service1=(ThreadPoolExecutor) Service;
        service1.setCorePoolSize(15);
        Service.execute(new NumberThread());//适合使用于runnable
//        Service.submit();//适合使用于callable

        Service.shutdown();
    }
}
