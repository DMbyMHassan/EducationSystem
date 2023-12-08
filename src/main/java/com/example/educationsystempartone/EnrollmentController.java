package com.example.educationsystempartone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/enrollment")
public class EnrollmentController {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    @PostMapping("/add")
    public Enrollment addEnrollment(@RequestBody Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    @GetMapping("/list/course/{id}")
    public List<Enrollment> getEnrollmentsByCourse(@PathVariable Integer id) {
        return enrollmentRepository.findByCourseId(id);
    }

    @GetMapping("/list/student/{id}")
    public List<Enrollment> getEnrollmentsByStudent(@PathVariable Integer id) {
        return enrollmentRepository.findByStudentId(id);
    }

    @PutMapping("/modify/{id}")
    public Optional<Enrollment> modifyEnrollment(@PathVariable Integer id, @RequestBody Enrollment updatedEnrollment) {
        Optional<Enrollment> optionalEnrollment = enrollmentRepository.findById(id);

        if (optionalEnrollment.isPresent()) {
            Enrollment existingEnrollment = optionalEnrollment.get();
            existingEnrollment.setCourseId(updatedEnrollment.getCourseId());
            existingEnrollment.setStudentId(updatedEnrollment.getStudentId());
            enrollmentRepository.save(existingEnrollment);
        }

        return optionalEnrollment;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEnrollment(@PathVariable Integer id) {
        enrollmentRepository.deleteById(id);
    }
}
