package com.kb.fitnesstracker.service;

import com.kb.fitnesstracker.model.Activity;

import java.util.Collection;

public interface ActivityService {

    Collection<Activity> listAllActivities();

    void addActivity(Activity a);
}
