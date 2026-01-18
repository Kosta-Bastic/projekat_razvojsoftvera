package com.project.repository;


import com.project.model.entities.TeachesClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachesClassRepository extends CrudRepository<TeachesClass, Long> {
}