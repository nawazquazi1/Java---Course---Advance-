package Annotation;
// class level annotation
import java.lang.annotation.*;
import java.lang.reflect.Type;
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Target(ElementType.TYPE)
@Documented
public @interface Bank {
    String id()default "B-111";
    String name()default "ICICI Bank";
    String branch()default "Ajmer";
    String website()default "WWW.iciciBank.com/Ajmer";
}