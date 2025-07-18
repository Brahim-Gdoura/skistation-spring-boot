package tn.fst.spring.skistation.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSub;

    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;

    @Column
    private Float price;

    @Enumerated
    private TypeSubscription typeSub;

    @OneToOne(mappedBy = "subscription")
    private Skier skier;
}
