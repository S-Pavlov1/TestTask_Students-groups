package com.testTask.controllers;

import com.testTask.models.Groups;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.testTask.services.GroupsService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/University-groups")
public class GroupsController {

   @Autowired
   private GroupsService service;


    @GetMapping
    public List<Groups> getEntities() {
        System.out.println("trying to get groups");
        return service.getEntities();
    }

    @PostMapping
    public Groups addEntity(@RequestBody Groups entity){
        System.out.println("trying to post groups  " + entity.getNumber());
        return service.addEntity(entity);
    }
}
