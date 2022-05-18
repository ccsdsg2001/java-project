package java1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author cc
 * @date 2022年05月18日 22:05
 */


class num implements Callable{
    @Override
    public Object call() throws Exception {
        int sum =0;
        for(int i =0;i<100;i++){
            if(i%2==0){
                System.out.println(i);
                sum+=i;
            }
        }
        return sum;
    }
}
public class THreadnew {
    public static void main(String[] args) {
        num num=new num();

        FutureTask futureTask = new FutureTask(num);

        new Thread(futureTask).start();
        try {
            Object sum =futureTask.get();
            futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}


