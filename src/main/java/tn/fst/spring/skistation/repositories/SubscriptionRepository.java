package tn.fst.spring.skistation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.fst.spring.skistation.entities.Subscription;
import tn.fst.spring.skistation.entities.TypeSubscription;

import java.util.Date;
import java.util.List;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

    // Trouver les abonnements actifs à une date donnée
    List<Subscription> findByStartDateBeforeAndEndDateAfter(Date startDate, Date endDate);

    // Trouver les abonnements expirés
    List<Subscription> findByEndDateBefore(Date currentDate);

    // Trouver les abonnements valides après une certaine date
    List<Subscription> findByStartDateAfter(Date startDate);

    // Trouver les abonnements par type
    List<Subscription> findByTypeSub(TypeSubscription typeSub);

    // Trouver les abonnements dans une gamme de prix
    List<Subscription> findByPriceBetween(Float minPrice, Float maxPrice);
}
