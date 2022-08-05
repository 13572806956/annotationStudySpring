package com.me.annotationstudyspring;

import org.junit.jupiter.api.Test;
import org.springframework.core.annotation.AliasFor;
import org.springframework.core.annotation.AnnotatedElementUtils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface A15{

    @AliasFor("v2")
    String v1() default "";

    @AliasFor("v1")
    String v2() default "";
}

@A15(v1 = "我是V1")
public class UseAnnotation15 {

    @A15(v2 = "我是V2")
    private String name;

    @Test
    public void test() throws NoSuchFieldException {
        System.out.println(AnnotatedElementUtils.getMergedAnnotation(UseAnnotation15.class, A15.class));
        System.out.println(AnnotatedElementUtils.getMergedAnnotation(UseAnnotation15.class.getDeclaredField("name"), A15.class));

    }
}
