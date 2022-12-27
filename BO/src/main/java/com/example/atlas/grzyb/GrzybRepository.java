package com.example.atlas.grzyb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Warstwa logiczno-biznesowa której zadaniem jest przechowywanie logicznej strony funkcjonalności aplikacji.
 **/
@Repository
public interface GrzybRepository extends JpaRepository <Grzyb, Long>{
}
