package services;

import models.Groups;
import org.springframework.stereotype.Service;
import repositories.GroupsRepository;

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
