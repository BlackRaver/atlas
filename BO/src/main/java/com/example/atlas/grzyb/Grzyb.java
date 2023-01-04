package com.example.atlas.grzyb;

import lombok.*;

import javax.persistence.*;
/**
 * Klasa Grzyb pełni role modelu danych znanego równiez jako obiekt pojo.
 * Grzyb przechowuje kluczowe dane potrzebne do funkcjonowania programu.
 *
 * Kożystamy z dependency lombok który ułatwia i przyśpiesza pisanie kodu poprzez udostępnianie własnych dekoratorów.
 *
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name="grzyby")
public class Grzyb {

    @Id
    private long id;
    private String nazwa;
    private String rodzaj;
    private boolean czy_pod_ochrona;
    private boolean czy_trujacy;
    private String wystepowanie;
    private String uwagi;

    public boolean getCzy_pod_ochrona() {
        return this.czy_pod_ochrona;
    }

    public boolean getCzy_trujacy() {
        return this.czy_trujacy;
    }
}
