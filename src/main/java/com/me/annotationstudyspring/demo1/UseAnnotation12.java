package com.me.annotationstudyspring.demo1;

@Ann12(name = "Java")
@Ann12(name = "Spring")
public class UseAnnotation12 {
    @Ann12s({@Ann12(name = "高并发"), @Ann12(name = "MySQL")})
    private String v1;
}
