import java.util.Arrays;

/**
 * @author cc
 * @date 2022年05月29日 23:03
 */
public class ComparbleTest implements Comparable {
    public static void main(String[] args) {
        String[] cc=new String[]{"AA","BB","FF"};

        Arrays.sort(cc);

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
