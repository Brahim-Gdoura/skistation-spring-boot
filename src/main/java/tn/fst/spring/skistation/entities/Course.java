package tn.fst.spring.skistation.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCourse;

    @Column
    private int level;

    @Enumerated
    private TypeCourse typeCourse;

    @Enumerated
    private Support support;

    @Column
    private Float price;

    @Column
    private int timeSlot;

    @OneToMany(mappedBy = "course")
    private Set<Registration> registrations;
}
