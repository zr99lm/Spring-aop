package com.zr.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
public class logout02 {
    //设置指定包下的任意方法
    public void method1() {
        System.out.println("第1切面方法");
    }
    public void before(){
        System.out.println("method1切入点的前置通知");

    }
    public void afterReturning(){
        System.out.println("返回值通知");
    }
    public void after(){
        System.out.println("最终通知");
    }
    public void AfterThrowing(Exception e){
        System.out.println("异常通知"+e.getMessage());
    }

}
