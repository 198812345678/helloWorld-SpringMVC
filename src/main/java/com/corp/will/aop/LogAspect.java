package com.corp.will.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by will on 17/6/27.
 */
@Component
@Aspect
public class LogAspect {

    @Pointcut("@annotation(com.corp.will.annotation.InterfaceLoger)")
    private void methodLog() {

    }

    @Before("methodLog()")
    public void beforeLog(JoinPoint joinPoint) {
        System.out.println("------");
    }

    @Around("methodLog()")
    public void doAroundLog(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("=======");
        Object ret = joinPoint.proceed();
        System.out.println(ret);
    }
}
