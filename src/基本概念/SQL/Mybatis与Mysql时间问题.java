package 基本概念.SQL;

/*
有关数据库时间时分秒的显示问题
java.util.Date   Mybatis TIMESTAMP   Mysql datetime

Mysql 中的时间类型 date（只有日期） 与 datetime（日期 时间）
Mybatis中的  DATE  与  TIMESTAMP
数据库中显示时间
    Mybatis 设置jdbcType="TIMESTAMP" javaType="java.util.Date"
    Mysql 设置datetime
java配合前端
    java
        @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private Date checkmonth;
    前端
        使用jstl
        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
        <fmt:formatDate value="${attendance.checkdate }" pattern="yyyy-MM-dd HH:mm:ss"/></td>

1. java.util.Date



*/
public class Mybatis与Mysql时间问题 {
    String a = "";


}
