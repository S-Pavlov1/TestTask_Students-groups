package com.testTask.services;

import com.testTask.models.Groups;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.testTask.repositories.GroupsRepository;

import java.util.List;

@Service
public class GroupsService {

    @Autowired
    private GroupsRepository repository;

    public List<Groups> getEntities() {
        return repository.findAll();
    }

    public Groups getEntity (int id) {return repository.getById(id);}

    public Groups addEntity(Groups entity) {
        return repository.save(entity);

    }

}
