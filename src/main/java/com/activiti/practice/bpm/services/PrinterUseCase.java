package com.activiti.practice.bpm.services;

import org.activiti.engine.delegate.DelegateExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class PrinterUseCase {

    private static Logger logger = LoggerFactory.getLogger(PrinterUseCase.class);

    public void printMessage(DelegateExecution execution, String massage) {

        logger.info("Spring Printer Bean -> \n" + this + "  | massage --> " + massage);
        System.out.println(execution.getVariables());

    }

    public void printUserDetails(UserModel user) {

        System.out.println("First Name : " + user.getFirstName() + " | Last Name : " + user.getLastName());

    }

}
