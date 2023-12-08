package com.example.educationsystempartone;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EnrollmentRepository extends CrudRepository<Enrollment, Integer> {
    List<Enrollment> findByCourseId(Integer id);

    List<Enrollment> findByStudentId(Integer id);

}

