package com.project.repository;

import com.project.model.entities.StudyProgram;
import com.project.model.entities.Subject;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends CrudRepository<Subject, Long> {

	List<Subject> getSubjectsByStudProgramAndMandatory(StudyProgram studProgram, boolean mandatory);

	List<Subject> findByIdIn(List<Long> ids);
	List<Subject> findByNameIn(List<String> subjectNames);

	@Query("select sj from Subject sj where sj.studProgram=:mark")
	List<Subject> getSubjectsByMark(String mark);

	@Query("select distinct sj from Subject sj")
	List<Subject> getSubjects();
}