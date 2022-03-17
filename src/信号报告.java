import java.util.Scanner;

public class 信号报告 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int R = num /10;
        int S = num %10;
        switch (R)
        {
            case 1:
                System.out.println("Unreadabele");
                break;
            case 2:
                System.out.println("Barely readable, occasional words distinguishable");
                break;
            case 3:
                System.out.println("Readable with considerable difficulty");
                break;
            case 4:
                System.out.println("Readable with practically no difficulty");
                break;
            case 5:
                System.out.println("Perfectly readable");
                break;
        }
        switch (S)
        {
            case 1:
                System.out.println("Faint signals, barely perceptible");
                break;
            case 2:
                System.out.println("Very weak signals");
                break;
            case 3:
                System.out.println("Weak signals");
                break;
            case 4:
                System.out.println("Fair signals");
                break;
            case 5:
                System.out.println("Fairly good signals");
                break;
            case 6:
                System.out.println("Good signals");
                break;
            case 7:
                System.out.println("Moderately strong signals");
                break;
            case 8:
                System.out.println("Strong signals");
                break;
            case 9:
                System.out.println("Extremely strong signals");
                break;

        }
    }
}
