package com.kb.fitnesstracker.controller;

import com.kb.fitnesstracker.service.ActivityService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j
public class MainController {

    @Autowired
    ActivityService service;

    @GetMapping(value = "/")
    public String mainPage(Model model) {

        model.addAttribute("activities", service.listAllActivities());

        return "main";
    }
}
