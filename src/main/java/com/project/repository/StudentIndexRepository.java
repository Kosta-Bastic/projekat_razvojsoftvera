package com.project.repository;

import com.project.model.entities.StudentIndex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentIndexRepository extends JpaRepository<StudentIndex, Long> {
	
	@Query("select si from StudentIndex si where si.student.id = :idStudentData")
	List<StudentIndex> findStudentIndexForStudentDataId(Long idStudentData);

	@Query("select si from StudentIndex si where si.student.id = :idStudentData and si.active = true")
	StudentIndex findActiveStudentIndexesByStudentDataId(Long idStudentData);
}