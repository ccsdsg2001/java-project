package src.test2;

import java.lang.annotation.*;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Target({TYPE,FIELD,METHOD,PARAMETER,CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Myannotation {
    String value() default "hello";

}
