package tn.fst.spring.skistation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.fst.spring.skistation.entities.Course;
import tn.fst.spring.skistation.entities.Registration;
import tn.fst.spring.skistation.entities.Skier;

import java.util.List;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
    // Trouver les inscriptions par numéro de semaine
    List<Registration> findByNumWeek(int numWeek);

    // Trouver les inscriptions pour un skieur donné
    List<Registration> findBySkier(Skier skier);

    // Trouver les inscriptions pour un cours donné
    List<Registration> findByCourse(Course course);

    // Trouver les inscriptions pour un skieur et une semaine donnée
    List<Registration> findBySkierAndNumWeek(Skier skier, int numWeek);

    // Trouver les inscriptions pour un cours et une semaine donnée
    List<Registration> findByCourseAndNumWeek(Course course, int numWeek);

}
