package com.me.annotationstudyspring.test;

import com.me.annotationstudyspring.demo1.UseAnnotation11;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class Ann11Test {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        m7();
    }

    //  解析类上的注解
    public static void m1(){
        for (Annotation annotation : UseAnnotation11.class.getAnnotations()) {
            System.out.println(annotation);
        }
    }

    //  解析类上的类型变量的注解
    public static void m2(){
        TypeVariable<Class<UseAnnotation11>>[] typeParameters = UseAnnotation11.class.getTypeParameters();
        for (TypeVariable<Class<UseAnnotation11>> typeParameter : typeParameters) {
            System.out.println(typeParameter.getName() + "变量类型注解信息");
            Annotation[] annotations = typeParameter.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation);
            }
        }
    }

    //  解析name上的注解
    public static void m3() throws NoSuchFieldException {
        Field nameField = UseAnnotation11.class.getDeclaredField("name");
        for (Annotation annotation : nameField.getAnnotations()) {
            System.out.println(annotation);
        }
    }

    //  解析泛型字段map上的注解
    public static void m4() throws NoSuchFieldException {
        Field mapField = UseAnnotation11.class.getDeclaredField("map");
        Type genericType = mapField.getGenericType();
        Type[] actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments();

        AnnotatedType annotatedType = mapField.getAnnotatedType();
        AnnotatedType[] annotatedActualTypeArguments = ((AnnotatedParameterizedType) annotatedType).getAnnotatedActualTypeArguments();
        int i = 0;
        for (AnnotatedType actualTypeArgument : annotatedActualTypeArguments) {
            Type actualTypeArgument1 = actualTypeArguments[i++];
            System.out.println(actualTypeArgument1.getTypeName() + "类型上的注解如下：");
            for (Annotation annotation : actualTypeArgument.getAnnotations()) {
                System.out.println(annotation);
            }
        }
    }

    //  解析构造函数上的注解
    public static void m5(){
        Constructor<?> constructor = UseAnnotation11.class.getConstructors()[0];
        for (Annotation annotation : constructor.getAnnotations()) {
            System.out.println(annotation);
        }
    }

    //  解析m1方法上的注解
    public static void m6() throws NoSuchMethodException {
        Method method = UseAnnotation11.class.getMethod("m1", String.class);
        for (Annotation annotation : method.getAnnotations()) {
            System.out.println(annotation);
        }
    }

    //  解析m1方法参数上的注解
    public static void m7() throws NoSuchMethodException {
        Method method = UseAnnotation11.class.getMethod("m1", String.class);
        Parameter[] parameters = method.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(String.format("参数%s上的注解如下:",parameter.getName()));
            for (Annotation annotation : parameter.getAnnotations()) {
                System.out.println(annotation);
            }
        }
    }
}
