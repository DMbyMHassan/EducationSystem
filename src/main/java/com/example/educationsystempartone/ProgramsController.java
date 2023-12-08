package com.example.educationsystempartone;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/program")
public class ProgramsController {

    @Autowired
    private ProgramsRepository programsRepository;


    @PostMapping("/add")
    public Programs addProgram(@RequestBody Programs programs) {
        return programsRepository.save(programs);
    }

    @GetMapping("/list")
    public List<Programs> getAllPrograms() {
        return (List<Programs>) programsRepository.findAll();
    }

    @GetMapping("/view/{id}")
    public Optional<Programs> getProgramByPid(@PathVariable Integer id) {
        return programsRepository.findById(id);
    }

    @PutMapping("/modify/{id}")
    public Optional<Programs> modifyProgram(@PathVariable Integer id, @RequestBody Programs updatedPrograms) {
        Optional<Programs> optionalPrograms = programsRepository.findById(id);

        if (optionalPrograms.isPresent()) {
            Programs existingPrograms = optionalPrograms.get();
            existingPrograms.setProgramName(updatedPrograms.getProgramName());
            existingPrograms.setCampus(updatedPrograms.getCampus());
            programsRepository.save(existingPrograms);
        }

        return optionalPrograms;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProgram(@PathVariable Integer id) {
        programsRepository.deleteById(id);
    }
}
