package com.kb.fitnesstracker.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Document(collection = "activity")
public class Activity {

    @Id
    protected long _id;
    protected LocalDate date;
    protected ActivityType type;
}
