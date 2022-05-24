package test1;

/**
 * @author cc
 * @date 2022年05月24日 22:05
 */
public class Stringbuffertest {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("avc");
        s1.setCharAt(0,'A');
        System.out.println(s1);
        s1.append('1');
        s1.delete(1, 2);
        s1.replace(1, 3, "da");
        s1.insert(1,false);
        s1.reverse();


    }

}