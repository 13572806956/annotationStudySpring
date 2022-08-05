package com.me.annotationstudyspring.demo1;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
@Repeatable(Ann12s.class)
@interface Ann12 {
    String name();
}
