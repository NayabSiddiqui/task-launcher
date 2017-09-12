package com.tolls.taskintake.controller;

import com.tolls.taskintake.TaskProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TaskController {

    @Autowired
    private TaskProcessor taskProcessor;

    @RequestMapping(path = "/tasks", method = RequestMethod.POST)
    public @ResponseBody String launchTask(@RequestBody String payload){
        taskProcessor.publishRequest(payload);
        System.out.println("request made");
        return "success";
    }
}
