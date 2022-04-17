package test.test.java;

import java.util.Scanner;
public class GPS数据处理 {

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String begin = "$GPRMC";
        int hh = 0;
        int mm = 0;
        int ss = 0;
        while (str.equals("END") == false) {

            if (!str.startsWith(begin)) {

                str = in.nextLine();
                continue;
            }
            int index = 1, sum = 0;
            char ch = str.charAt(index);
            while (ch != '*') {

                sum ^= ch;
                index++;
                ch = str.charAt(index);
            }
            sum %= 65536;
            int check = Integer.parseInt(str.substring(index + 1), 16);
            if (sum != check) {

                str = in.nextLine();
                continue;
            }
            int station = 0;
            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == ',') {

                    station++;
                }
                if (station == 2) {

                    station = i + 1;
                    break;
                }
            }
            if (str.charAt(station) == 'V') {

                str = in.nextLine();
                continue;
            }
            hh = (int)(str.charAt(7)-'0')*10 + (int)(str.charAt(8)-'0');
            mm = (int)(str.charAt(9)-'0')*10 + (int)(str.charAt(10)-'0');
            ss = (int)(str.charAt(11)-'0')*10 + (int)(str.charAt(12)-'0');
            str = in.nextLine();
        }
        hh = (hh + 8) % 24;
        if (hh < 10) {

            System.out.print("0");
        }
        System.out.print(hh + ":" + mm + ":" + ss);
        in.close();
    }

}