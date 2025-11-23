package com.project.repository;


import com.project.model.entities.StudyProgram;
import com.project.model.entities.Subject;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudyProgramRepository extends CrudRepository<StudyProgram, Long> {
	
	@Query("select distinct mark from StudyProgram ")
    List<String> findAllMarks();
	
	@Query("select sp from StudyProgram sp order by sp.yearOfAccreditation desc")
	List<StudyProgram> getAllSortedByYearDesc();

	@Query("select sj from Subject sj where sj.studProgram=:mark")
	List<Subject> getSubjectsByMark(String mark);
}