import java.util.Scanner;

public class 时间换算 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int UTC = 0;
        int BJT;
        BJT = in.nextInt();
        int m = BJT  % 100;
        if (BJT < 800 && m<=60)  //第二天换算
        {
            UTC = BJT +1600;
            System.out.println(UTC);
            if(UTC==2400)
            {
                UTC = 0;
            }
        }
        else if(BJT <= 2359 && m <= 60)
        {
            UTC = (BJT-800);
            System.out.println(UTC);
        }
        else
        {
            System.out.println("输入时间错误");
        }


    }
}
