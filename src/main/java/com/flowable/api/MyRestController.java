package com.flowable.api;

import com.flowable.dto.TaskRepresentation;
import com.flowable.service.MyService;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyRestController {

    @Autowired
    private MyService myService;

    @PostMapping(value="/process")
    public void startProcessInstance() {
        myService.startProcess();
    }

    @GetMapping(value="/tasks", produces= MediaType.APPLICATION_JSON_VALUE)
    public List<TaskRepresentation> getTasks(@RequestParam String assignee) {
        List<Task> tasks = myService.getTasks(assignee);
        List<TaskRepresentation> dtoList = new ArrayList<TaskRepresentation>();
        for (Task task : tasks) {
            dtoList.add(new TaskRepresentation(task.getId(), task.getName()));
        }
        return dtoList;
    }
}
