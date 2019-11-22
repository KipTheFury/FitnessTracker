package com.kb.fitnesstracker.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Builder
@Document(collection = "activity")
public class Activity {

    @Id
    private int _id;
    private LocalDate date;
}
