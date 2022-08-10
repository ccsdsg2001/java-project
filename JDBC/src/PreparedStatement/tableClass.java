package PreparedStatement;

/**
 * @author cc
 * @date 2022年08月10日 14:26
 * ORM编程思想(object relational mapping)
 * 一个数据表对应一个java类
 * 表中一条记录对应java类的一个对象
 * 表中的一个字段对应java类的一个属性
 */
public class tableClass {
     private String id;
     private String name;

    public tableClass() {
    }

    public tableClass(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "tableClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
