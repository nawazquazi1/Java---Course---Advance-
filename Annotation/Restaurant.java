package Annotation;


import java.lang.annotation.*;
// Field Level Annotations
@Inherited
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Restaurant {
    String id() default "R-111";

    String name() default "Paradise";

    String phone() default "010101";

    String website() default "WWW.Paradise.com";
}
