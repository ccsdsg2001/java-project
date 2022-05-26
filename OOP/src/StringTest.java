import java.util.Arrays;

/**
 * @author cc
 * @date 2022年05月21日 23:44
 */

public class StringTest {


    public static void main(String[] args) {
        String s1="hello World";
        System.out.println(s1.length());
        System.out.println(s1.charAt(2));
        System.out.println(s1.isEmpty());
        String s2=s1.toLowerCase();
        System.out.println(s2.toLowerCase());
        String s3="  dada dasds das   ";
        System.out.println(s3.trim());
        System.out.println(s1.equalsIgnoreCase(s2));
        String s5="af";
        String s6=s3.concat(s5);
        System.out.println(s6);
        System.out.println(s5.compareTo(s3));
        System.out.println(s1.substring(1,3));
        System.out.println(s1.endsWith("ld"));
        System.out.println(s1.startsWith("he"));
        System.out.println(s1.startsWith("11",2));
        System.out.println(s1.contains(s2));
        System.out.println(s1.indexOf("h"));
        System.out.println(s1.indexOf("h",5));
        System.out.println(s1.lastIndexOf("h",5));
        System.out.println(s1.replace("h", "w"));
        System.out.println(s1.matches("^h|l$"));

        String s22="123";
        int num=Integer.parseInt(s22);
        System.out.println(num);

        String srt1="abc123";
        char[] chars = srt1.toCharArray();
        for(char chars1:chars){
            System.out.println(chars1);
        }

        String st1="ada中国";
        byte[] bytes=st1.getBytes();
        System.out.println(Arrays.toString(bytes));

    }

    //指定字符串反转
    public  String reverse(String srt,int startindex,int endindex){
        char[] chars = srt.toCharArray();
        for(int x=startindex,y=endindex;x<y;x++,y--){
            char temop=chars[x];
            chars[x]=chars[y];
            chars[y]=temop;
        }

        return new String(chars);

    }

}


