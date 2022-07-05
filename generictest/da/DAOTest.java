import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author cc
 * @date 2022年07月05日 16:31
 */
public class DAOTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();
        dao.save("1001",new User(12,23,"zk"));

        List<User> list = new ArrayList<>();
        Iterator<User> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
