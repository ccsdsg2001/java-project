package test.test.java;

import java.util.ArrayList;
import java.util.Scanner;

public class disanzhou  {
    ArrayList<String> name =new ArrayList<String>();
    ArrayList<Integer> integers =new ArrayList<Integer>();
    public void add(String s)
    {
        name.add(s);
    }

    public int getsize()
    {
        return name.size();
    }

    public String getString (int index)
    {
        return name.get(index);
    }

    public void addnum(int a)
    {
        integers.add(a);
    }

    public int getint(int index)
    {
        return integers.get(index);
    }

    public static void main(String[] args)
    {
        int cnt =0;
        disanzhou main = new disanzhou();
        Scanner in =new Scanner(System.in);
        String s =new String();
        do
        {
            if(cnt ==0)
            {
                s = in.next();
            }
            if (s.equals("###") ==true)
            {
                main.addnum(in.nextInt());
                cnt++;
            }
            else
            {
                main.add(s);
            }
        }
        while (cnt != main.getsize() * main.getsize());
        int ref =0;
        for (int i=0;i!=2;i++)
        {
            String s1=in.next();
            for(int j =0;i<main.getsize();j++)
            {
                if(main.getString(j).equals(s1))
                {
                    if(i==0)
                    {
                        ref =main.getsize()*j;
                    }
                    else  if(i ==1)
                    {
                        ref += j;
                    }
                }
            }
        }
        System.out.print(main.getint(ref));
    }

}
