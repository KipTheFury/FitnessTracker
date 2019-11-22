package com.kb.fitnesstracker.controller;

import com.kb.fitnesstracker.model.Activity;
import com.kb.fitnesstracker.service.ActivityServiceImpl;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller(value = "/api")
@Log4j
public class ApiController {

    @Autowired
    ActivityServiceImpl service;

    @GetMapping
    public Collection<Activity> getAllActivities() {

        log.debug("Getting all activities");
        return service.listAllActivities();
    }
}
