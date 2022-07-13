package test2;

/**
 * @author cc
 * @date 2022年07月13日 22:03
 */

@Myannotation(value = "hi")
public class person extends  Creature<String> implements Comparable<String>,MyInterface{
    private String name;
    int age;
    public int id;
    public person(){};

    @Myannotation(value = "ac")
    private person(String name){
        this.name=name;
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Myannotation(value = "cn")
    private String show(String nation){
        System.out.println(nation);
        return nation;
    }
    public String display(String interests){
        return interests;
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }

    @Override
    public void info() {

    }
}
