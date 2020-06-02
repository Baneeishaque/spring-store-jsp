package ndk.banee.spring_jstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ndk.banee.spring_jstore.models.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer>{
	Question[] findBySurveyId(int surveyId);
	Question findByQuestionNumberAndSurveyId(int questionNumber,int surveyId);
}
