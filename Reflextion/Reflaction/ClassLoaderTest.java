import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author cc
 * @date 2022年07月13日 0:30
 */
public class ClassLoaderTest {
    @Test
    public void test1(){
//        对于自定义类，使用系统类加载器加载
        ClassLoader classLoader=ClassLoader.class.getClassLoader();
        System.out.println(classLoader);
//        调用系统类加载器的getParent（）：获取拓展类加载器
        ClassLoader classLoader1=classLoader.getParent();
        System.out.println(classLoader1);
//        调用拓展类加载器的getParent（）：无法获取引导类加载器
//        引导类加载器主要加载java核心类，无法加载自定义类
        ClassLoader classLoader2=classLoader1.getParent();
        System.out.println(classLoader2);

    }

    @Test
    public void test2() throws Exception {

//        读取配置文件方式一：
        Properties properties=new Properties();
        FileInputStream fis=new FileInputStream("jdbc.properties");
        properties.load(fis);
//        读取配置文件方式二：使用ClassLoader
//        配置文件默认识别为：当前module的src下

        ClassLoader classLoader=ClassLoader.class.getClassLoader();
        InputStream is=classLoader.getResourceAsStream("jdbc.properties");
        properties.load(is);

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        System.out.println("user="+user+"passw"+password);
    }

}
