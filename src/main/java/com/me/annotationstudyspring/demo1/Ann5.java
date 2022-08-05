package com.me.annotationstudyspring.demo1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Ann5 {
    String[] name() default {"Java", "JS"};
    int[] score() default 1;
    int age() default 30;
    String address();
}
