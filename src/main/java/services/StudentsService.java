package services;

import models.Students;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import repositories.StudentsRepository;

import java.util.List;

@Service
public class StudentsService {

    private StudentsRepository repository;

    public List<Students> getEntities() {
        return repository.findAll();
    }

    public void addEntity(Students entity){
        repository.save(entity);
    }

    public void deleteEntity(int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        }
    }

}
