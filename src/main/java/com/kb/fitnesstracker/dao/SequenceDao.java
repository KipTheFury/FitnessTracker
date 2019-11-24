package com.kb.fitnesstracker.dao;

import com.kb.fitnesstracker.exception.SequenceException;

public interface SequenceDao {

    long getNextSequenceId(String key) throws SequenceException;
}
