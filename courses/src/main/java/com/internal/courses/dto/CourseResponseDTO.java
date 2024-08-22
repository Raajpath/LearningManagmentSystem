package com.internal.courses.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CourseResponseDTO {

    private String courseName;
    private String courseDuration; //Return as String in HH:MM:SS format
    private String courseDescription;
    private List<String> technology;
    private String launchUrl;

}
