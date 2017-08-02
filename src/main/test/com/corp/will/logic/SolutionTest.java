package com.corp.will.logic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by will on 17/6/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class SolutionTest {

    @Resource
    private MyInterface aopLogSolution;

    @Resource
    private MyInterface transactionService;

    @Test
    public void doSomething() throws Exception {
        aopLogSolution.doSomething();
    }

    @Test
    public void doTransactionThingTest() {
        transactionService.doSomething();
    }
}