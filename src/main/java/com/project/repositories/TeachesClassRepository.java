package com.project.repositories;


import com.project.model.TeachesClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachesClassRepository extends CrudRepository<TeachesClass, Long> {
}