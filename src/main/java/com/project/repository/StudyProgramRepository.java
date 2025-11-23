package com.project.repository;


import com.project.model.entities.StudyProgram;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudyProgramRepository extends CrudRepository<StudyProgram, Long> {
	
	@Query("select distinct oznaka from StudyProgram ")
    List<String> findAllOznaka();
	
	@Query("select sp from StudyProgram sp order by sp.godinaAkreditacije desc")
	List<StudyProgram> getAllSortedByGodinaDesc();
}