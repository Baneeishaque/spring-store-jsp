package ndk.banee.spring_jstore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ndk.banee.spring_jstore.models.Question;
import ndk.banee.spring_jstore.models.Response;
import ndk.banee.spring_jstore.models.Survey;
import ndk.banee.spring_jstore.repository.QuestionRepository;
import ndk.banee.spring_jstore.repository.ResponseRepository;
import ndk.banee.spring_jstore.repository.SurveyRepository;
import ndk.banee.spring_jstore.repository.UserRepository;

@Controller
public class ResponseController {

	@Autowired
	private ResponseRepository responseRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private SurveyRepository surveyRepository;

	@Autowired
	private QuestionRepository questionRepository;

	@PostMapping(value = "/regResponse")
	public String registerResponse(@RequestParam("userId") int userId,
			@RequestParam(value = "optionNo", required = false) String optionNo,
			@RequestParam(value = "optioncheck0", required = false) String optioncheck0,
			@RequestParam(value = "optioncheck1", required = false) String optioncheck1,
			@RequestParam(value = "optioncheck2", required = false) String optioncheck2,
			@RequestParam(value = "optioncheck3", required = false) String optioncheck3,
			@RequestParam(value = "optioncheck4", required = false) String optioncheck4,
			@RequestParam("questionNo") int questionNo, @RequestParam("surveyId") int surveyId, Model m) {
		// getting check box value
		// System.out.println(optioncheck0);
		StringBuffer checkboxStr = new StringBuffer();
		if (optioncheck0 != null) {
			checkboxStr.append(optioncheck0 + ",");
		}
		if (optioncheck1 != null) {
			checkboxStr.append(optioncheck1 + ",");
		}
		if (optioncheck2 != null) {
			checkboxStr.append(optioncheck2 + ",");
		}
		if (optioncheck3 != null) {
			checkboxStr.append(optioncheck3 + ",");
		}
		if (optioncheck4 != null) {
			checkboxStr.append(optioncheck4);
		}

		// check box selected options are converted into a string
		String optionCheckNo = checkboxStr.toString();
		// System.out.println(checkboxStr);

		// create new response object
		// and save it in database
		Response response = new Response();
		if (optionNo == null) {
			response.setOptionNo(optionCheckNo);
		} else if (optionNo != null) {
			response.setOptionNo(optionNo);
		}
		response.setQuestionId(questionNo);
		response.setSurveyId(surveyId);
		response.setUserId(userId);
		responseRepository.save(response);

		// TODO: avoid fetching survey details everytime if possible
		Survey surveym = surveyRepository.findById(surveyId).get();
		m.addAttribute("surveyInfo", surveym);

		Question questionnum = questionRepository.findByQuestionNumberAndSurveyId(questionNo + 1, surveyId);
		// int questionnm=question_Id.getQuestionNumber();
		m.addAttribute("question", questionnum);
		System.out.println(
				" surveyId in REsponseController" + surveyId + "\n quesyionnumber in regresponse" + questionNo + 1);
		return "/views/response.jsp";
		// return "saved";
		// return "/question?survey="+surveyId+"&q="+(questionId+1);

		// Question question =questionRepository.findById(questionId).get();
		// m.addAttribute("question", question);
		// return "/views/response.jsp";
	}

	// Mapping for survey completed page
	@RequestMapping(value = "/survey_completed")
	public String Completed() {
		return "/views/survey_completed.jsp";
	}

}
