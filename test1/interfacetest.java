package test1;
//体现接口的多态性
public class interfacetest {
    public static void main(String[] args) {

        computer computer=new computer();
        printer printer =new printer();
        computer.tran(printer);


    }
}
class computer{
    public void tran(usb usb){
        usb.start();
        System.out.println("details");
        usb.stop();
    }
}

interface usb{
    void start();
    void stop();
}

class printer implements usb{

    @Override
    public void start() {
        System.out.println("kai");
    }

    @Override
    public void stop() {
        System.out.println("guan");

    }
}




//class ar{
//    int name;
//    public void ar(int name){
//        this.name =name;
//    }
//
//}
//interface fly{
//
//    public static final  int SPEED =7;
//    public static final  int minspeed =1;
//
//    public abstract void fly();
//
//    public abstract void stop();
//
//}
//
//class plane extends ar implements fly,attack{
//
//    @Override
//    public void fly() {
//
//    }
//
//    @Override
//    public void stop() {
//
//    }
//
//    @Override
//    public void attack() {
//
//    }
//
//}
//
//
//
//interface attack{
//    void attack();
//}
//interface a23r extends  attack{
//    @Override
//    void attack();
//}