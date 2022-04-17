package test.test.java;

import java.util.Locale;
import java.util.ResourceBundle;

public class 国际化 {
    public static void main(String[] args){
        Locale mylocale =Locale.getDefault();//取得系统默认语言
        System.out.println(mylocale);
        ResourceBundle bundle =ResourceBundle.getBundle("message",mylocale);
        System.out.println(bundle.getString("hello"));
    }
}
