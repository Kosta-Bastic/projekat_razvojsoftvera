package com.project.repository;

import com.project.model.entities.StudentIndex;
import com.project.model.entities.StudentInfo;
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

	@Query("select si from StudentInfo si where (si.firstName=:firstName or :firstName=NULL ) and (si.lastName=:lastName or :firstName=NULL) order by si.firstName,si.lastName desc")
	List<StudentInfo> findByName(String firstName, String lastName);

	@Query("select si from StudentInfo si where si.highSchool=:highschool")
	List<StudentInfo> findByHighSchool(String highschool);
}