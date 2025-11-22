package com.project.repository;

import com.project.model.entities.StudentIndex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentIndexRepository extends JpaRepository<StudentIndex, Long> {
	
	@Query("select si from StudentIndex si where si.student.id = :idStudentPodaci")
	List<StudentIndex> findStudentIndeksiForStudentPodaciId(Long idStudentPodaci);

	@Query("select si from StudentIndex si where si.student.id = :idStudentPodaci and si.aktivan = true")
	StudentIndex findAktivanStudentIndeksiByStudentPodaciId(Long idStudentPodaci);
}