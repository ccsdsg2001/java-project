package src.test;

/**
 * @author cc
 * @date 2022年07月12日 2:49
 */
public class Person {
    private String name;
    public int Age;
    public int id;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        Age = age;
    }
    private Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "test.Person{" +
                "name='" + name + '\'' +
                ", Age=" + Age +
                '}';
    }

    public void show(String nation){
        System.out.println(nation);

    }

    private void AT(){
        System.out.println("private");
    }

    private static void showDesc(){
        System.out.println("wddddd");
    }
}
