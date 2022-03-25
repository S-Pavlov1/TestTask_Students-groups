package com.testTask.controllers;

import com.testTask.models.Students;
import org.springframework.web.bind.annotation.*;
import com.testTask.services.StudentsService;

import java.util.List;

@RestController
@RequestMapping("/Students")
public class StudentsController {

    private StudentsService service;

    @GetMapping
    public List<Students> getEntities() {
        return service.getEntities();
    }

    @PostMapping
    public void addEntity(@RequestBody Students entity){
        service.addEntity(entity);
    }

    @DeleteMapping("/{id}")
    public void deleteEntity(@PathVariable int id) {
        service.deleteEntity(id);
    }
}