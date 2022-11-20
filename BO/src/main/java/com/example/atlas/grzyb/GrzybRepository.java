package com.example.atlas.grzyb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrzybRepository extends JpaRepository <Grzyb, Long>{
}
