package com.kb.fitnesstracker.service;

import com.kb.fitnesstracker.dao.MongoActivityRepository;
import com.kb.fitnesstracker.model.Activity;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Log4j
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    MongoActivityRepository repo;

    public Collection<Activity> listAllActivities() {

        log.debug("List All Activities");
        return repo.findAll();
    }

    public void addActivity(Activity a) {
        repo.save(a);
    }
}
