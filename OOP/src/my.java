import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({CON})
@Documented
@Inherited
public @interface my {
    String value() default "d";
}
