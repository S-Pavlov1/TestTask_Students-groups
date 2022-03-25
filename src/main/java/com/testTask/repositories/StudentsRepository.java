package com.testTask.repositories;

import com.testTask.models.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository <Students, Integer>, JpaSpecificationExecutor<Students> {

}
