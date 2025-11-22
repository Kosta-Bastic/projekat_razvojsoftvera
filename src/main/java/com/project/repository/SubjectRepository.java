package com.project.repository;

import com.project.model.entities.StudyProgram;
import com.project.model.entities.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends CrudRepository<Subject, Long> {

	List<Subject> getPredmetsByStudProgramAndObavezan(StudyProgram studProgram, boolean obavezan);

	List<Subject> findByIdIn(List<Long> ids);
	List<Subject> findByNazivIn(List<String> nazivi);
}