package com.project.repository;

import com.project.model.entities.EnrollingYear;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnrollingYearRepository extends CrudRepository<EnrollingYear, Integer> {

    @Query("select ey from EnrollingYear ey where ey.index.id = :indexId and ey.retryingYear = true")
    List<EnrollingYear> findRetriedYears(Long indexId);
}
