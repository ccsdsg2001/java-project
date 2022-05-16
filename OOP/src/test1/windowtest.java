package test1;

/**
 * @author cc
 * @date 2022年05月15日 13:13
 */

 class window implements Runnable {

    private static int ticket = 100;
    Object object = new Object();
    @Override
    public synchronized void run() {
        while (true) {
            show();
        }
    }

    public void show() {
        while (true) {
//            synchronized (object) {//synchronized (this){错误的
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "号为" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }




}
//        while (true) {
//            synchronized (object) {//synchronized (this){错误的
//                if (ticket > 0) {
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName() + "号为" + ticket);
//                    ticket--;
//                } else {
//                    break;
//                }
//            }
//        }
//    }
//}



public class windowtest {
    public static void main(String[] args) {
        window window1 = new window();
        window window2 = new window();
        window window3 = new window();
//       Thread thread =new Thread(window1);
//       Thread thread2 =new Thread(window1);
//       Thread thread3 =new Thread(window1);


//       window1.setName("1");
//       window2.setName("2");
//       window3.setName("3");
//
//       window1.start();
//       window2.start();
//       window3.start();
        }
    }
