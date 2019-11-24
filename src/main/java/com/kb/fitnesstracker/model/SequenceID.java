package com.kb.fitnesstracker.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "sequence")
public class SequenceID {

    @Id
    private String id;
    private long seq;
}
