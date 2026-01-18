package com.project.repository;

import com.project.model.entities.StudentIndex;
import com.project.model.entities.StudentInfo;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentInfoRepository extends JpaRepository<StudentInfo, Long> {	//	nasljedjene implementacije poput findById i findByAll
	
	@Query("select si from StudentIndex si where si.active=true and si.student.id = :studDataId")
	StudentIndex getActiveIndex(Long studDataId);
	
	@Query("select si from StudentIndex si where si.active=false and si.student.id = :studDataId")
	List<StudentIndex> getInactiveIndex(Long studDataId);

	@Query(value="select si from StudentInfo si where (lower(si.firstName)=:firstName or :firstName=NULL ) and (lower(si.lastName)=:lastName or :lastName=NULL)",
	countQuery = "select count(*) from StudentInfo si where (lower(si.firstName)=:firstName or :firstName=NULL ) and (lower(si.lastName)=:lastName or :firstName=NULL)",
	nativeQuery = true)
	List<StudentInfo> findByName(String firstName, String lastName, Pageable pageable);

	@Query("select si from StudentInfo si where si.highSchool=:highschool")
	List<StudentInfo> findByHighSchool(String highschool);
}