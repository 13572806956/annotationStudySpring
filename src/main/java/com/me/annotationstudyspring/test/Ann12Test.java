package com.me.annotationstudyspring.test;

import com.me.annotationstudyspring.demo1.UseAnnotation12;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Ann12Test {
    public static void main(String[] args) throws NoSuchFieldException {
        Annotation[] annotations = UseAnnotation12.class.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        System.out.println("-----------------------");
        Field v1 = UseAnnotation12.class.getDeclaredField("v1");
        Annotation[] annotations1 = v1.getAnnotations();
        for (Annotation annotation : annotations1) {
            System.out.println(annotation);
        }
    }
}
