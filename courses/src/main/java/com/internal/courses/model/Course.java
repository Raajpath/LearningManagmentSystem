package com.internal.courses.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "course")
public class Course {

    @Indexed(unique = true)
    private String courseName;
    private LocalTime courseDuration;
    private int hours;
    private int minutes;
    private int seconds;
    private String courseDescription;
    private List<String> technology;
    private String launchUrl;

}
