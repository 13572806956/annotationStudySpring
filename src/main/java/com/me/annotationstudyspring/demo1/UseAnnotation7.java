package com.me.annotationstudyspring.demo1;

import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public class UseAnnotation7<@Ann7("T0是在类上声明的一个泛型类型变量") T0, @Ann7("T1是在类上声明的一个泛型类型变量") T1> {
    public <@Ann7("T2是在方法上声明的泛型类型变量") T2> void m1() {
    }

    public static void main(String[] args) throws NoSuchMethodException {
        TypeVariable<Class<UseAnnotation7>>[] typeParameters = UseAnnotation7.class.getTypeParameters();
        for (TypeVariable<Class<UseAnnotation7>> typeParameter : typeParameters) {
            print(typeParameter);
        }

        TypeVariable<Method>[] typeVariables = UseAnnotation7.class.getDeclaredMethod("m1").getTypeParameters();
        for (TypeVariable<Method> typeVariable : typeVariables) {
            print(typeVariable);
        }
    }

    private static void print(TypeVariable typeVariable){
        System.out.println("变量类型名称:" + typeVariable.getName());
        Arrays.stream(typeVariable.getAnnotations()).forEach(System.out::println);
    }
}
