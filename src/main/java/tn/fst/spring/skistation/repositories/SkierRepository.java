package tn.fst.spring.skistation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.fst.spring.skistation.entities.Skier;

import java.util.Date;
import java.util.List;

public interface SkierRepository extends JpaRepository<Skier, Long> {

    // Trouver un skieur par prénom
    List<Skier> findByFirstName(String firstName);

    // Trouver un skieur par nom de famille
    List<Skier> findByLastName(String lastName);

    // Trouver un skieur par ville
    List<Skier> findByCity(String city);

    // Trouver les skieurs nés après une certaine date
    List<Skier> findByDateOfBirthAfter(Date date);

    // Trouver les skieurs nés avant une certaine date
    List<Skier> findByDateOfBirthBefore(Date date);

    // Trouver les skieurs dont la date de naissance est comprise entre deux dates
    List<Skier> findByDateOfBirthBetween(Date startDate, Date endDate);

    // Trouver les skieurs ayant un abonnement
    List<Skier> findBySubscriptionIsNotNull();
}
