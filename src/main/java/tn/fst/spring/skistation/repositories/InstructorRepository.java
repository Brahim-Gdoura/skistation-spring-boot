package tn.fst.spring.skistation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.fst.spring.skistation.entities.Instructor;

import java.util.Date;
import java.util.List;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {

    // Trouver un instructeur par son prénom
    List<Instructor> findByFirstName(String firstName);

    // Trouver un instructeur par son nom de famille
    List<Instructor> findByLastName(String lastName);

    // Trouver les instructeurs embauchés après une certaine date
    List<Instructor> findByDateOfHireAfter(Date date);

    // Trouver les instructeurs embauchés avant une certaine date
    List<Instructor> findByDateOfHireBefore(Date date);

}
