package com.testTask.services;

import com.testTask.models.Groups;
import org.springframework.stereotype.Service;
import com.testTask.repositories.GroupsRepository;

import java.util.List;

@Service
public class GroupsService {

    private GroupsRepository repository;

    public List<Groups> getEntities() {
        return repository.findAll();
    }

    public void addEntity(Groups entity) {
        repository.save(entity);
    }

}
