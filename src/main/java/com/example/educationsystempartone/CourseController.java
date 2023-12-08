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

    @PutMapping("/modify/{id}")
    public Optional<Course> modifyCourse(@PathVariable Integer id, @RequestBody Course updatedCourse) {
        Optional<Course> optionalCourse = courseRepository.findById(id);

        if (optionalCourse.isPresent()) {
            Course existingCourse = optionalCourse.get();
            existingCourse.setCourseName(updatedCourse.getCourseName());
            existingCourse.setCourseNumber(updatedCourse.getCourseNumber());
            existingCourse.setCapacity(updatedCourse.getCapacity());
            existingCourse.setYear(updatedCourse.getYear());
            existingCourse.setSemester(updatedCourse.getSemester());
            existingCourse.setPid(updatedCourse.getPid());
            courseRepository.save(existingCourse);
        }

        return optionalCourse;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCourse(@PathVariable Integer id) {
        courseRepository.deleteById(id);
    }
}

