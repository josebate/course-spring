package com.in28minutes.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

// Create a simple REST API with the url /courses
// When someone accesses the URL /courses, it should return:
//[
//    {
//      "id": 1,
//      "name": "Learn AWS",
//      "author": "in28minutes"
//    }
//]

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
            new Course(1, "Learn AWS", "in28minutes"),
            new Course(2, "Learn DevOps", "in28minutes"),
            new Course(3, "Learn Azure", "in28minutes"),
            new Course(4, "Learn GCP", "in28minutes")
        );
    }

}
