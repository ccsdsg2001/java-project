import java.util.Scanner;
public class 素数和 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int num = 0;
        int ans = 0;
        int n=0, m=0;
        boolean flag;
        n = in.nextInt();
        m = in.nextInt();
        begin: for (int i = 2;;i++ )
        {
            flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++)
            {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true)
            {
                num++;
                if(num >= n && num <= m)
                    ans += i;
                if (num == m)
                    break begin;
            }
        }
        System.out.println(ans);
        in.close();
    }
}
