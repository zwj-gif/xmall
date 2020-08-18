package cn.exrick.common.annotation;

import java.lang.annotation.*;

/**
 * 限流注解
 * @author Exrickx
 */
@Target(ElementType.METHOD)//作用于方法上
@Retention(RetentionPolicy.RUNTIME)//修饰注解，是注解的注解，称为元注解
@Documented
public @interface RateLimiter {

    int limit() default 5;//限定次数
    int timeout() default 1000;//超时时间
}
//RetentionPolicy有3个值：CLASS  RUNTIME   SOURCE
//按生命周期来划分可分为3类：
//1、RetentionPolicy.SOURCE：注解只保留在源文件，当Java文件编译成class文件的时候，注解被遗弃；
//2、RetentionPolicy.CLASS：注解被保留到class文件，但jvm加载class文件时候被遗弃，这是默认的生命周期；
//3、RetentionPolicy.RUNTIME：注解不仅被保存到class文件中，jvm加载class文件之后，仍然存在；
