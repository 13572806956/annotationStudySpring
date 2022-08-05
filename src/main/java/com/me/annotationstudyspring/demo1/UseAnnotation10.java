package com.me.annotationstudyspring.demo1;

import java.util.Map;

@Ann10("用在了类上")
public class UseAnnotation10<@Ann10("用在了类变量类型v1上") v1, @Ann10("用在了类变量类型v2上") v2> {

    private Map<@Ann10("用在了泛型类型上") String, Integer> map;

    public <@Ann10("用在了参数上") T> String m1(String name){
        return null;
    }
}
