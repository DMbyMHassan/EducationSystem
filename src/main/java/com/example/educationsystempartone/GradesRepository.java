package com.example.educationsystempartone;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
public interface GradesRepository extends CrudRepository<Grades, Integer> {
    List<Grades> findByStudentId(Integer id);

    List<Grades> findByCourseId(Integer id);
}

