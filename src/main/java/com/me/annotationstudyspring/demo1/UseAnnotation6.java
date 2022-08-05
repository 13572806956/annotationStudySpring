package com.me.annotationstudyspring.demo1;

import java.lang.annotation.ElementType;

@Ann6(value = "我用在类上", elementType = ElementType.TYPE)
public class UseAnnotation6 {

    @Ann6(value = "我用在字段上", elementType = ElementType.FIELD)
    private String a;

    @Ann6(value = "我用在构造方法上", elementType = ElementType.CONSTRUCTOR)
    public UseAnnotation6(@Ann6(value = "我用在方法参数上", elementType = ElementType.PARAMETER) String a) {
        this.a = a;
    }

    @Ann6(value = "我用在普通方法上面", elementType = ElementType.METHOD)
    public void m1(){
        @Ann6(value = "我用在本地变量上", elementType = ElementType.LOCAL_VARIABLE) String a;
    }
}
