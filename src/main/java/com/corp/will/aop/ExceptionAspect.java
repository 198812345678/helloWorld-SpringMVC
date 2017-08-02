package com.corp.will.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by will on 17/7/13.
 */
@Aspect
@Component
public class ExceptionAspect {

    @Pointcut("@annotation(com.corp.will.annotation.ExceptionLog)")
    private void exceptionLog() {

    }

    @AfterThrowing("exceptionLog()")
    private void doExceptionLog() {
        System.out.println("exception aspect");
    }
}
