package com.me.annotationstudyspring;

import org.junit.jupiter.api.Test;
import org.springframework.core.annotation.AliasFor;
import org.springframework.core.annotation.AnnotatedElementUtils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface A16{
    String name() default "a";
}

@A16
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface B16{
    @AliasFor(annotation = A16.class)
    String name() default "b";
}

@B16(name = "hahaha")
public class UseAnnotation16 {
    @Test
    public void test(){
        System.out.println(AnnotatedElementUtils.getMergedAnnotation(UseAnnotation16.class, B16.class));
        System.out.println(AnnotatedElementUtils.getMergedAnnotation(UseAnnotation16.class, A16.class));
    }
}
