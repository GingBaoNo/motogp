package com.example.motogp.Standing;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StandingRepository extends JpaRepository<Standing, Integer> {
    // Tìm điểm của một rider theo rider_id
    List<Standing> findByRiderId(Integer riderId);

}