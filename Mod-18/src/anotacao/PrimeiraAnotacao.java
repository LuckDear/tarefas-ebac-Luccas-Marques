package anotacao;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface PrimeiraAnotacao {
    String value();
    String[] bairros();
    long numCasa();
    double valores() default 10d;
}
