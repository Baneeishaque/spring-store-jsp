package ndk.banee.spring_jstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ndk.banee.spring_jstore.models.Survey;

public interface SurveyRepository extends JpaRepository<Survey, Integer>{
	
	List<Survey> findByauthorId(int authorId);
	List<Survey> findByAuthorIdAndPublished(int authorId, Boolean published);
 }
