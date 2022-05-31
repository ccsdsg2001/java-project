/**
 * @author cc
 * @date 2022年05月31日 22:47
 */
public class enumtest {
}

class Season{
    //声明属性使用private final
    private  final  String seasonname;
    private Season(String seasonname){
        this.seasonname=seasonname;
    }

    public static final Season SEASON =new Season("123");
    public static final Season S2EASON =new Season("dsa");
    public static final Season S3EASON =new Season("dasd");
    public static final Season SE3ASON =new Season("");
}

enum  season1{
    spring2("d");


    private  final  String seasonname1;
    private season1(String seasonname){
        this.seasonname1=seasonname;
    }

    @Override
    public String toString() {
        return "season1{" +
                "seasonname1='" + seasonname1 + '\'' +
                '}';
    }
}
