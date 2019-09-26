package me.study.springwebmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping
    public String event(Model model) {
        model.addAttribute("events", eventService.getEvents());
        return "events";
    }
}
