package test.java;

class openException extends Throwable{

}
public class excepti {
    public static int open(){
        return -1;
    }
    public static void readfile() throws openException {
        if( open() == -1){
            throw new openException();
        }
    }
    public static void main(String[] args){
        int[] name =new int[10];

        try {
            name[10] =5;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("caught");
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
            throw e;
        }

    }
}
