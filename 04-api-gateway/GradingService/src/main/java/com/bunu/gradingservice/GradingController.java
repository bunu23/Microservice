package com.bunu.gradingservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradingController {

    @GetMapping("/grade/{studentid}/{courseid}")
    public String getGrade(@PathVariable ("studentid") String studentId,
    @PathVariable("courseid")String courseId){
        return "A+";
    }
}
