package tn.fst.spring.skistation.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
public class Skier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkier;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Temporal(TemporalType.DATE)
    @Column
    private Date dateOfBirth;

    @Column
    private String city;

    @ManyToMany(mappedBy = "skiers")
    private Set<Piste> pistes;

    @OneToMany(mappedBy = "skier")
    private Set<Registration> registrations;

    @OneToOne
    @JoinColumn(name = "Subscription_id")
    private Subscription subscription;
}
