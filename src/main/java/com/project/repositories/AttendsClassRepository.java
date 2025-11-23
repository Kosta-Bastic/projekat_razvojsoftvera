package com.project.repositories;

import com.project.model.AttendsClass;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttendsClassRepository extends CrudRepository<AttendsClass, Long> {
    @Query("select ac from AttendsClass ac where ac.studentIndex.id=:studentIndex and ac.studentIndex.active=true")
    List<AttendsClass> findAttendsClassForIndexActive(Long studentIndex);
}