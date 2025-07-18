package tn.fst.spring.skistation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.fst.spring.skistation.entities.Color;
import tn.fst.spring.skistation.entities.Piste;

import java.util.List;

@Repository
public interface PisteRepository extends JpaRepository<Piste, Long> {

// Piste findByColorAndSlope(Color color, int slope)
    Piste findByColorAndSlope(Color color, int slope);

    Piste findByNamePiste(String namePiste);

    List<Piste> findByColor(Color color);

    List<Piste> findByLength(int length);

    // List<Piste> findBySkiers(List<Skier> skiers);

    List<Piste> findBySlope(int slope);

    @Query("SELECT p FROM Piste p JOIN p.skiers s WHERE s.numSkier = :numSkier")
    List<Piste> findBySkier(@Param("numSkier") Long numSkier);

    @Query("SELECT p FROM Piste p WHERE p. length >= :minLength AND p.length <= :maxLength")
    List<Piste> findByLengthRange(@Param("minLength") int minLength, @Param("maxLength") int maxLength);
}
