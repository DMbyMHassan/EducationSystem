package com.example.educationsystempartone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @GetMapping("/list")
    public List<Student> getAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    @GetMapping("/view/{id}")
    public Optional<Student> getStudentById(@PathVariable Integer id) {
        return studentRepository.findById(id);
    }
    @PutMapping("/modify/{id}")
    public Optional<Student> modifyStudent(@PathVariable Integer id, @RequestBody Student updatedStudent) {
        Optional<Student> optionalStudent = studentRepository.findById(id);

        if (optionalStudent.isPresent()) {
            Student existingStudent = optionalStudent.get();
            existingStudent.setFirstName(updatedStudent.getFirstName());
            existingStudent.setLastName(updatedStudent.getLastName());
            existingStudent.setEmail(updatedStudent.getEmail());
            existingStudent.setAddress(updatedStudent.getAddress());
            existingStudent.setCity(updatedStudent.getCity());
            existingStudent.setPostal(updatedStudent.getPostal());
            existingStudent.setPhone(updatedStudent.getPhone());
            studentRepository.save(existingStudent);
        }
        return optionalStudent;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        studentRepository.deleteById(id);
    }
}
