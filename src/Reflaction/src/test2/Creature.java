package src.test2;

import java.io.Serializable;

/**
 * @author cc
 * @date 2022年07月13日 22:01
 */
public class Creature<T> implements Serializable {
    private char gender;
    public double weight;

    private void breath(){
        System.out.println("huxi");
    }

    public void eat(){
        System.out.println("chidongxi");
    }

}
