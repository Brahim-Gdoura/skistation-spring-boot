package tn.fst.spring.skistation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long numPiste;

    @Column
    private String namePiste;

    @Enumerated
    @Column
    private Color color;

    @Column
    private int length;

    @Column
    private int slope;

    @ManyToMany
    @JoinTable(
            name = "piste_skier",
            joinColumns = @JoinColumn(name = "piste_id"),
            inverseJoinColumns = @JoinColumn(name = "skier_id")
    )
    private Set<Skier> skiers;
}

