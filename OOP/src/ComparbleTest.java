import java.util.Arrays;
import java.util.Comparator;

/**
 * @author cc
 * @date 2022年05月29日 23:03
 */
public class ComparbleTest implements Comparable {
    public static void main(String[] args) {
        String[] cc=new String[]{"AA","BB","FF"};

        Arrays.sort(cc);
        Arrays.sort(cc, new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        });
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }



}
