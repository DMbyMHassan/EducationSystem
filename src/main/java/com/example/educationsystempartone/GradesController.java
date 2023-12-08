package com.example.educationsystempartone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/grades")
public class GradesController {

    @Autowired
    private GradesRepository gradesRepository;

    @PostMapping("/add")
    public Grades addGrade(@RequestBody Grades grade) {
        return gradesRepository.save(grade);
    }

    @GetMapping("/list/student/{id}")
    public List<Grades> getGradesByStudent(@PathVariable Integer id) {
        return gradesRepository.findByStudentId(id);
    }

    @GetMapping("/list/course/{id}")
    public List<Grades> getGradesByCourse(@PathVariable Integer id) {
        return gradesRepository.findByCourseId(id);
    }

    @PutMapping("/modify/{id}")
    public Optional<Grades> modifyGrade(@PathVariable Integer id, @RequestBody Grades updatedGrade) {
        Optional<Grades> optionalGrade = gradesRepository.findById(id);

        if (optionalGrade.isPresent()) {
            Grades existingGrade = optionalGrade.get();
            existingGrade.setStudentId(updatedGrade.getStudentId());
            existingGrade.setCourseId(updatedGrade.getCourseId());
            existingGrade.setGrade(updatedGrade.getGrade());
            gradesRepository.save(existingGrade);
        }

        return optionalGrade;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteGrade(@PathVariable Integer id) {
        gradesRepository.deleteById(id);
    }
}
