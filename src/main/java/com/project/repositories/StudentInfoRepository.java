package com.project.repositories;

import com.project.model.StudentIndex;
import com.project.model.StudentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentInfoRepository extends JpaRepository<StudentInfo, Long> {	//	nasljedjene implementacije poput findById i findByAll
	
	@Query("select si from StudentIndex si where si.active=true and si.student.id = :studPodaciId")
	StudentIndex getAktivanIndeks(Long studPodaciId);
	
	@Query("select si from StudentIndekx si where si.akctive=false and si.student.id = :studPodaciId")
	List<StudentIndex> getNeaktivniIndeksi(Long studPodaciId);
}