package com.kb.fitnesstracker.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "activity")
public class Run extends Activity {

    public Run() {
        super();
        this.type = ActivityType.RUN;
    }
}
