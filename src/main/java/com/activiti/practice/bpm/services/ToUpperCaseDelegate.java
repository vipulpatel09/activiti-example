package com.activiti.practice.bpm.services;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 *
 * This is delegate class used for service task.
 *  It needs to be implemented by JavaDelegate interface.
 *
 * */

public class ToUpperCaseDelegate implements JavaDelegate {

    private static Logger logger = LoggerFactory.getLogger(ToUpperCaseDelegate.class);

    @Override
    public void execute(DelegateExecution execution) {

        logger.info("Spring UpperCase Delegate -> \n " + this);
        execution.setVariable("upperCaseText", ((String) execution.getVariables().get("text")).toUpperCase());

    }

}

