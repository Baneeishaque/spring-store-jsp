package ndk.banee.spring_jstore.controllers;

import ndk.banee.spring_jstore.models.Session;
import ndk.banee.spring_jstore.repository.SessionRepository;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private SessionRepository sessionRepository;

    @GetMapping("/")
    public String showIndexPage(Model model) {

//        List<Session> sessions = sessionRepository.findAll();
//        if (sessions.size() > 0) {
//
//            Session session = sessions.get(0);
//
//            if (Minutes.minutesBetween(session.getLoggedTimeStamp(), DateTime.now()).getMinutes() <= 15) {
//
//                model.addAttribute("session", session);
//            }
//        }
        return "/views/index.jsp";
    }
}
