package com.project.repositories;

import com.project.model.StudyProgram;
import com.project.model.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends CrudRepository<Subject, Long> {

	List<Subject> getPredmetsByStudProgramAndObavezan(StudyProgram studProgram, boolean obavezan);

	List<Subject> findByIdIn(List<Long> ids);
	List<Subject> findByNazivIn(List<String> nazivi);
}