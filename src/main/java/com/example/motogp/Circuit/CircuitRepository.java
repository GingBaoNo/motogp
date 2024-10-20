package com.example.motogp.Circuit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CircuitRepository extends JpaRepository<Circuit, Integer> {
    // Additional query methods can be defined here if needed
}