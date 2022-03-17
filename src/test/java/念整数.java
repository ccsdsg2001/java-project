import java.util.Scanner;
public class 念整数 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int [] cnt = new int[7];
        int sum=0;
        boolean flag = true;
        if(num < 0)
            flag = false;
        num = Math.abs(num);
        if(num == 0)
        {
            System.out.println("ling");
        }
        if(flag == false)
        {
            System.out.print("fu" +" ");
        }
        while(num != 0)
        {
            cnt[sum++] = num % 10;
            num/=10;
        }
        for(int i = sum - 1; i >= 0; i--)
        {
            switch(cnt[i])
            {
                case 0:
                    System.out.print("ling");
                    break;
                case 1:
                    System.out.print("yi");
                    break;
                case 2:
                    System.out.print("er");
                    break;
                case 3:
                    System.out.print("san");
                    break;
                case 4:
                    System.out.print("si");
                    break;
                case 5:
                    System.out.print("wu");
                    break;
                case 6:
                    System.out.print("liu");
                    break;
                case 7:
                    System.out.print("qi");
                    break;
                case 8:
                    System.out.print("ba");
                    break;
                case 9:
                    System.out.print("jiu");
                    break;
            }
            if(i==0)
            {
                System.out.println();
            }
            else
            {
                System.out.print(" ");
            }
        }
    }

}

