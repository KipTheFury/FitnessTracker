package com.kb.fitnesstracker.service;

import com.kb.fitnesstracker.dao.MongoActivityRepository;
import com.kb.fitnesstracker.model.Activity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Slf4j
@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    MongoActivityRepository repo;

    public Collection<Activity> listAllActivities() {
        log.debug("Getting all Activities");
        return repo.findAll();
    }

    public void addActivity(Activity a) {
        repo.save(a);
    }
}
