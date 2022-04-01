package com.testTask.repositories;

import com.testTask.models.Students;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public interface StudentsRepository extends JpaRepository <Students, Integer>, JpaSpecificationExecutor<Students> {

    @Query(value = "select * from Students where group_id = ?1", nativeQuery = true)
    public List<Students> findByGroupId (Integer groupId);

}
