/**
 * @author cc
 * @date 2022年05月15日 13:13
 */

 class window extends Thread{

    private static int ticket =100;
    @Override
    public void run() {
        while (true){
            if(ticket>0){
                System.out.println(getName()+"号为"+ticket);
                ticket--;
            }else{
                break;
            }
        }
    }
}

public class windowtest {
    public static void main(String[] args) {


        window window1 = new window();
        window window2 = new window();
        window window3 = new window();

        window1.setName("窜口");
        window2.setName("窜口2");
        window3.setName("窜口3");

        window1.start();
        window2.start();
        window3.start();

    }
}
