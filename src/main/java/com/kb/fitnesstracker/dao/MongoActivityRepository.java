package com.kb.fitnesstracker.dao;

import com.kb.fitnesstracker.model.Activity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoActivityRepository extends MongoRepository<Activity, Integer> {
}
