package tn.fst.spring.skistation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.fst.spring.skistation.entities.Course;
import tn.fst.spring.skistation.entities.Support;
import tn.fst.spring.skistation.entities.TypeCourse;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    // Trouver un cours par son type
    List<Course> findByTypeCourse(TypeCourse typeCourse);

    // Trouver un cours par son niveau
    List<Course> findByLevel(int level);

    // Trouver un cours par support
    List<Course> findBySupport(Support support);

    // Trouver les cours dont le prix est supérieur ou égal à un montant donné
    List<Course> findByPriceGreaterThanEqual(Float price);

    // Trouver les cours dans une plage de prix
    List<Course> findByPriceBetween(Float minPrice, Float maxPrice);

    // Trouver les cours par créneau horaire
    List<Course> findByTimeSlot(int timeSlot);

    // Requête personnalisée pour récupérer les cours d'un niveau donné et d'un type spécifique
    @Query("SELECT c FROM Course c WHERE c.level = :level AND c.typeCourse = :typeCourse")
    List<Course> findByLevelAndType(@Param("level") int level, @Param("typeCourse") TypeCourse typeCourse);

    // Requête personnalisée pour récupérer les cours ayant un prix inférieur à une valeur donnée
    @Query("SELECT c FROM Course c WHERE c.price < :maxPrice")
    List<Course> findByPriceLessThan(@Param("maxPrice") Float maxPrice);
}
