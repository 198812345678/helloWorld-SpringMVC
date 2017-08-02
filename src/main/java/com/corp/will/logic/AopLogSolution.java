package com.corp.will.logic;

import com.corp.will.annotation.ExceptionLog;
import com.corp.will.annotation.InterfaceLoger;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by will on 17/6/27.
 */
@Component
public class AopLogSolution implements MyInterface{

    @Resource
    private AnnotherService annotherService;

    @Resource
    private AnnotherService2 annotherService2;

    @InterfaceLoger
    @ExceptionLog
    public void doSomething() {
        System.out.println();
        try {
            throw new RuntimeException("my exception");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
