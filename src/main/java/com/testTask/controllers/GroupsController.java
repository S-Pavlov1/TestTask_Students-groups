package com.testTask.controllers;

import com.testTask.models.Groups;
import org.springframework.web.bind.annotation.*;
import com.testTask.services.GroupsService;

import java.util.List;

@RestController
@RequestMapping("/Groups")
public class GroupsController {

   private GroupsService service;

    @GetMapping("")
    public List<Groups> getEntities() {
        return service.getEntities();
    }

    @PostMapping("")
    public void addEntity(@RequestBody Groups entity){
        service.addEntity(entity);
    }
}
