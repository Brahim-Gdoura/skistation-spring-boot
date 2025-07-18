package tn.fst.spring.skistation.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numInstructor;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Temporal(TemporalType.DATE)
    private Date dateOfHire;

    @OneToMany
    private Set<Course> cources;


}
