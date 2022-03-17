package test.java;

public class 双层循环 {
    public static  void main(String[] args){
        for(int i = 0;i<3;i++)
        {
            for (int j =0;j<6;j++)
            {
                if (j ==4)
                {
                    break;
                }
            }System.out.println("i"+i);
            System.out.println();
        }
    }
}
