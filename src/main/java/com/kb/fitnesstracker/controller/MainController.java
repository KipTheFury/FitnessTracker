package com.kb.fitnesstracker.controller;

import com.kb.fitnesstracker.model.Run;
import com.kb.fitnesstracker.service.ActivityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
@Slf4j
public class MainController {

    @Autowired
    ActivityService service;

    @GetMapping(value = "/")
    public String mainPage(Model model) {

        Run r = new Run();
        r.setDate(LocalDate.now());
        service.addActivity(r);

        model.addAttribute("activities", service.listAllActivities());
        return "main";
    }
}
