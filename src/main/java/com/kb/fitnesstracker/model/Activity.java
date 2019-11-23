package com.kb.fitnesstracker.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Document(collection = "activity")
public class Activity {

    @Id
    protected ObjectId _id = new ObjectId();
    protected LocalDate date;
    protected ActivityType type;
}
