package tn.fst.spring.skistation.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.fst.spring.skistation.repositories.InstructorRepository;
import tn.fst.spring.skistation.entities.Instructor;

import java.util.List;

@Service
@Slf4j
public class InstructorServiceImpl implements IInstructorService {

    @Autowired
    private InstructorRepository instructorRepository;

    @Override
    public List<Instructor> retrieveAllInstructors() {
        return instructorRepository.findAll();
    }

    @Override
    public Instructor addOrUpdateInstructor(Instructor instructor) {
        log.info("Adding/Updating instructor: " + instructor.toString());
        return instructorRepository.save(instructor);
    }

    @Override
    public void removeInstructor(Long numInstructor) {
        instructorRepository.deleteById(numInstructor);
    }

    @Override
    public Instructor retrieveInstructor(Long numInstructor) {
        return instructorRepository.findById(numInstructor).orElse(null);
    }
}
