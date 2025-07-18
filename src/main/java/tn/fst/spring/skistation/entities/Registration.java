package tn.fst.spring.skistation.entities;

import jakarta.persistence.*;

@Entity
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numRegistration;

    @Column
    private int numWeek;

    @ManyToOne
    @JoinColumn(name = "skier_id")
    private Skier skier;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}
