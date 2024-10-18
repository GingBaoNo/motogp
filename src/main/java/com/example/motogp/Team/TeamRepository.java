package com.example.motogp.Team;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

    // Change method to match the field name in Team entity
    Optional<Team> findByTeamName(String teamName);
    
    List<Team> findByCountry(String country);
}