package Annotation;

import java.lang.annotation.*;




// Method Level Annotation
@Inherited
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Institute {
    String Name() default "DurgaSoft";

    String Website() default "WWW>DurgaSoft.com";

    String Phone() default "07003400";

    String Branch() default "Bhilwara";
}
