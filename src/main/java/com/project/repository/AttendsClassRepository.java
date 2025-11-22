package com.project.repository;

import com.project.model.entities.AttendsClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendsClassRepository extends CrudRepository<AttendsClass, Long> {

}