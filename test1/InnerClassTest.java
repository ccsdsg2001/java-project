package test1;


public class InnerClassTest {


}

class person{
    //成员内部类
    class dog{
        String name;

        public void sing(){
            System.out.println("");
        }

    }
    //静态内部类
    static class bird{

    }

    public void methon(){
        //内部类
        class A{

        }

        {
            class bb{

            }
        }
    }

    public  person(){
        class cc{

        }
    }
}
