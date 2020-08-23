package com.activiti.practice.bpm.controller;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/bpm")
public class BpmTaskController {

    @Autowired
    private RuntimeService runtimeService;

    @RequestMapping("/create/process/{processId}")
    public String createProcess(@PathVariable("processId") String processId) {

//        Process id is defined in activiti-sample-process.bpmn20.xml file, in our case it is sampleProcess
        System.out.println("\n\n" + processId);

//        Set the environment variables which will be available for all the service tasks and script tasks
//        of process instance
        Map<String, Object> environmentVariables = new HashMap<>();
        environmentVariables.put("text", "this text set on process instantiation");

//        Start the process instance
//        It will execute all the service tasks and script task as per the defined sequenceFlow
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(processId, environmentVariables);

        return processInstance.getProcessInstanceId();
    }


}
