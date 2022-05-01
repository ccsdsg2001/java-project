package test.test.java;

public class BLOCKTEST {
    public static void main(String[] args) {
        test23 test23 =new test23(1, "23");
        test23.toString();
    }
}


class test23{
    public int num;
    public String name;
    public String des;

    public test23(int num, String name) {
        this.num = num;
        this.name = name;
    }
    static {
        System.out.println("12312");
    }


    {
        System.out.println("213");
    }

    @Override
    public String toString() {
        return "test23{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
