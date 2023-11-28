package com.example.educationsystempartone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @PostMapping("/add")
    public Course addCourse(@RequestBody Course course) {
        return courseRepository.save(course);
    }

    @GetMapping("/list")
    public List<Course> getAllCourses() {
        return (List<Course>) courseRepository.findAll();
    }

    @GetMapping("/view/{id}")
    public Optional<Course> getCourseById(@PathVariable Integer id) {
        return courseRepository.findById(id);
    }
}
