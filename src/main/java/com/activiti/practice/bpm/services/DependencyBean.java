package com.activiti.practice.bpm.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DependencyBean {

    private static Logger logger = LoggerFactory.getLogger(DependencyBean.class);

    public void print(String msg) {
        logger.info("Spring Dependency Bean -> \n " + this + " | Massage " + msg);

    }

}
