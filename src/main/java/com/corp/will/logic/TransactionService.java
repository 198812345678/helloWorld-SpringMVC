package com.corp.will.logic;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by will on 17/7/13.
 */
@Service
public class TransactionService implements MyInterface{


    @Transactional
    public void doSomething() {
        System.out.println("transaction biz !!!");
    }
}
