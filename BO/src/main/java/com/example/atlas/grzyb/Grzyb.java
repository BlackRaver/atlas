package com.example.atlas.grzyb;

import lombok.*;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name="grzyby")
public class Grzyb {

    @Id
    @SequenceGenerator(
            name = "grzybSequence",
            sequenceName = "grzybSequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "grzybSequence"
    )
    private int id;
    private String nazwa;
    private boolean czy_pod_ochrona;
    private boolean czy_trujacy;
    private String wystepowanie;
    private String uwagi;
}
