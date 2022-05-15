package test1;

public class Exceptiontest {
    public static void main(String[] args) {


        String s2tring = "123";
        s2tring ="abd";
        try {
            int num =Integer.parseInt(s2tring);
        }catch (NumberFormatException e){
            System.out.println("cc");

        }finally {
            System.out.println("cs");
        }
    }

}
class ex{
    public void method1() throws Exception{

    }
}