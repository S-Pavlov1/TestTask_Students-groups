package com.testTask.controllers;

import com.testTask.DTO.StudentsDto;
import com.testTask.Mapper.StudentsMapper;
import com.testTask.models.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.testTask.services.StudentsService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/Students")
public class StudentsController {


    private final StudentsMapper mapper;

    @Autowired
    private final StudentsService service;

    public StudentsController(StudentsMapper mapper, StudentsService service) {
        this.mapper = mapper;
        this.service = service;
    }

    @GetMapping
    public List<Students> getEntities() {
        return service.getEntities();
    }

    @PostMapping
    public void addEntity(@RequestBody StudentsDto dto){
        Students entity = mapper.toEntity(dto);
        System.out.println(entity.getFullName() + "  " +
                entity.getAcceptanceDate() + "  " +
                entity.getGroup());
        service.addEntity(entity);
    }

    @DeleteMapping("/{id}")
    public void deleteEntity(@PathVariable int id) {
        service.deleteEntity(id);
    }

    @GetMapping("/byGroup")
    public List<Students> getByGroup (@RequestParam Integer groupId) {
        System.out.println(groupId);
        return service.getStudentsByGroup(groupId);
    }
}
