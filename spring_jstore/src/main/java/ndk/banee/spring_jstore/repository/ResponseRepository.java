package ndk.banee.spring_jstore.repository;
import ndk.banee.spring_jstore.models.Response;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponseRepository extends JpaRepository<Response,Integer>{
	List<Response> findByUserIdAndSurveyId(int userId, int surveyId);
}
