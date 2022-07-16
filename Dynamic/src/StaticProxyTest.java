/**
 * @author cc
 * @date 2022年07月16日 13:55
 */
//静态代理类特点：代理类和被代理类在编译期间就确定下来了


interface ClothFactory{
    void produceCloth();
}

class ProxyClothFactory implements ClothFactory{
    private ClothFactory factory;

    public ProxyClothFactory(ClothFactory Factory){
        this.factory=Factory;
    }


    @Override
    public void produceCloth() {
        System.out.println("zhunbei");

        factory.produceCloth();
    }
}

//别代理类
class NileProxy implements ClothFactory{

    @Override
    public void produceCloth() {
        System.out.println("shengchang");
    }
}
public class StaticProxyTest {
    public static void main(String[] args) {
//        创建被代理类的对象
        NileProxy nileProxy = new NileProxy();
//        创建代理类的对象
        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(nileProxy);
        proxyClothFactory.produceCloth();

    }
}
