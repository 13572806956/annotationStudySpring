package com.me.annotationstudyspring.demo1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {
            ElementType.TYPE,
            ElementType.METHOD,
            ElementType.FIELD,
            ElementType.PARAMETER,
            ElementType.CONSTRUCTOR,
            ElementType.LOCAL_VARIABLE
})
public @interface Ann6 {
    String value();
    ElementType elementType();
}
