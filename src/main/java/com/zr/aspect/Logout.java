package com.zr.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
@Aspect
/*
 * 切面
 * 切入点和通知的抽象
 * 定义切入点和对应的通知
 *   切入点：定义要拦截类的哪些方法@Pointcut
 *   通知:定义拦截之后要做的事情
 *
 * */
public class Logout {
/*    //@Pointcut()
        属性 修饰范围* > public > private > protected    执行任意set方法 execution(*set*(..))
        value规则 路径.类.方法.参数
        argNames

*/

//    @Pointcut("execution(* com.zr.service.*.*(..) )")
    @Pointcut("execution(* com.zr.service.Impl.*.*(..))")
    //设置指定包下的任意方法
    public void method1() {
        System.out.println("第1切面方法");
    }
    @Before(value = "method1()")
    public void before(){
        System.out.println("method1切入点的前置通知");

    }
    @AfterReturning(value =" method1()")
    public void afterReturning(){
        System.out.println("返回值通知");
    }
    @After(value = "method1()")
    public void after(){
        System.out.println("最终通知");
    }
    @AfterThrowing(value = "method1()" ,throwing="e")
    public void AfterThrowing(Exception e){
        System.out.println("异常通知"+e.getMessage());
    }

}

